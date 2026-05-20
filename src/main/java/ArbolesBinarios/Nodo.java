package ArbolesBinarios;

public class Nodo {

    int dato;
    String nombre;
    Nodo hijoIzquierdo, hijoDerecho;

    public Nodo(int dato,String nombre){
        this.dato=dato;
        this.nombre=nombre;
        this.hijoDerecho=null;
        this.hijoIzquierdo=null;

    }

    public String toString(){
        return  nombre+" "+" Su datos es: "+dato;
    }



}
