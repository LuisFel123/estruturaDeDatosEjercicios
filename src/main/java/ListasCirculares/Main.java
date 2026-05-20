package ListasCirculares;

import ListasDobles.ListaDoble;

import javax.swing.*;

public class Main {

    public static void main(String args[]) {

        ListaC listita = new ListaC();
        int opcion = 0, elemento;
        do {

            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Agregar nodo a la lista circular\n" + " 2.Eliminar un nodo de la lista circular\n" + " 3.Mostrar los datos de la lista circular\n" + " 4.Salir\n"));
                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemento a lista circular"));

                        listita.insertar(elemento);

                        break;


                    case 2:
                        if (!listita.estaVacia()) {
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese al elemento que quiere eliminar"));
                            boolean eliminado = listita.eliminar(elemento);
                            if (eliminado) {
                                JOptionPane.showMessageDialog(null, "El elemento eliminado es: " + elemento);
                            } else {
                                JOptionPane.showMessageDialog(null, "El elemento no se encuentra en la lista circular");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "La lista circular está vacia");
                        }
                        break;


                    case 3:

                        if (!listita.estaVacia()) {
                            listita.mostrarLista();
                        } else {
                            JOptionPane.showMessageDialog(null, "La lista no tiene nodos");
                        }

                        break;


                    case 4:

                        break;


                    default:
                        JOptionPane.showMessageDialog(null, "Opción no disponible");


                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: " + e);
            }
        } while (opcion != 4);
    }


}

