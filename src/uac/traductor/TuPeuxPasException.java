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
public class TuPeuxPasException extends Exception {

    public TuPeuxPasException(String cette_palbra_est_déjà_dans_le_traducteur) {
        super(cette_palbra_est_déjà_dans_le_traducteur);
    }
    
}
