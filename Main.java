//Demostracion del uso de funciones y creacion de una clase con su respectiva instancia.

public class Main {
    public static void main(String[] args) {
        suma(10,30, 40);

        //Realizamos el llamado de la funcion
        Coche  miCoche= new Coche();

        miCoche.IncremantarPuertas();
        miCoche.IncremantarPuertas();
        miCoche.IncremantarPuertas();
        miCoche.IncremantarPuertas();
        miCoche.IncremantarPuertas();
        System.out.println(miCoche.numeroPuertas);
    }
    //declaramos la funcion
    public static void suma(int a, int b, int c){
        int resultado;
        resultado = a + b + c;
        System.out.println(resultado);
    }
}

class Coche{
    public int numeroPuertas=0;

    public void IncremantarPuertas(){
       this.numeroPuertas++;
    }

}
