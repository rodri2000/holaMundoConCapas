/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas.controller;

import holamundoconcapas.model.Model;
import holamundoconcapas.model.ModelFactory;
import holamundoconcapas.vista.View;

/**
 *
 * @author 2dam
 */
public class Controller{
    
    public static void run(Model model, View view) throws Exception{
        
        view.showGreeting(model.getGrettingFromFile());
        
        
    }
    
}
