import javax.swing.*;

public class FactorialNumero {


    public int factorial(int numero){

        if(numero==0){
            return 1;
        }else{
            return numero* factorial(numero-1);
        }

    }

    public static void main (String args[]){
        FactorialNumero numero = new FactorialNumero();
        int numeroDos =Integer.parseInt( JOptionPane.showInputDialog(null, "Ingrese un numero"));

        int total=numero.factorial(numeroDos);
        JOptionPane.showMessageDialog(null,"El factorial es: "+total);

    }
}