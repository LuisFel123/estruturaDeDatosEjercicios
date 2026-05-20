package Pilas.pilaEstatica;

import javax.swing.*;

public class Main {

    public static void main(String args[]){
    int opcion=0,elemento,tamanio;
    boolean estado=false;
    try{

        tamanio=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el tamañao de la pila"));
        Pila pila= new Pila(tamanio);

        do{
            opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"1. Empujar un elemento a la pila \n" +
                    "2. Sacar un elemento de la pila\n" +
                    "3. ¿La pila está vacia?\n" +
                    "4. ¿La pila está llena?\n"+
                    "5. ¿Que elemento está en la cima\n"+
                    "6. Tamaño de la pila\n"+
                    "7. Obtener datos de la pila\n"+
                    "8. Limpiar la pila \n"+
                    "9.Salir"
            ));

            switch (opcion){
                case 1:
                    elemento=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el elemento a em pujar en la pila estatica"));
                    if(!pila.estaLlena()){
                        pila.empujar(elemento);
                    }else {
                        JOptionPane.showMessageDialog(null,"La pila está llena");
                    }
                    break;

                case 2:

                    if(!pila.estaVacia()){
                        JOptionPane.showMessageDialog(null,"e" +
                                "El elemento obtenido es: "+pila.sacar());
                    }else {
                        JOptionPane.showMessageDialog(null,"La pila está vacia");
                    }
                    break;

                case 3:
                    if(pila.estaVacia()){
                        JOptionPane.showMessageDialog(null,"La pila está vacia");
                    }else{
                        JOptionPane.showMessageDialog(null,"La pila no esta vacia");
                    }
                    break;

                case 4:
                    if(pila.estaLlena()){
                        JOptionPane.showMessageDialog(null,"La pila está llena");
                    }else{
                        JOptionPane.showMessageDialog(null,"La pila no esta llena");
                    }

                    break;

                case 5:
                    if(!pila.estaVacia()){
                        JOptionPane.showMessageDialog(null,"El elemnto que se encuentra en la cima "+pila.cimaPila());
                    }else{
                        JOptionPane.showMessageDialog(null,"La pila esta vacia");
                    }
                    break;

                case 6:
                    JOptionPane.showMessageDialog(null,"El tamaño de la pila es: "+pila.tamanioPila());

                    break;


                case 7:
                    pila.obtenerDatos();
                    break;

                case 8:
                    pila.limpiarPila();
                    break;

                case 9:
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opcion no disponible");
            }
        }while(opcion!=9);

    }catch (NumberFormatException exception){

    }


    }
}
