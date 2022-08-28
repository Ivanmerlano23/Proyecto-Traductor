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
public class Ingles implements Serializable{
    private String word;

    public Ingles(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return "Ingles{" + "word=" + word + '}';
    }
    

    /**
     * @return the word
     */
    public String getWord() {
        return word;
    }

    /**
     * @param word the word to set
     */
    public void setWord(String word) {
        this.word = word;
    }
    
    
}
