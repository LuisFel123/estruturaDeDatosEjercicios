package SusesionFi;

public class Susesion {

    public static void main(String args[]){
        Susesion suce=  new Susesion();
        System.out.println(suce.fibonacciRecursivo(6));
    }

    public int fibonacciRecursivo(int n){
        //caso base
        if(n==1 || n==2){

            return 1;
        }else {
            //Dominio problema-1
            return fibonacciRecursivo(n-1) + fibonacciRecursivo(n-2);
        }

    }
}
