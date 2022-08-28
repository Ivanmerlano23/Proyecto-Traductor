/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idiomas;

import java.io.Serializable;

/**
 *
 * @author ivanf
 */
public class Frances implements Serializable{
    private String mot;

    public Frances(String mot) {
        this.mot = mot;
    }

    @Override
    public String toString() {
        return "Frances{" + "mot=" + mot + '}';
    }
    

    /**
     * @return the mot
     */
    public String getMot() {
        return mot;
    }

    /**
     * @param mot the mot to set
     */
    public void setMot(String mot) {
        this.mot = mot;
    }
    
}
