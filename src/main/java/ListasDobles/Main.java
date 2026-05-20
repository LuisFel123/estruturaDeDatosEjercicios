package ListasDobles;

import javax.swing.*;

public class Main {


    public static void main(String args[]){
        ListaDoble listita= new ListaDoble();
        int opcion=0,elemento;
        do{

            try {
                opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"1. Agregar nodo al inicio\n"+" 2.Agregar un nodo al final\n"+" 3.Mostrar la lista de inicio a fin\n"+" 4.Mostrar la lista de fin a Inicio\n"+" 5.Salir"));
                switch (opcion) {
                    case 1:
                        elemento=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el elemento del nodo inicial"));

                        listita.agregarAlInicio(elemento);

                        break;


                    case 2:
                        elemento=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingesando el elemento del nood al final"));

                        listita.agregarAlFinal(elemento);

                        break;


                    case 3:

                        if(!listita.estVacia()){
                            listita.mostrarListaIncioFin();
                        }else {
                            JOptionPane.showMessageDialog(null,"La lista no tiene nodos");
                        }

                        break;


                    case 4:

                        if(!listita.estVacia()){
                            listita.mostrarListaFinInicio();
                        }else{
                            JOptionPane.showMessageDialog(null,"La lista no tiene nodos");
                        }

                        break;


                    default:
                        JOptionPane.showMessageDialog(null,"Opción no disponible");


                }
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Error: "+e);
            }
        }while (opcion!=5);
    }
}