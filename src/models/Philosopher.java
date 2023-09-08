
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
    
    public Philosopher(Table table, int guest, Controller controller){
        this.table = table;
        this.guest = guest;
        this.guestIndex = guest - 1;
        this.stateFlag = "sleeping";
        this.controller = controller;
    }
    
    public void run(){
        this.sleeping();
        while(true){
            this.thinking();
            this.waiting();// If guest can't take forks, have to wait for them to be avaliable
            this.eating();
            System.out.println("Philosopher " + guest + " stops eating");
            
            System.out.println("Avaliable forks: " + 
                  (this.table.leftFork(this.guestIndex) + 1) + " & " +
                  (this.table.rightFork(this.guestIndex) + 1));
            this.table.leaveForks(this.guestIndex, this);
        }
    }
    
    public void thinking(){
        System.out.println("Philosopher " + guest + " is thinking");
        setStateFlag("thinking");
        controller.updateTxtArea(guestIndex);
        controller.updateGUIStates(guestIndex);
        try {
            sleep((long) (Math.random() * 4000));
        } catch (InterruptedException ex) {
            Logger.getLogger(Philosopher.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void waiting(){
        this.table.takeForks(this.guestIndex, this);
        //System.out.println("Taken forks: " + 
                //(this.table.leftFork(this.guestIndex) + 1) + " & " +
                //(this.table.rightFork(this.guestIndex) + 1));
    }
    
    public void eating(){
        System.out.println("Philosopher " + guest + " is eating");
        setStateFlag("eating");
        controller.updateTxtArea(guestIndex);
        controller.updateGUIStates(guestIndex);
        try {
            sleep((long) (Math.random() * 4000));
        } catch (InterruptedException ex) {
            Logger.getLogger(Philosopher.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void sleeping(){
        System.out.println("Philosopher " + guest + " is sleeping");
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
