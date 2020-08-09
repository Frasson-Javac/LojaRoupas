/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

/**
 *
 * @author vinic
 */

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
public class GerarIntenalFrameCentralizado {
    
    
    
    
    public void gerarcental(JInternalFrame internal,JDesktopPane desktop){
        
         int tam=desktop.getWidth();
         int tam2=desktop.getHeight();
         int  frame=internal.getWidth();
         int fram2=internal.getHeight();
         internal.setLocation(tam/2-frame/2,tam2/2-fram2/2);
         desktop.add(internal);
         internal.setVisible(true);
        
        
    }
    
      public void gerarcentalPaineis(JInternalFrame internal,JLayeredPane desktop){
        
         int tam=desktop.getWidth();
         int tam2=desktop.getHeight();
         int  frame=internal.getWidth();
         int fram2=internal.getHeight();
         internal.setLocation(tam/2-frame/2,tam2/2-fram2/2);
         desktop.add(internal);
         internal.setVisible(true);
        
        
    }
    
}
