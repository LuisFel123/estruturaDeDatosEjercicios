package ListaEnlazadas.ListaSimple;

import javax.swing.*;

public class Main {

    public static void main(String args[]){
        int opcion=0,elemento;
        Lista lista= new Lista();
        do{
            try{
                opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"1. Agregar un elemento al inico de la lista \n"+ "2.Agregar un elemento al final de la lista\n"+"3.Mostrar los datos de la lista"+"\n4. Eliminar un elemento del inicio de la lista\n"+"5. Eliminar un elemento al final de la lista"+"\n6.Eliminar un elemento seleccionado"+"\n7.Buscar un elemento"+"\n8. Salir" ));

                switch (opcion) {
                    case 1:
                        try{
                            elemento=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el elemento"));
                            lista.agregarAlInicio(elemento);
                        }catch (NumberFormatException e){
                            JOptionPane.showMessageDialog(null,""+e);
                        }
                        break;

                    case 2:
                        try{
                            elemento=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el elemento"));
                            lista.agregarAlFinal(elemento);
                        }catch (NumberFormatException e){
                            JOptionPane.showMessageDialog(null,""+e);
                        }
                        break;

                    case 3:
                        lista.mostrarLista();
                        break;

                    case 4:

                        elemento=lista.borrarDelInicio();
                        JOptionPane.showMessageDialog(null,"El elemento eliminado es "+elemento);
                        break;

                    case 5:

                        elemento= lista.borrarDelFinal();
                        JOptionPane.showMessageDialog(null,"El elemento borrado es: "+elemento);
                        break;


                    case 6:
                        elemento=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el elemento a eliminar en especifico"));

                        if(lista.estarEnLaLista(elemento)) {
                            lista.eliminarEspacifico(elemento);
                            JOptionPane.showMessageDialog(null, "EL elemento eliminado es: " + elemento);
                        }else {
                            JOptionPane.showMessageDialog(null,"El elemento no se ha encontrado y no pudo ser eliminado");
                        }
                        break;

                    case 7:
                        elemento=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el elemento a buscar"));
                        if(lista.estarEnLaLista(elemento)){
                            JOptionPane.showMessageDialog(null,"El elemento "+elemento+" Si esta en la lista");

                        }else{
                            JOptionPane.showMessageDialog(null,"El elemento no esta en la lista");
                        }
                        break;

                    case 8:

                        JOptionPane.showMessageDialog(null,"HASTA LUEGO ");

                        break;

                    default:
                        JOptionPane.showMessageDialog(null,"Opcion incorrecta");

                }
            }catch (Exception e){
                System.err.println(e);
            }
        }while(opcion!=8);
    }
}
