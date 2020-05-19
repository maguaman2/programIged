# Vectores paralelos y matrices.
## Ejemplo para nombres y edades con vectores

En este ejemplo se usa dos vecrtores para guardar información de forma paralela, es decir, que los elementos del primer vector `nombres[]` tendrán relacion con los elementos del segundo vector `edades[]`, el índice servira como referencia para emparejar los elementos. 

Adicionalmente se usa otra forma de declarar y definir directamente los valores de  los arreglos.

~~~~
 String nombres[] = {"Juan", "Pedro","Judas"};
        int edades[]= {34,56,64};
~~~~
El ciclo `for` recorre el vector por todas las posiciones, dentro de esta iteración se compara entre los elementos del vector `edades[]` y a través de una sentencia `if` si la condición devuelve `true` se guarda en una variable auxiliar `mayor` el valor mas alto de ese array. Por otro lado, se declara también la variable `posicion` para guardar el índice del vector mas alto, y con este índice obtener el nombre en el vector paralelo `nombres`.
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
Inicialización de matrices o vectores multidimensionales
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
 ### Tamaño de vectores multidimensionales
 
Para la condicional del `for` se puede obtener el tamaño el vector de forma dinámica. Es decir, no especificar con numero  el tamaño del vector, sino, obtener a través de un atributo del vector.
 ~~~~
 int matrix [][]={{4,5,6},{6,7,8},{30,45,60},{20,40,60}};
for (int i=0;i<matrix.length ;i++){
            for (int j=0;j< matrix[i].length ;j++)
            {    
               System.out.print(matrix[i][j]);               
                
               System.out.print("\t"); 
            }
            
            System.out.print("\n"); 
        }
~~~~

En esta matriz bidimensional llamada `matrix[][]` el primer `for` necesita conocer el tamaño del vector, el cual se obtiene con `matrix.length`. En el caso del segunfo `for` el tamaño se obtiene con `matrix[indice].lenght`

  
  
  
  Código disponible en el siguiente enlace: [Code](VectorParalelo.java)
