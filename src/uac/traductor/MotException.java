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
public class MotException extends Exception {

    public MotException(String mot_introuvable_dans_le_traducteur_attend) {
        super(mot_introuvable_dans_le_traducteur_attend);
    }
    
}
