
package mvc;

import controller.Controller;
import models.Table;
import view.MainView;

/**
 *
 * @author Diego
 */
public class MVC {
    
    public static void main(String[] args) {
        Table table = new Table(5);
        MainView view = new MainView();
        
        Controller ctrl = new Controller(view, table);
        ctrl.start();
        view.setVisible(true);
    }
    
}
