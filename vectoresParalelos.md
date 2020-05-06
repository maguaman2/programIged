# Vectores paralelos y matrices.
## Ejemplo para nombres y edades con vectores

En este ejemplo usaremos dos vecrtores para guardar información de forma paralela, es decir, que los elementos del primer vector `nombres[]` tendrán relacion con los elementos del segundo vector `edades[]`, el índice servira como referencia para emparejar los elementos. 

Adicionalmente usaremos otra forma de declarar y definir directamente los valores de  los arreglos.

~~~~
 String nombres[] = {"Juan", "Pedro","Judas"};
        int edades[]= {34,56,64};
~~~~
A continuación buscaremos el elemento mayor del arreglo de enteros, guardar el valor en una variable auxiliar de tipo entero: `mayor`, así mismo guardaremos el índice para identificar el arreglo paralelo `nombres`. 
~~~~
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
        // System.out.println("La edad de " + nombres[i] +"es "+ edades[i] );
~~~~
## Matrices
Inicialización de matrices
~~~~

    int matrix [][] = {{2,4,4},{6,6,9}};
    //int matrix2[][]={v1,v2,v3};{r1,r2,r3};

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if (i==0)
                    System.out.print("\t");
                else
                    System.out.print(matrix[i][j]+"\t");
            }
            System.out.print("\n");

        }
 ~~~~
   
