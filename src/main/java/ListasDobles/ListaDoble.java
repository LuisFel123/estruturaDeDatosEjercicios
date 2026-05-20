package ListasDobles;

import javax.swing.*;

public class ListaDoble {

    private NodoDoble inicio,fin;
    public ListaDoble(){
        inicio=fin=null;
    }
    //Metodo para saber cuando la lista está vacia
    public boolean estVacia(){
        return inicio==null;

    }

    //metodo para agregar nodos al final
    public void agregarAlFinal(int elemento){
        if(!estVacia()){
            fin=new NodoDoble(elemento,null,fin);
            fin.anterior.siguiente=fin;

        }else{
            inicio=fin=new NodoDoble(elemento);
        }

    }

    //metodo para agregar al inicio

    public void agregarAlInicio(int elemento){
        if(!estVacia()){
            inicio=new NodoDoble(elemento,inicio,null);
            inicio.siguiente.anterior=inicio;

        }else {
            inicio=fin=new NodoDoble(elemento);
        }

    }

    //metodo para mostrar la lista
    public void mostrarListaIncioFin(){
        if(!estVacia()){
            String datos="<==>";
            NodoDoble auxiliar=inicio;
            while(auxiliar!=null){
                    datos=datos+"["+auxiliar.dato+"]<==>";
                    auxiliar=auxiliar.siguiente;
            }
            JOptionPane.showMessageDialog(null,datos,"Mostrando Lista de Inicio a Fin",JOptionPane.INFORMATION_MESSAGE);

        }
    }

    //metodo para mostrar la lista de fin a inicio
    public void mostrarListaFinInicio(){
        if(!estVacia()){
            String datos="<==>";
            NodoDoble auxiliar=fin;
            while(auxiliar!=null){
                datos=datos+"["+auxiliar.dato+"]<==>";
                auxiliar=auxiliar.anterior;
            }
            JOptionPane.showMessageDialog(null,datos,"Mostrando Lista de Inicio a Fin",JOptionPane.INFORMATION_MESSAGE);

        }
    }
}
