/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trabalhoMVC;

import trabalhoMVC.database.Conect;
import trabalhoMVC.view.LoginScreen;

public class App {
       public static void main(String[] args) {
        Conect.getConect();
        
         new LoginScreen().setVisible(true);
    }
}
