package Colas;

public class Cola {
    NodoCola inicio,fin;
    int tama;

    public Cola(){
        inicio=fin=null;
    }


    //saber si una cola esta vacia
    public boolean estaVacia(){
        return inicio==null;
    }


    //insertar un elemento a la cola
    public void insertar(int ele){
        NodoCola nuevo= new NodoCola(ele);
        if(estaVacia()){
            inicio=nuevo;
        }else{
            fin.siguiente=nuevo;
        }
        fin=nuevo;
        tama++;
    }

    //quitar un elemento a la cola
    public int quitar(){
        int aux= inicio.dato;
        inicio=inicio.siguiente;
        tama--;
        return aux;
    }


    public int inicio(){
        return  inicio.dato;
    }

    public int tamanioCola(){
        return  tama;
    }
}
