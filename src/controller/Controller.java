
package controller;

import java.awt.event.ActionEvent;
import models.Philosopher;
import models.Table;
import view.MainView;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;

/**
 *
 * @author Diego
 */
public class Controller implements ActionListener{
    
    private MainView view;
    private Table table;
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
        if (!philosopherThreadsCreated) {
            createPhilosophers();
            philosopherThreadsCreated = true;
        }
    }
    
    public void actionPerformed(ActionEvent e){
        for (int i = 0; i < philosophers.length; i++) { // Initialize every Philosopher thread
          Philosopher philosopher = philosophers[i];
            if (!philosopher.isAlive()) { // Check if the thread is not already running
                philosopher.start();
                this.updateGUIStates(i);
            }
        }
    }
    
    public void createPhilosophers() {
        this.philosophers = new Philosopher[5];
        
        for (int i = 0; i < this.philosophers.length; i++) {
            this.philosophers[i] = new Philosopher(table, i + 1, this); //Philosophers must be created from 1-5, not 0-4
        }
    }
    
    public void updateGUIStates(int guestIndex) {
       String newState = philosophers[guestIndex].getStateFlag();
       String route = "/images/" + newState + ".png";
       
       switch (guestIndex) {
          case 0:
            view.img_philosopher1.setIcon(new ImageIcon(getClass().getResource(route)));
            break;
          case 1:
            view.img_philosopher2.setIcon(new ImageIcon(getClass().getResource(route)));
            break;
          case 2:
            view.img_philosopher3.setIcon(new ImageIcon(getClass().getResource(route)));
            break;
          case 3:
            view.img_philosopher4.setIcon(new ImageIcon(getClass().getResource(route)));
            break;
          case 4:
            view.img_philosopher5.setIcon(new ImageIcon(getClass().getResource(route)));
            break;
       }
    }
    
    public void updateTxtArea(int guestIndex) {
       String newState = philosophers[guestIndex].getStateFlag();
       String text = "Is " + newState + "\n";
       
       switch (guestIndex) {
        case 0:
            view.txtArea_Philosopher1.append(text);
            view.txtArea_Philosopher1.setCaretPosition(view.txtArea_Philosopher1.getDocument().getLength()); //Show last appended text in txtArea
            break;
        case 1:
            view.txtArea_Philosopher2.append(text);
            view.txtArea_Philosopher2.setCaretPosition(view.txtArea_Philosopher2.getDocument().getLength());
            break;
        case 2:
            view.txtArea_Philosopher3.append(text);
            view.txtArea_Philosopher3.setCaretPosition(view.txtArea_Philosopher3.getDocument().getLength());
            break;
        case 3:
            view.txtArea_Philosopher4.append(text);
            view.txtArea_Philosopher4.setCaretPosition(view.txtArea_Philosopher4.getDocument().getLength());
            break;
        case 4:
            view.txtArea_Philosopher5.append(text);
            view.txtArea_Philosopher5.setCaretPosition(view.txtArea_Philosopher5.getDocument().getLength());
            break;
       }
    }
    
    public void updateForkInfoTxtArea(int guestIndex, int fork, String forkAction) {
        String text = forkAction + " fork number: " + fork + "\n";
        
        switch (guestIndex) {
            case 0 -> {
                view.txtArea_Philosopher1.append(text);
                view.txtArea_Philosopher1.setCaretPosition(view.txtArea_Philosopher1.getDocument().getLength());
            }
            case 1 -> {
                view.txtArea_Philosopher2.append(text);
                view.txtArea_Philosopher2.setCaretPosition(view.txtArea_Philosopher2.getDocument().getLength());
            }
            case 2 -> {
                view.txtArea_Philosopher3.append(text);
                view.txtArea_Philosopher3.setCaretPosition(view.txtArea_Philosopher3.getDocument().getLength());
            }
            case 3 -> {
                view.txtArea_Philosopher4.append(text);
                view.txtArea_Philosopher4.setCaretPosition(view.txtArea_Philosopher4.getDocument().getLength());
            }
            case 4 -> {
                view.txtArea_Philosopher5.append(text);
                view.txtArea_Philosopher5.setCaretPosition(view.txtArea_Philosopher5.getDocument().getLength());
            }
        }
    }
    
}
