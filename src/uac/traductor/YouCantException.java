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
public class YouCantException extends Exception {

    public YouCantException(String this_word_is_already_in_the_translator) {
        super(this_word_is_already_in_the_translator);
    }
    
}
