import java.util.Scanner;

public class FuncionesMatriz {
    public static void main(String[] args) {
        int matriz [][]=new int[3][3] ;
        Scanner sc = new Scanner(System.in);
        int response=0;
        do{
            System.out.println("1. Ingresar valore");
            System.out.println("2. Imprimir matriz con diaginal en 0");
            System.out.println("0. Salir");

            response=sc.nextInt();
            switch (response){
                case 1:
                    matriz=ingresarValores();
                    break;
                case 2:
                    imprimirMatriz(matriz);
                    break;
                case 0:
                    System.out.println("Bye");
                    break;

            }
        }while (response!=0);
    }
    //Funcion que revibe valore
    public static int[][] ingresarValores(){
        int matriz1[][]={{1,2,3},{4,5,6},{7,8,9}};
        return matriz1;
    }

    public static void imprimirMatriz(int matriz [][]){
        System.out.println(matriz[2][2]);
    }
}
