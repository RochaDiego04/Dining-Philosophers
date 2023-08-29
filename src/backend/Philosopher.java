
package backend;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Philosopher extends Thread {
    private Table table;
    private int guest;
    private int guestIndex;
    
    public Philosopher(Table table, int guest){
        this.table = table;
        this.guest = guest;
        this.guestIndex = guest - 1;
    }
    
    public void run(){
        while(true){
            this.thinking();
            this.table.takeForks(this.guestIndex); // If guest can't take forks, have to wait for them to be avaliable
            System.out.println("Taken forks: " + 
                    (this.table.leftFork(this.guestIndex) + 1) + " & " +
                    (this.table.rightFork(this.guestIndex) + 1));
            this.eating();
            System.out.println("Philosopher" + guest + "stops eating");
            System.out.println("Avaliable forks: " + 
                    (this.table.leftFork(this.guestIndex) + 1) + " & " +
                    (this.table.rightFork(this.guestIndex) + 1));
            this.table.leaveForks(this.guestIndex);
        }
    }
    
    public void thinking(){
        System.out.println("Philosopher" + guest + "is thinking");
        try {
            sleep((long) (Math.random() * 4000));
        } catch (InterruptedException ex) {
            Logger.getLogger(Philosopher.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eating(){
        System.out.println("Philosopher" + guest + "is eating");
        try {
            sleep((long) (Math.random() * 4000));
        } catch (InterruptedException ex) {
            Logger.getLogger(Philosopher.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
