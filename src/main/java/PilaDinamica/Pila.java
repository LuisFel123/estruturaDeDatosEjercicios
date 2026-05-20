package PilaDinamica;

public class Pila {

    private NodoPila cima;

    int tama;


    public  Pila(){
        cima=null;
        tama=0;
    }

    // metodo para saber cuando la pila esta vacia
    public boolean estaVacia(){
        return cima==null;
    }

    //Metodo para empujar un elemento a la pila
    public void empujar(int elemento){
        NodoPila nuevo=new NodoPila(elemento);
        nuevo.siguiente=cima;
        cima=nuevo;
        tama++;
    }

    //metodo para sacar un elemento de la pila

    public int sacar(){
        int aux=cima.dato;
        cima=cima.siguiente;
        tama--;
        return aux;
    }

    //metodo para saber quien esta en la cima de la pila
    public int cima(){
        return  cima.dato;

    }

    //Metodo para saber el tamaño de la pila

    public int tamanioP(){
        return tama;
    }

    //Metodo para limpiar la pila

    public void limpiar(){
        while(!estaVacia()){
            sacar();
        }
    }


}
