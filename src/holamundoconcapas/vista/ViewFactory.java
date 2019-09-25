/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas.vista;

/**
 *
 * @author 2dam
 */

public class ViewFactory {
    private static View viewF;
    
    public static View getView(){
        if(viewF==null){
            viewF = new JavaFXViewImplementation();
        }
        return new JavaFXViewImplementation();
    }
}
