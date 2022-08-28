/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uac.cuenta;

import java.io.Serializable;
import java.util.ArrayList;
import uac.gui.Menu;

/**
 *
 * @author ivanf
 */
public class ManejoCuenta implements Serializable{
    private ArrayList<Cuenta> c = new ArrayList<>();
    public void addCuenta(Cuenta x){
        c.add(x);
    }
    
    public void acceso(String usuario, String contraseña) throws DatosIncorrectosException{
        for (int i = 0; i < c.size(); i++) {
            Cuenta get = c.get(i);
            if((get.getUsuario().equals(usuario)) && (get.getContraseña().equals(contraseña))){
                Menu m = new Menu();
                m.setVisible(true);
            }else{
                throw new DatosIncorrectosException("El usuario o la contraseña no es correcta!");
            }
        }
    }
    
}
