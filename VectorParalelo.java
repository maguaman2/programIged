
public class Condicionales {

    public static void main(String[] args) {
        //Vectores
        String nombres[] = {"Juan", "Pedro","Judas"};
        int edades[]= {34,56,64};

        int mayor = edades[0];
        int posicion=0;

        for (int i = 0; i < 3; i++) {
            if (edades[i]>mayor)
            {
                mayor=edades[i];
                posicion=i;
            }

        }
        System.out.printf("%s es el mayor, actualmente tiene: %d \n",nombres[posicion],mayor);
       
    //Matriz

    int matrix [][] = {{2,4,4},{6,6,9}};

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if (i==0)
                    System.out.print("\t");
                else
                    System.out.print(matrix[i][j]+"\t");
            }
            System.out.print("\n");

        }

        /*
        Tarea 
        * Ingresen por teclado
        * -     5       3
        * 5     -       5
        * 1     2       -
        *
        *
        *
        *
        * */

    }
}
