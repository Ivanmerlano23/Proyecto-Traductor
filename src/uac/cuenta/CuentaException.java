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
public class CuentaException extends Exception {

    public CuentaException(String error_Cuenta_no_encontrada_en_la_base_de_) {
        super(error_Cuenta_no_encontrada_en_la_base_de_);
    }
    
}
