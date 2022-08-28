/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idiomas;

import java.io.Serializable;

/**
 *
 * @author melis
 */
public class Español implements Serializable{
    private String palabra;

    public Español(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public String toString() {
        return "Espa\u00f1ol{" + "palabra=" + palabra + '}';
    }
   
    /**
     * @return the palabra
     */
    public String getPalabra() {
        return palabra;
    }

    /**
     * @param palabra the palabra to set
     */
    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    
    
}
