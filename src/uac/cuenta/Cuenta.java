/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uac.cuenta;

import java.io.Serializable;

/**
 *
 * @author ivanf
 */
public class Cuenta implements Serializable{
    private String usuario;
    private String contraseña;

    public Cuenta(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }
    

    @Override
    public String toString() {
        return "Cuenta{" + "usuario=" + usuario + ", contrase\u00f1a=" + contraseña + '}';
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the contraseña
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * @param contraseña the contraseña to set
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
}
