package PilaDinamica;

import javax.swing.*;

public class Main {
    public static void main(String args[]) {
        int opcion = 0, elemento = 0;
        Pila pila = new Pila();
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1.Empujar elemento a la pila"
                                + "\n2.Sacar un elemento de la pila"
                                + "\n3. ¿La pila está vacia?" +
                                "\n4.¿Que elemento está en la cima?"
                                + "\n5.Tamaño de la pila" +
                                "\n6.Vaciar pila"+
                                "\n7.Salir"
                ));
                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingrese el elemento que se ingresara a la pila"));
                        pila.empujar(elemento);
                        break;


                    case 2:
                        if (!pila.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "El elemnto a sacar es:" + pila.sacar());
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia");
                        }


                        break;


                    case 3:
                         if(pila.estaVacia()){
                             JOptionPane.showMessageDialog(null,"La pila esta vacia");
                         }else {
                             JOptionPane.showMessageDialog(null,"La pila tiene elementos");
                         }

                        break;


                    case 4:

                        if(!pila.estaVacia()){
                            JOptionPane.showMessageDialog(null,"La cima es "+pila.cima() );
                        }else {
                            JOptionPane.showMessageDialog(null,"La pila está vacia");
                        }

                        break;

                    case 5:
                            JOptionPane.showMessageDialog(null, "El tamaaño de la pila es: "+pila.tamanioP());
                        break;


                    case 6:
                            if(!pila.estaVacia()){
                                pila.limpiar();
                                JOptionPane.showMessageDialog(null,"Vaciando la pila");
                            }else{
                                JOptionPane.showMessageDialog(null,"La pila esta vacia, no hay nada que vaciar");
                            }
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "No existe esa opción");
                }

            } catch (NumberFormatException e) {

            }
        } while (opcion != 7);
    }
}
