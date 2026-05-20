package ListaEnlazadas.ListaSimple;

import javax.swing.*;
import java.util.ArrayList;

public class Lista {
    protected Nodo inicio,fin;  //punteros para saber donde esta el incio y fin

    public Lista(){
        inicio=null;
        fin=null;
    }

    //Metodo apra agregar un nodo al inicio de la lista
    public void agregarAlInicio(int elemento){
        //creando nodo
        inicio=new Nodo(elemento,inicio);
        if(fin==null){
            fin=inicio;
        }
    }

    //metodo para saber si una lista esta vacia
    public boolean estaVacia(){
        if(inicio==null){
            return  true;
        }else{
            return false;
        }
    }

    //Metodo para insertar al final de la lista
    public void agregarAlFinal(int elemento){
        if(!estaVacia()){
            fin.siguiente=new Nodo(elemento);
            fin=fin.siguiente;
        }else{
            inicio=fin=new Nodo(elemento);
        }
    }

    //metodo para mostrar los datos
    public void mostrarLista(){
        Nodo recorrer = inicio;
        ArrayList<Integer> datos= new ArrayList<Integer>();
        while(recorrer!=null){
            datos.add(recorrer.dato);
            recorrer=recorrer.siguiente;
        }

        JOptionPane.showMessageDialog(null,"La lista: "+datos);
    }

    //borrar del inicio de la lista

    public int borrarDelInicio(){
        int elemento= inicio.dato;
        if(inicio==fin){
            inicio=fin=null;
        }else{
            inicio=inicio.siguiente;
        }
        return elemento;
    }

    //borrar el nodo del final

    public int borrarDelFinal(){
        int elemento=fin.dato;
        if(inicio==fin){
            inicio=fin=null;


        }else{
            Nodo temporal = inicio;
            while(temporal.siguiente!=fin){
                temporal=temporal.siguiente;
            }
            fin=temporal;
            fin.siguiente=null;
        }
        return elemento;
    }

    //eliminar un nodo en especifico
    public void eliminarEspacifico(int elemento){
        if(!estaVacia()){
            if(inicio==fin && elemento==inicio.dato){
                inicio=fin=null;
            }else if(elemento==inicio.dato){
                inicio=inicio.siguiente;
            }else{
                Nodo anterior,temporal;
                anterior=inicio;
                temporal=inicio.siguiente;
                while(temporal!=null && temporal.dato!=elemento){
                    anterior=anterior.siguiente;
                    temporal=temporal.siguiente;
                }
                if(temporal!=null){
                    anterior.siguiente=temporal.siguiente;
                    if(temporal==fin){
                        fin=anterior;
                    }

                }
            }
        }
    }

    //Metodo para buscat un elemento
    // Metodo para buscar un elemento
    public boolean estarEnLaLista(int elemento) {
        Nodo temporal = inicio;

        while (temporal != null && temporal.dato != elemento) {
            temporal = temporal.siguiente;
        }

        if (temporal != null) {
            System.out.println("Lo que tiene temporal es: " + temporal.dato);
            return true;
        } else {
            System.out.println("El elemento no fue encontrado");
            return false;
        }
    }



}
