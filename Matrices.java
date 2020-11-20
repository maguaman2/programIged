import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        //Scaner
        Scanner input =  new Scanner(System.in);  ///new instanciar
        System.out.printf("Ingresa tu nombre: ");
        String name = input.nextLine();
        System.out.println("Tu nombre es"+name);
        //Dar tamano a los vectores
        System.out.printf("Ingresa el numero de elementos: ");
        int size = input.nextInt();
        int[] numbers;
        numbers = new int[size];
        for (int i=0; i<size ;i++)
        {
            numbers[i]= (int) (Math.random()*10);   //Casteo explicita
        }
        for (int i=0; i<size ;i++)
        {
            System.out.println(numbers[i]);
        }
    }
}
