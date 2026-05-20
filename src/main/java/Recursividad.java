public class Recursividad {

    //creando un método para bajar una escalera de manera recursiva

    public void bajarEscalera(int escalones){
        //caso base
        if(escalones==0){
            //caso base, respuesta explicita
            System.out.println("Haz terminado deb bajar la escalera");
        }else{
            //Dominio,division del problema original en (problema-1)
            System.out.println("Bajando escalon " + escalones);

            //haciendo uso de la recursividad
            bajarEscalera(escalones-1);

        }
    }

    public static void main(String args[]){
        Recursividad recursividad = new Recursividad();

        recursividad.bajarEscalera(20);
    }
}
