/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uac.ed;

import java.io.Serializable;

/**
 *
 * @author melis
 */
public class NodoArbol<E> implements Serializable{
    private E info;
    private NodoArbol<E> der;
    private NodoArbol<E> izq;

    public NodoArbol(E info) 
    {
        this.info = info;
    }

    /**
     * @return the info
     */
    public E getInfo() 
    {
        return info;
    }

    /**
     * @param info the info to set
     */
    public void setInfo(E info) 
    {
        this.info = info;
    }

    /**
     * @return the der
     */
    public NodoArbol<E> getDer() 
    {
        return der;
    }

    /**
     * @param der the der to set
     */
    public void setDer(NodoArbol<E> der) 
    {
        this.der = der;
    }

    /**
     * @return the izq
     */
    public NodoArbol<E> getIzq() 
    {
        return izq;
    }

    /**
     * @param izq the izq to set
     */
    public void setIzq(NodoArbol<E> izq) 
    {
        this.izq = izq;
    }
    
    
}
