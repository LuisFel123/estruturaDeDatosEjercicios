package Pilas.pilaEstatica;

import javax.swing.*;
import java.util.Arrays;

public class Pila {
    int vectorPila[];

    int cima;

    //contructor
    public Pila(int tamanio) {
        vectorPila = new int[tamanio];
        cima = -1;
    }

    //metodo push empujar un elemento en la pila

    public void empujar(int dato) {
        cima++;
        vectorPila[cima] = dato;

    }

    //Metodo pop sacar un elemento de una pila
    public int sacar() {
        int fuera = vectorPila[cima];
        cima--;
        return fuera;
    }

    //Metodo para saber si la pila está vacia
    public boolean estaVacia() {
        return cima == -1;
    }

    //Metodo para saber cuando la pila esta llena
    public boolean estaLlena() {
        return vectorPila.length - 1 == cima;
    }

    //Método para saber que elemento se encuentra en la cima

    public int cimaPila() {
        return vectorPila[cima];
    }

    //Meotodo para Saber el tamaño de la pila
    public int tamanioPila() {
        return vectorPila.length;
    }


    //metodo para ver todos los elementos de la pila

    public void obtenerDatos(){
        JOptionPane.showMessageDialog(null,"La pila es: "+ Arrays.toString(vectorPila));
    }

    //limpiar la pila

    public void limpiarPila(){
        if(!estaVacia()) {
            for (int i = 0; vectorPila.length > i; i++) {
                vectorPila[i] = 0;
            }
            JOptionPane.showMessageDialog(null,"Elementos borrados de la pila");
            cima=-1;
        }else{
            JOptionPane.showMessageDialog(null,"La pila está vacia");
        }
    }




}
