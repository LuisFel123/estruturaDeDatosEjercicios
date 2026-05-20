package ArbolesBinarios;

import javax.swing.*;

public class Main {

    public static void main(String args[]) {
        int opcion = 0, elemento;

        String nombre;
        ArbolBinario arbolBinario = new ArbolBinario();

        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agregar un nodo\n "
                                + "2. Recorrer el arbol en inorden\n"
                        + "3. Recorrer el arbol en preorden\n"
                        +"4. Salir"
                        )
                );
                switch (opcion) {

                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero del nodo"));
                        nombre = JOptionPane.showInputDialog(null, "Ingresa el nombre del nodo");
                        arbolBinario.agregarNodo(elemento, nombre);
                        break;

                    case 2:
                        if (!arbolBinario.estaVacio()) {

                            System.out.println("*******************");
                            arbolBinario.inOrden(arbolBinario.raiz);
                            System.out.println("*******************");

                        }else{
                            JOptionPane.showMessageDialog(null,"El arbol binario está vacio");
                        }
                        break;

                    case 3:
                        if(!arbolBinario.estaVacio()){
                            System.out.println("*******************");
                            arbolBinario.preOrden(arbolBinario.raiz);
                            System.out.println("*******************");
                        }else{
                            JOptionPane.showMessageDialog(null,"El arbol binario está vacio");
                        }

                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "No existe esa opcion");
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "ERROR" + e);
            }
        } while (opcion != 4);
    }
}
