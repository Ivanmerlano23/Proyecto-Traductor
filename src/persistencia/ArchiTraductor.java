/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import uac.traductor.ArbolesIdiomas;

/**
 *
 * @author ivanf
 */
public class ArchiTraductor {
     public void guardar(ArbolesIdiomas x) throws FileNotFoundException, IOException{
         ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("datos.obj"));
         salida.writeObject(x);
         salida.close();
     }
     
     public ArbolesIdiomas recuperar() throws FileNotFoundException, IOException, ClassNotFoundException{
         ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("datos.obj"));
         ArbolesIdiomas arbolesidiomas = (ArbolesIdiomas) entrada.readObject();
         entrada.close();
         return arbolesidiomas;
     }
}
