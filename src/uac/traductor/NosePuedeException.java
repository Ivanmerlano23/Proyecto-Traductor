/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uac.traductor;

/**
 *
 * @author ivanf
 */
public class NosePuedeException extends Exception {

    public NosePuedeException(String esta_palabra_ya_esta_en_el_traductor) {
        super(esta_palabra_ya_esta_en_el_traductor);
    }
    
}
