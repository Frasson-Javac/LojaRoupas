/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import VIEW.Login;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import javax.swing.UIManager;

/**
 *
 * @author vinic
 */
public class TDRESS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        Locale.setDefault(Locale.ROOT);
       
    
        try {
              UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            } catch (Exception e) {
            e.printStackTrace();
          }
        
        Login login=new Login();
      login.setVisible(true);
    }
    
    
    
}
