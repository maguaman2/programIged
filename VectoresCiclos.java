
import java.util.Scanner;

public class VectoresCiclos {

    public static void main(String[] args) {

        int a[];   //Declarar un vector tipo int. Otra forma: int[] a2;

        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese el valor del vector");
        int size = sc.nextInt();

        a = new int[size]; //        int b[] = new int[4];

        int i =0;

        Scanner sc1 = new Scanner(System.in);

        while(i<a.length){  //Indica el tamano del vector
            //Instruccion se repite siempre y cuando la condicion sea TRUE
            System.out.println("Ingrese el valor del elelento");
            a[i]= sc1.nextInt();
            System.out.println(a[i]);
            i++;

        }

        //System.out.println(a[2]);

    }
/**
 * Menu
 * 1. Ingresar tamano del vector
 * 2. Ingrese los valores del vector
 * 3. Mostar los elementos del vector
 * 0. Salir
 * condicion = true;
 * do {
 *     sout("1. Ingresar tamano del vector");
 *     sout("2. Ingresar tamano del vector");
 *     sout("3. Ingresar tamano del vector");
 *     sout("0. Salir");
 *
 *     switch (condicion)
 *     case 1:
 *          Ingrese elt amano
 *          sc.netint
 *          break;
 *     case 2:
 *          ingrese los elementos
 *          break;
 *      caso 0;
 *      condicion = false;
 *
 * }while(condicion)
 *
 */

}
