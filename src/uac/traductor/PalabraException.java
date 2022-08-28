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
public class PalabraException extends Exception {

    public PalabraException(String palabra_no_encontrada_en_el_traductor_esp) {
        super(palabra_no_encontrada_en_el_traductor_esp);
    }
    
}
