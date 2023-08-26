
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
    
    public Controller(MainView view, Table table){
        this.view = view;
        this.table = table;
        this.philosophers = new Philosopher[5];
        
        for (int i = 0; i < philosophers.length; i++) { // Create all the philosophers
            this.philosophers[i] = new Philosopher(table, i); // Assign each one a table and index
        }
        
        this.view.btn_start.addActionListener(this);
    }
    
    public void start(){
        view.setTitle("Dining-philosophers");
        view.setLocationRelativeTo(null);
    }
    
    public void actionPerformed(ActionEvent e){
        for (Philosopher philosopher : philosophers) { // Initialize every Philosopher thread
            if (!philosopher.isAlive()) { // Check if the thread is not already running
                philosopher.start();
            }
        }
    }
    
}
