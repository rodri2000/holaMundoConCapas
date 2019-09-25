/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas.model;

import holamundoconcapas.vista.SwingViewImplementation;

/**
 *
 * @author 2dam
 */
public class ModelFactory {
    private static Model modelF;
    
    public static Model getModel(){
        if(modelF == null) {
            modelF = new FileModelImplementation();
        }
        return modelF;
    }
}
