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
public class WordException extends Exception {

    public WordException(String word_not_found_in_the_translator_wait_for) {
        super(word_not_found_in_the_translator_wait_for);
    }
    
}
