import javax.swing.*;
import java.util.ArrayList;

public class MemoriaDinamica {
    public static void main (String args[]){

        ArrayList <String> frases= new ArrayList<String>();
        ArrayList<String> arreglo= new ArrayList<String>();

        String frase,respuesta;

        do{
            frase= JOptionPane.showInputDialog(null,"Ingresa la frase");
            //agregando la frase a la lista
            arreglo.add(frase);
            respuesta=JOptionPane.showInputDialog(null,"Deseas ingresar otra frase");
            respuesta= respuesta.toUpperCase();

        }while(!respuesta.equals("NO"));

        for(int i=0; i<arreglo.size();i++){
            System.out.println("El contenido del arreglo es: "+arreglo.get(i));
        }


    }
}
