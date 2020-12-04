public class Funciones {
    public static void main(String[] args) {

     int a = 5;
     int b = 7;
     suma(a,b);
     a=50;
     b=70;
     System.out.println("con funcion retorno - "+suma(a,b));
     System.out.println("Un numemero aleatorio : "+numeroAleatorio());

    }

    public static int suma (int a, int b)
    {
        int suma;
        suma = a + b;
        //System.out.println("con funcion - "+suma);
        return suma;
    }

    public static int numeroAleatorio()
    {
        return (int)  (Math.random()*100);
    }
}
