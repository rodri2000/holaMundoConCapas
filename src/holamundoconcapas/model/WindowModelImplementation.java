/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas.model;

import java.util.ResourceBundle;
import javax.swing.JOptionPane;

/**
 *
 * @author 2dam
 */
public class WindowModelImplementation implements Model {
    
    private String greeting;
    @Override
    public String getGrettingFromFile() {
        greeting = ResourceBundle.getBundle("holamundoconcapas.model.greeting").getString("greeting");
        JOptionPane.showMessageDialog(null, greeting);
        return greeting;        
    }
    
}
