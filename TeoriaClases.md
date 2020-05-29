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
1. La palabra clave `new`  crea un nuevo objeto que lo se llama `persona` y es del tipo `Persona`. Este proceso es conocido como `instancia` de la clase. Junto a la palabra clave se vuelve a repetir el nombre de la clase, pero esta vez con los `paréntesis`, esto significa que esxiste un `metodo` que crea el objeto `persona`. Ese método `Persona()` se denomina `constructor`.

2. Una vez creado el objeto `persona` ahora podemos utilizar los métodos definidos en la clase `Persona`, y se accede con el punto luego escribimos el nombre del metodo que en esta caso es `puedeCaminar();`  
