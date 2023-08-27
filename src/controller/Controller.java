
package controller;

import java.awt.event.ActionEvent;
import models.Philosopher;
import models.Table;
import view.MainView;
import java.awt.event.ActionListener;

/**
 *
 * @author Diego
 */
public class Controller implements ActionListener{
    
    private MainView view;
    private Table table = new Table(5);
    private Philosopher[] philosophers;
    private boolean philosopherThreadsCreated = false;
    
    public Controller(MainView view, Table table){
        this.view = view;
        this.table = table;
        this.view.btn_start.addActionListener(this);
    }
    
    public void start(){
        view.setTitle("Dining-philosophers");
        view.setLocationRelativeTo(null);
    }
    
    public void actionPerformed(ActionEvent e){
        if (!philosopherThreadsCreated) {
            createPhilosophers();
            philosopherThreadsCreated = true;
        }
        
        for (Philosopher philosopher : philosophers) { // Initialize every Philosopher thread
            if (!philosopher.isAlive()) { // Check if the thread is not already running
                philosopher.start();
            }
        }
    }
    
    public void createPhilosophers() {
        philosophers = new Philosopher[5];
        
        for (int i = 0; i < philosophers.length; i++) {
            philosophers[i] = new Philosopher(table, i + 1); //Philosophers must be created from 1-5, not 0-4
        }
    }
    
}
