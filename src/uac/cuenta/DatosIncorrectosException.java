/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uac.cuenta;

/**
 *
 * @author ivanf
 */
public class DatosIncorrectosException extends Exception {

    public DatosIncorrectosException(String el_usuario_o_la_contraseña_no_es_correcta) {
        super(el_usuario_o_la_contraseña_no_es_correcta);
    }
    
}
