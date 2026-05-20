package ListasDobles;

public class NodoDoble {
    public int dato;
    NodoDoble siguiente,anterior;

    //Constructor para cuando aun no hay nodos
    public NodoDoble(int elemento){
        this(elemento,null,null);
    }

    //Constructor cuando ya hay nodos

    public NodoDoble(int elemento,NodoDoble s, NodoDoble a){
        dato=elemento;
        siguiente=s;
        anterior=a;
    }


}
