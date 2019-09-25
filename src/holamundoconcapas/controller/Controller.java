/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas.controller;

import holamundoconcapas.model.Model;
import holamundoconcapas.model.ModelFactory;
import holamundoconcapas.vista.View;
import java.util.logging.Logger;

/**
 *Controller class for Hello World application with tiers(capas)
 * @author Ander Rodriguez
 */
public class Controller{
    private static final Logger LOGGER = Logger.getLogger("holamundoconcapas.controller.Controller");
    /**
     * This method executes the application´s logic. It show a greeting from the model
     * @param model the model object
     * @param view the view object
     * @throws Exception 
     */
    
    
    public void run(Model model, View view) throws Exception{
        LOGGER.info("Starting run method.");
        view.showGreeting(model.getGrettingFromFile());
        LOGGER.info("Finishing run method.");
        
        
    }
    
}
