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
En java las operaciones matematicas basicas las podemos realuzar con este tipo de operadores.
![operadormat](/images/asignacion.png "Operadores de asignación")

~~~~
public class EjemploTres {

    public static void main(String[] args) {
        //Incrementos Decrentes
        int a, b; //Declarando dos variables en una lines
        int z=2; //2 puntos por poner el nombre
        a=0;
        b=0;

        //a=a+z;  //forma larga de incremento
        a+=z;    //Forma corta de incremento
        b=b+z;

        //a=a+1;   //Forma larga de incrementar  1;
        a++;     //Forma corta de incremntar 1
        b=b+1;

        a--;   // incremento posfijo
        b--;

        ++a;   // incremento prefijo
        ++b;

        a= a + ++a;

       // System.out.printf("El puntaje de A es: %d ek puntaje de B es %d",a,b);   //Dar formato a la salida

        // Funciones clase MATH

        int valor1, x;
        x=9;
        double valor2;

        valor2 = Math.sqrt(x);
        valor2 = Math.pow(2,5);

        valor2 = Math.ceil(8.65898);
        valor2 = Math.floor(8.65898);
        System.out.println(valor2);


    }

}

~~~~
