package Colas;

import javax.swing.*;

public class Main {

    public static void main(String args[]) {
        int opcion = 0, elemento = 0;

        Cola cola = new Cola();

        do {

            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1.Insertar un elemento a la cola\n" + "2. Quitar un elemento de la cola\n" + "3. ¿La cola esta vacia?\n" + "4. Elemento ubicado al inicio de la cola\n" + "5. Tamaño de la cola\n" + "6. Salir"));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error " + e);
            }

            switch (opcion) {

                case 1:
                    elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese los datos del elemento que quiere insertar"));
                    cola.insertar(elemento);
                    break;

                case 2:
                    if (!cola.estaVacia()) {
                        JOptionPane.showMessageDialog(null, "El elemento atendido es: " + cola.quitar());
                    } else {
                        JOptionPane.showMessageDialog(null, "La cola esta vacia");
                    }
                    break;

                case 3:
                    if (cola.estaVacia()) {
                        JOptionPane.showMessageDialog(null, "La cola está vacia");
                    } else {
                        JOptionPane.showMessageDialog(null, "La cola no esta vacia");
                    }

                    break;


                case 4:

                    if (!cola.estaVacia()) {
                        JOptionPane.showMessageDialog(null, "El elemento al inico de la cola es: " + cola.inicio());
                    } else {
                        JOptionPane.showMessageDialog(null, "La cola esta vacia");
                    }

                    break;


                case 5:
                    JOptionPane.showMessageDialog(null, "El tamaño de la cola es: " + cola.tamanioCola());

                    break;


                case 6:

                    break;


                default:
                    JOptionPane.showMessageDialog(null, "No existe esa opcion");
            }


        } while (opcion != 6);
    }
}
