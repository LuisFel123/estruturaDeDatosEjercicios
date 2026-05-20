package PilasStackL;

//importar  a la libreria stack
import javax.swing.*;
import java.util.Stack;

public class Main {



    public static void main(String[] args){
        Stack pila = new Stack();

        pila.push(10);
        pila.push(20);
        pila.push(30);
        pila.push(40);
        pila.push(50);

        //obtener la cima de la pila
        System.out.println("La cima es "+ pila.peek());

        //sacar un elemento de la pila
        System.out.println("Sacando un elemento de la pila "+pila.pop());

        //sacar el tamaño de la pila
        System.out.println("Tamaño de la pila´"+pila.size());

        //La pila esta vacia?
        System.out.println("La pila esta vacia: "+pila.isEmpty());

    }
}
