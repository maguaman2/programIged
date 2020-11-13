import java.util.Scanner;

public class Vectores {

    public static void main(String[] args) {

        int[][] numeros;
        numeros = new int[2][2];
        numeros[0][0] = 3;
        numeros[0][1] = 2;
        numeros[1][0] = 78;
        numeros[1][1] = 34;

        for(int i= 0;i<2;i++) {
            for(int j= 0;j<2;j++) {
                System.out.println(numeros[i][j]);
            }
        }

        int[] numbers;  // declaro
        String[] names;  // declaro
        Scanner entradaUno = new Scanner(System.in);  //declarar un objeto para ingreso de datos
        System.out.printf("Ingrese el numero de elementos de vector: ");
        int size = entradaUno.nextInt();

        names = new String[size];  // instancia
        for(int i= 0;i<names.length;i++)
        {
            Scanner entrada = new Scanner(System.in);  //declarar un objeto para ingreso de datos
            System.out.printf("Ingrese el elemento %d del vector: ", i+1);
            names[i] = entrada.nextLine();
        }

        boolean condicion = true;
        int indice=0;

        while (indice<names.length) // false
        {
            System.out.printf("El indice %d contiene el numero %s \n", indice,names[indice]);
            indice=indice+1;  //indice ++
        }

        System.out.println("Continua ...");

    }

}
