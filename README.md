# Bienvenido al repositorio de la materia de Progamación de Interfaces Gráficas y Estructura de Datos
En este repositorio se encuentra publicado los ejemplos usados en clases.
## EjemploUno
Hola mundo con **java**
Recordar que el nombre del archivo debe ser el mismo de la clase en este caso seria: ***EjemploUno.java***
~~~~
public class EjemploUno {

    public static void main(String[] args) {
        System.out.println("Hola Mundo");
    }
}
~~~~
## EjemploDos
Tipos de datos y convención de nombres
~~~~
public class EjemploDos {

    public static void main(String[] args) {
        //Declarar variables numerico y texto
        int age; //Declarando
        age=25;   //asignando e inicializando
        char gender = 'M';
        String namePerson = "Marco";
        boolean isVirus = false;
        isVirus = true;

        System.out.println("Hola "+namePerson+" Su edad es: "+age+" su genero es: "+gender+ " Su test fue:"+isVirus );

    }

}

~~~~
## EjemploTres

- Operadores:
    - Asignación
    - Aritméticos
    - Incrementos 
    - Decrementos
- La clase Math de java

### Operador de asignación

En Java es el operador mas simple y esta representado por el digno igual `=` mediante el cual se asigna el valor a una variable.
~~~~
int a=0;
a = a + 10;
int b = a; 
~~~~
### Operadores matemáticos
En java las operaciones matemáticas básicas (suma, resta, producto, división y residuo) las podemos realizar con este tipo de operadores.

~~~~
a=a+b;  //forma larga de asignar a la variable a el valor a mas el valor  b
a=a-b;  //forma larga de asignar a la variable a el valor a menos el valor de b

a=a+b;  //forma corta de asignar a la variable a el valor a mas el valor  b
a=a-b;  //forma corta de asignar a la variable a el valor a menos el valor de b
~~~~
La misma sintaxis funciona para el resto de operacion matemáticas básicas.

![operadormat](/images/asignacion.png "Operadores de asignación")

### Operadores incremento y decremento
Los operadores de incremento y decremento se usa para sumar o restar en 1 el valor de una variable entera.

~~~~
int x = 10;   // x tiene el valor de 10
x++;          // x tiene el valor de 11
x--;            // x tiene el valor de 10

~~~~
También este operador puede expresarse de forma posfija de la siguiente manera:
~~~~
int x = 10;   // x tiene el valor de 10
++x;          // x tiene el valor de 11
--x;            // x tiene el valor de 10
~~~~

Hasta este momento tanto de forma *prefija* como *posfija* el resultado es el mismo, debido que estan declarado en una sentencia simple. 
Consideremos la siguiente sentencia, donde buscamos incrementar el valor de x en 1 y sumarle l variable a:
~~~~
int x = 9;
int a = 1;
x = a + x++;
// El resultado de x es 10
~~~~
A simple vista el resultado debería ser 11 porque sumanos la variable a que tiene 1 y x++ que haciendo el incremento debería ser 10. Sin embargo, en la sentencia `x = a + x++` el compilador no considera el incrementa sino solo el valor de la variable x que hasta ese momento tiene 9.

Ahora la situcion cambia cuando el incremento lo realizamos de forma prefija
~~~~
int x = 9;
int a = 1;
x = a + ++x;
// Ahora si el resultado de x es 11
~~~~

### La clase Math.

La clase Math viene por defecto en el lenguaje java, esta clase trae metodos con las operaciones matemáticas mas usuales que son de uso universal.  

~~~~
double x;
//Redondeo hacia arriba y hacia abjo
x = Math.ceil(2.1) 
x = Math.floar(2.1) 

//Potenciación y radicación
x = Math.pow(2, 3) // EL primer argumento la base y el segundo la potencia
x = Math.sqrt(3)   // Extrae la raiz cuadra del número

// EL numero mayor de 2 numeros
x = Math.max(2, 3) 

//Constantes PI
Math.PI
Math.E 

//Ejericio calcular el area de un círculo
~~~~
