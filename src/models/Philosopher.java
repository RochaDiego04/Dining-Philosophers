
package models;

import controller.Controller;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Philosopher extends Thread {
    private Table table;
    private int guest;
    private int guestIndex;
    public Controller controller;
    
    private String stateFlag;
    private boolean paused = false;
    
    private int progressEating = 0;
    private int progressThinking = 0;
    
    public Philosopher(Table table, int guest, Controller controller){
        this.table = table;
        this.guest = guest;
        this.guestIndex = guest - 1;
        this.stateFlag = "sleeping";
        this.controller = controller;
    }
    
    public void run() {
        this.sleeping();
        
        while (true) {
            
            while (paused) {
                synchronized (this) {
                    try {
                        this.wait(); 
                    } catch (InterruptedException ex) {

                    }
                }
            }
            this.thinking();
            this.waiting();
            this.eating();
            this.table.leaveForks(this.guestIndex, this);
            
            if(this.paused){
                setStateFlag("sleeping");
                controller.updateTxtArea(guestIndex);
                controller.updateGUIStates(guestIndex);
            }
        }
    }
    
    public void pauseThread() {
        paused = true; 
    }

    public void resumeThread() {
        synchronized (this) {
            paused = false; 
            this.notify();
        }
    }
    
    public void thinking(){
        setStateFlag("thinking");
        controller.updateTxtArea(guestIndex);
        controller.updateGUIStates(guestIndex);
        
        for (int i = 0; i < 4; i++) { // Split time sleep to 4 parts, progress bar intervals of 25%
            try {
                this.progressThinking += 25;
                controller.updateProgressBars("thinking", guestIndex, progressThinking); 
                sleep((long) ((Math.random() * 4000) / 4)); // Sleep for 25% of the total time
            } catch (InterruptedException ex) {
                Logger.getLogger(Philosopher.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        this.progressThinking = 0;
        controller.updateProgressBars("thinking", guestIndex, progressThinking);
    }
    
    public void waiting(){
        this.table.takeForks(this.guestIndex, this);
    }
    
    public void eating(){
        setStateFlag("eating");
        controller.updateTxtArea(guestIndex);
        controller.updateGUIStates(guestIndex);
        
        for (int i = 0; i < 4; i++) { // Split time sleep to 4 parts, progress bar intervals of 25%
            try {
                this.progressEating += 25;
                controller.updateProgressBars("eating", guestIndex, progressEating); 
                sleep((long) ((Math.random() * 4000) / 4)); // Sleep for 25% of the total time
            } catch (InterruptedException ex) {
                Logger.getLogger(Philosopher.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        this.progressEating = 0;
        controller.updateProgressBars("eating", guestIndex, progressEating);
    }
    
    public void sleeping(){
        controller.updateTxtArea(guestIndex);
        controller.updateGUIStates(guestIndex);
        try {
            sleep((long) (Math.random() * 2000));
        } catch (InterruptedException ex) {
            Logger.getLogger(Philosopher.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setStateFlag(String stateFlag) {
        this.stateFlag = stateFlag;
    }
    
    public String getStateFlag() {
        return stateFlag;
    }
}
