# Colecciones
Son estructuras de datos que permiten almancenar informacion de diferentes tipos.

Las colecciones mas usadas son: Set, List, Map

## Colecciones tipo *List*
- Colecciones ordenadas de elementos 
- Permite elementos duplicados

Para usar esta coleccion debemos importar lo siguiente: `import java.util.ArrayList;` y `import java.util.List;`
~~~~
   //Declarar e inicializar una colección(objeto) de tipo List
   List<Integer> lista =  new ArrayList();
 
        //Agrega elementos a la lista de tipo integer
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(4);
        //imprimir(lista2);  
 ~~~~
## Colecciones tipo *Set* 
 ~~~~
            
        Set<Integer> lista2 =  new HashSet();
        lista2.add(1);
        lista2.add(2);
        lista2.add(3);
        lista2.add(4);
        lista2.add(4);
        //imprimir(lista2);        
        
~~~~
## Lista de colecciones de tipo *s*
~~~~
Map mapa = new HashMap();
        mapa.put("Valor1", "Juan");
        mapa.put("Valor2", "Luis");
        mapa.put("Valor3", "Calos");
        //imprimir(mapa.values());
~~~~
## Método para imprimir las colecciones

Para esto se usa el for mejorado.
~~~~
public void imprimir (Collection coleccion)
{
  for (Object elemento : coleccion)
  {
  System.out.println("Elemento: "+elemento);
  }
}
~~~~

## Lista de colecciones de tipo *List* con instancias de la clase estudiante
Para este ejemplo se debe primero tener definida la clase Estudiante. [Clases](./TeoriaClases.md)
~~~~
        List<Estudiante> listaEstudiantes =  new ArrayList();
        Estudiante e1= new Estudiante();
        e1.setId(1);
        e1.setNombre("Juan");
        e1.setEdad(18);
        listaEstudiantes.add(e1);
~~~~





