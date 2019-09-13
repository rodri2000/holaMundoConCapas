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
public interface View {
    /**
     * Show a greeting
     * @param saludo A string with contains the greeting
     * @throws Exception 
     */
    public void showGreeting(String saludo) throws Exception;
    
}
