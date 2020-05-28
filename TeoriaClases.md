# Concepto de Clases en Java
Hasta ahora hemos trabajado únicamente con una clase, generalmente donde estaba el metodo `main`. El lenguaje Java nos permite
crear nuestras propias clases que tendras sus atributos y comportamientos. Cada nueva clase debe ser creada en archivo separados.
## Ejemplo clase persona
Tomaramos como ejemplo una clase llamada Persona, para poder abstraer una clase es necesario prestar a tencion a un objeto, 
observar su composicion y generar un molde (osea definir la clase).

![Fig.1](https://entrenamiento-python-basico.readthedocs.io/es/latest/_images/objetos_clases.png)

En la figura 1 se muestra un molde(clase) que ha sido obtenido luego de analizar a una persona(objeto). Ahora esto lo convertiremos en codigo Java.

~~~~
public class Persona{
  // Aca se declaran los atributos de una clase. 
  private int cedula;
  private String nombre;
  private int edad;
  
  //Ahora debemos definir el comportamiento o lo que puede hacer la persona.
  public void puedeCaminar(){  
  System.out.println("La persona esta caminando");  
  }  
}
~~~~

Si queremos probar esta clase necesitaremos de otra clase, una clase que tenga un método `main` y pueda ser reconocida como punto de partida por la `JVM`. Como ejemplo vamos a crear la clase ProbarPersona.

~~~~
public class ProbarPersona{
  public static void main(String args[])
    {
        Persona persona = new Persona(); //Punto 1
        persona.puedeCaminar();  //Punto 2  
    }  
}
~~~~
### Aclarando puntos
1. 
