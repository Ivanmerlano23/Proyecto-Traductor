/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uac.traductor;

import idiomas.Español;
import idiomas.Frances;
import idiomas.Ingles;
import java.io.Serializable;
import javax.swing.JOptionPane;
import traductor.Traductor;
import uac.ed.NodoArbol;

/**
 *
 * @author ivanf
 */
public class ArbolesIdiomas implements Serializable{
    private NodoArbol<Español> raiz;
    private NodoArbol<Ingles> raiz2;
    private NodoArbol<Frances> raiz3;
    Traductor t;
    
    public void agregar(Español español) throws NosePuedeException{
        if(raiz == null){
            raiz = new NodoArbol<>(español);
        }else{
            insertar(raiz, español);
        }
    }

    private void insertar(NodoArbol<Español> r, Español español) throws NosePuedeException {
        if(español.getPalabra().compareTo(r.getInfo().getPalabra())<0){
            if(r.getIzq()==null){
                r.setIzq(new NodoArbol<>(español));
            }else{
                insertar(r.getIzq(), español);
            }
        }else{
            if(español.getPalabra().compareTo(r.getInfo().getPalabra())>0){
                 if(r.getDer()==null){
                r.setDer(new NodoArbol<>(español));
            }else{
                insertar(r.getDer(), español);
            }
        }else{
                throw new NosePuedeException("Esta palabra ya esta en el traductor!");
            }
    }
    }
    
    public void agregar2(Ingles ingles) throws YouCantException{
        if(raiz2 == null){
            raiz2 = new NodoArbol<>(ingles);
        }else{
            insertar2(raiz2, ingles);
        }
    }

    private void insertar2(NodoArbol<Ingles> r, Ingles ingles) throws YouCantException {
        if(ingles.getWord().compareTo(r.getInfo().getWord())<0){
            if(r.getIzq()==null){
                r.setIzq(new NodoArbol<>(ingles));
            }else{
                insertar2(r.getIzq(), ingles);
            }
        }else{
            if(ingles.getWord().compareTo(r.getInfo().getWord())>0){
                 if(r.getDer()==null){
                r.setDer(new NodoArbol<>(ingles));
            }else{
                insertar2(r.getDer(), ingles);
            }
        }else{
                throw new YouCantException("This word is already in the translator!");
            }
    }
    }
    
    public void agregar3(Frances frances) throws TuPeuxPasException{
        if(raiz3 == null){
            raiz3 = new NodoArbol<>(frances);
        }else{
            insertar3(raiz3, frances);
        }
    }

    private void insertar3(NodoArbol<Frances> r, Frances frances) throws TuPeuxPasException {
        if(frances.getMot().compareTo(r.getInfo().getMot())<0){
            if(r.getIzq()==null){
                r.setIzq(new NodoArbol<>(frances));
            }else{
                insertar3(r.getIzq(), frances);
            }
        }else{
            if(frances.getMot().compareTo(r.getInfo().getMot())>0){
                 if(r.getDer()==null){
                r.setDer(new NodoArbol<>(frances));
            }else{
                insertar3(r.getDer(), frances);
            }
        }else{
                throw new TuPeuxPasException("Cette palbra est déjà dans le traducteur!");
            }
    }
    }
    
     String palabra="";
    private String EspañolIngles(NodoArbol<Español> r) throws PalabraException{
        if(r!=null){
                visita(r);
                EspañolIngles(r.getIzq());
                EspañolIngles(r.getDer());
        }
        return palabra;
    }
   

    private void visita(NodoArbol<Español> r) throws PalabraException {
        if((r.getInfo().getPalabra().equals("Hola")) || (r.getInfo().getPalabra().equals("hola"))){
            palabra = "Hello";
        }else{
            if((r.getInfo().getPalabra().equals("Buenos Dias")) || (r.getInfo().getPalabra().equals("Buenos dias")) || (r.getInfo().getPalabra().equals("buenos dias"))){
                palabra = "Good Morning";
            }else{
                if((r.getInfo().getPalabra().equals("Buenas Tardes")) || (r.getInfo().getPalabra().equals("Buenas tardes")) || (r.getInfo().getPalabra().equals("buenas tardes"))){
                    palabra = "Good Afternoon";
                }else{
                    if((r.getInfo().getPalabra().equals("Buenas Noches")) || (r.getInfo().getPalabra().equals("Buenas noches")) || (r.getInfo().getPalabra().equals("buenas noches"))){
                        palabra = "Good Night";
                    }else{
                        if((r.getInfo().getPalabra().equals("Gracias")) || (r.getInfo().getPalabra().equals("gracias"))){
                            palabra = "Thank you";
                        }else{
                            throw new PalabraException("Palabra no encontrada en el traductor, espere a una proxima actualización de la app!! ");
                        }    
                    }
                }
            }
        }
    }
    
    public String TraductorEspañolIngles() throws PalabraException{
        String traducido = EspañolIngles(raiz);
        return traducido;
    }
    
    
     
    private String EspañolFrances(NodoArbol<Español> r) throws PalabraException{
        if(r != null){
            visita2(r);
            EspañolFrances(r.getIzq());
            EspañolFrances(r.getDer());
        }
        return palabra;
    }
    
    private void visita2(NodoArbol<Español> r) throws PalabraException {
        if((r.getInfo().getPalabra().equals("Hola")) || (r.getInfo().getPalabra().equals("hola"))){
            palabra = "Salut";
        }else{
            if((r.getInfo().getPalabra().equals("Buenos Dias")) || (r.getInfo().getPalabra().equals("Buenos dias")) || (r.getInfo().getPalabra().equals("buenos dias"))){
                palabra = "Bonjour";
            }else{
                if((r.getInfo().getPalabra().equals("Buenas Tardes")) || (r.getInfo().getPalabra().equals("Buenas tardes")) || (r.getInfo().getPalabra().equals("buenas tardes"))){
                    palabra = "Bonne après-midi";
                }else{
                    if((r.getInfo().getPalabra().equals("Buenas Noches")) || (r.getInfo().getPalabra().equals("Buenas noches")) || (r.getInfo().getPalabra().equals("buenas noches"))){
                        palabra = "Bonne nuit";
                    }else{
                        if((r.getInfo().getPalabra().equals("Gracias")) || (r.getInfo().getPalabra().equals("gracias"))){
                            palabra = "Merci";
                        }else{
                            throw new PalabraException("Palabra no encontrada en el traductor, espere a una proxima actualización de la app!! ");
                        }   
                    }
                }
            }
        }
    }
    
    public String TraductorEspañolFrances() throws PalabraException{
        String traducido = EspañolFrances(raiz);
        return traducido;
    }
    
    String word="";
    private String InglesEspañol(NodoArbol<Ingles> r) throws WordException{
        if(r!=null){
                visita3(r);
                InglesEspañol(r.getIzq());
                InglesEspañol(r.getDer());
        }
        return word;
    }
    
    private String InglesFrances(NodoArbol<Ingles> r) throws WordException{
        if(r != null){
            visita4(r);
            InglesFrances(r.getIzq());
            InglesFrances(r.getDer());
        }
        
        return word;
    }
    
    public String TraductorInglesEspañol() throws WordException{
        String traducido = InglesEspañol(raiz2);
        return traducido;
    }
    
    public String TraductorInglesFrances() throws WordException{
        String traducido = InglesFrances(raiz2);
        return traducido;
    }
    
    

    private void visita3(NodoArbol<Ingles> r) throws WordException {
        if((r.getInfo().getWord().equals("Hello")) || (r.getInfo().getWord().equals("hello"))){
            word = "Hola";
        }else{
            if((r.getInfo().getWord().equals("Good Morning")) || (r.getInfo().getWord().equals("Good morning")) || (r.getInfo().getWord().equals("good morning"))){
                word = "Buenos Dias";
            }else{
                if((r.getInfo().getWord().equals("Good Afternoon")) || (r.getInfo().getWord().equals("Good afternoon")) || (r.getInfo().getWord().equals("good afternoon"))){
                    word = "Buenas Tardes";
                }else{
                    if((r.getInfo().getWord().equals("Good Night")) || (r.getInfo().getWord().equals("Good night")) || (r.getInfo().getWord().equals("good night"))){
                        word = "Buenas Noches";
                    }else{
                        if((r.getInfo().getWord().equals("Thank You")) || (r.getInfo().getWord().equals("Thank you")) || (r.getInfo().getWord().equals("thank you")) || (r.getInfo().getWord().equals("Thanks")) || (r.getInfo().getWord().equals("thanks"))){
                            word = "Gracias";
                        }else{
                            throw new WordException("Word not found in the translator, wait for a next update of the app!! ");
                        }    
                    }
                }
            }
        }
    }
    
    private void visita4(NodoArbol<Ingles> r) throws WordException {
        if((r.getInfo().getWord().equals("Hello")) || (r.getInfo().getWord().equals("hello"))){
            word = "Salut";
        }else{
            if((r.getInfo().getWord().equals("Good Morning")) || (r.getInfo().getWord().equals("Good morning")) || (r.getInfo().getWord().equals("good morning"))){
                word = "Bonjour";
            }else{
                if((r.getInfo().getWord().equals("Good Afternoon")) || (r.getInfo().getWord().equals("Good afternoon")) || (r.getInfo().getWord().equals("good afternoon"))){
                    word = "Bonne après-midi";
                }else{
                    if((r.getInfo().getWord().equals("Good Night")) || (r.getInfo().getWord().equals("Good night")) || (r.getInfo().getWord().equals("good night"))){
                        word = "Bonne nuit";
                    }else{
                        if((r.getInfo().getWord().equals("Thank You")) || (r.getInfo().getWord().equals("Thank you")) || (r.getInfo().getWord().equals("thank you")) || (r.getInfo().getWord().equals("Thanks")) || (r.getInfo().getWord().equals("thanks"))){
                            word = "Merci";
                        }else{
                            throw new WordException("Word not found in the translator, wait for a next update of the app!! ");
                        }   
                    }
                }
            }
        }
    }
    
    String mot="";
    private String FrancesEspañol(NodoArbol<Frances> r) throws MotException{
        if(r!=null){
                visita5(r);
                FrancesEspañol(r.getIzq());
                FrancesEspañol(r.getDer());
        }
        return mot;
    }
    
    private String FrancesIngles(NodoArbol<Frances> r) throws MotException{
        if(r != null){
            visita6(r);
            FrancesIngles(r.getIzq());
            FrancesIngles(r.getDer());
        }
        return mot;
    }
    
    public String TraductorFrancesEspañol() throws MotException{
        String traducido = FrancesEspañol(raiz3);
        return traducido;
    }
    
    public String TraductorFrancesIngles() throws MotException{
        String traducido = FrancesIngles(raiz3);
        return traducido;
    }

    private void visita5(NodoArbol<Frances> r) throws MotException {
        if((r.getInfo().getMot().equals("Salut")) || (r.getInfo().getMot().equals("salut"))){
            mot = "Hola";
        }else{
            if((r.getInfo().getMot().equals("Bonjour")) || (r.getInfo().getMot().equals("bonjour"))){
                mot = "Buenos Dias";
            }else{
                if((r.getInfo().getMot().equals("Bonne Apres-Midi")) || (r.getInfo().getMot().equals("Bonne apres-midi")) || (r.getInfo().getMot().equals("bonne apres-midi"))){
                    mot = "Buenas Tardes";
                }else{
                    if((r.getInfo().getMot().equals("Bonne Nuit")) || (r.getInfo().getMot().equals("Bonne nuit")) || (r.getInfo().getMot().equals("bonne nuit"))){
                        mot = "Buenas Noches";
                    }else{
                        if((r.getInfo().getMot().equals("Merci")) || (r.getInfo().getMot().equals("merci"))){
                            mot = "Gracias";
                        }else{
                            throw new MotException("Mot introuvable dans le traducteur, attendez une prochaine mise à jour de l’application!! ");
                        }    
                    }
                }
            }
        }
    }
    
    private void visita6(NodoArbol<Frances> r) throws MotException {
        if((r.getInfo().getMot().equals("Salut")) || (r.getInfo().getMot().equals("salut"))){
            mot = "Hello";
        }else{
            if((r.getInfo().getMot().equals("Bonjour")) || (r.getInfo().getMot().equals("bonjour"))){
                mot = "Good Morning";
            }else{
                if((r.getInfo().getMot().equals("Bonne Apres-Midi")) || (r.getInfo().getMot().equals("Bonne apres-midi")) || (r.getInfo().getMot().equals("bonne apres-midi"))){
                    mot = "Good Afernoon";
                }else{
                    if((r.getInfo().getMot().equals("Bonne Nuit")) || (r.getInfo().getMot().equals("Bonne nuit")) || (r.getInfo().getMot().equals("bonne nuit"))){
                        mot = "Good Night";
                    }else{
                        if((r.getInfo().getMot().equals("Merci")) || (r.getInfo().getMot().equals("merci"))){
                            mot = "Thank you";
                        }else{
                            throw new MotException("Mot introuvable dans le traducteur, attendez une prochaine mise à jour de l’application !!");
                        }   
                    }
                }
            }
        }
    }
    
     public String toStringEspañol(){
        String lis=inordenEspañol(raiz);
        return lis;
    }

    private String inordenEspañol(NodoArbol<Español> r) {
        if(r==null){
            return "";
        }else{
            return inordenEspañol(r.getIzq())+"\n"+r.getInfo().toString()+" "+inordenEspañol(r.getDer());
        }
    }
    
     public String toStringIngles(){
        String lis=inordenIngles(raiz2);
        return lis;
    }

    private String inordenIngles(NodoArbol<Ingles> r) {
        if(r==null){
            return "";
        }else{
            return inordenIngles(r.getIzq())+"\n"+r.getInfo().toString()+" "+inordenIngles(r.getDer());
        }
    }
    
     public String toStringFrances(){
        String lis=inordenFrances(raiz3);
        return lis;
    }

    private String inordenFrances(NodoArbol<Frances> r) {
        if(r==null){
            return "";
        }else{
            return inordenFrances(r.getIzq())+"\n"+r.getInfo().toString()+" "+inordenFrances(r.getDer());
        }
    }

    
    
    
    
    
}
