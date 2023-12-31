
package models;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Table {
    private boolean[] forks;
    
    public Table(int numForks){
        this.forks = new boolean[numForks]; //default boolean = false
    }
    
    public int leftFork(int i){
       return i;
    }
    
    public int rightFork(int i){
       if(i == 0){
           return this.forks.length - 1;
       }
       else {
           return i - 1;
       }
    }
    
    public synchronized void takeForks(int guest, Philosopher phil){
        while(forks[leftFork(guest)] || forks[rightFork(guest)]){
            try { // If the forks aren't free, guest must wait
                phil.setStateFlag("waiting");
                phil.controller.updateTxtArea(guest);
                phil.controller.updateGUIStates(guest); //Update GUI
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Table.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        forks[leftFork(guest)] = true;
        phil.controller.updateForkInfoTxtArea(guest, leftFork(guest) + 1, "Take");
        
        forks[rightFork(guest)] = true;
        phil.controller.updateForkInfoTxtArea(guest, rightFork(guest) + 1, "Take" );
    }
    
    public synchronized void leaveForks(int guest, Philosopher phil){
        forks[leftFork(guest)] = false;
        phil.controller.updateForkInfoTxtArea(guest, leftFork(guest) + 1, "Release" );
        
        forks[rightFork(guest)] = false;
        phil.controller.updateForkInfoTxtArea(guest, rightFork(guest) + 1, "Release" );
        
        notifyAll();
    }
}

