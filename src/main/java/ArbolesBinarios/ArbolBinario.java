package ArbolesBinarios;

public class ArbolBinario {
    Nodo raiz;

    //inicializando la raiz
    public ArbolBinario(){
        raiz=null;
    }

    //metodo para insertar un nodo en el arbol
    public void agregarNodo(int d, String nom){
        Nodo nuevo = new Nodo(d,nom);
        if(raiz==null){
            raiz=nuevo;

        }else {
            Nodo auxiliar=raiz;
            Nodo padre;
            while(true){
                padre=auxiliar;
                if(d<auxiliar.dato){
                    auxiliar=auxiliar.hijoIzquierdo;
                    if(auxiliar==null){
                        padre.hijoIzquierdo=nuevo;
                        return;
                    }
                }else{
                    auxiliar=auxiliar.hijoDerecho;
                    if(auxiliar==null){
                        padre.hijoDerecho=nuevo;
                        return;
                    }
                }
            }
        }
    }

    //metodo para saber si el arbol esta vacio
    public boolean estaVacio(){
        return raiz==null;
    }

    //metodo para recorrer el arbol en inOrden

    public void inOrden(Nodo raiz){
        if(raiz!=null){
            inOrden(raiz.hijoIzquierdo);
            System.out.println("Indentificador: "+raiz.dato+" nombre: "+raiz.nombre);
            inOrden(raiz.hijoDerecho);
        }
    }

}
