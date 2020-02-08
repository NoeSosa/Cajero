/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cajero;
import javax.swing.*;
/**
 *
 * @author SP314-51
 */
public class Cajero extends GUI_Cajero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int acumulador=0;
       
        JPanel panel =new JPanel ();
    	JLabel label = new JLabel();
        JPasswordField pwd = new JPasswordField(10);
    	JOptionPane dialogo= new JOptionPane();
    	panel.add(label);
    	panel.add(pwd);
    	String[] options = new String [] {"OK", "Cancel"};
        
    	int action = dialogo.showOptionDialog(null, panel, "Ingresa el NIP",JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[1]);
    	char []password=pwd.getPassword();
    	if (action==0){
    		if( "1234".equals(new String(password)))
                {
                    
                    GUI_Cajero Menu = new GUI_Cajero();
                    Menu.setVisible(true);
    			
                            
                
                } else{
                    JOptionPane.showMessageDialog(null,"Error Reintente ");
                    
                }
                }
        
        
        	
    }
  // TODO code application logic here

    
  }
    

