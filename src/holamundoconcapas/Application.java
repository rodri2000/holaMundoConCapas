/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas;

import holamundoconcapas.controller.Controller;
import holamundoconcapas.model.Model;
import holamundoconcapas.model.ModelFactory;
import holamundoconcapas.vista.View;
import holamundoconcapas.vista.ViewFactory;

/**
 *
 * @author 2dam
 */
public class Application {
    
        public static void main(String [] args) throws Exception {
            Model model = ModelFactory.getModel();
            View view = ViewFactory.getView();
            
            Controller con = new Controller();
            con.run(model, view);
            
        }
}
