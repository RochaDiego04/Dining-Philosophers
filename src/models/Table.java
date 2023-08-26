
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
    
    public synchronized void takeForks(int guest){
        while(forks[leftFork(guest)] || forks[rightFork(guest)]){
            try { // If the forks aren't free, guest must wait
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Table.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        forks[leftFork(guest)] = true;
        forks[rightFork(guest)] = true;
    }
    
    public synchronized void leaveForks(int guest){
        forks[leftFork(guest)] = false;
        forks[rightFork(guest)] = false;
        notifyAll();
    }
}

