# Colecciones
Son estructuras de datos que permiten almancenar informacion de diferentes tipos.

Las colecciones mas usadas son: Set, List, Map

## Colecciones tipo *List*
- Colecciones ordenadas de elementos 
- Permite elementos duplicados

Para usar esta coleccion debemos importar lo siguiente: `import java.util.ArrayList;` y `import java.util.List;`
~~~~
 List<Integer> lista =  new ArrayList();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(4);
        
        List<Estudiante> listaEstudiantes =  new ArrayList();
        Estudiante e1= new Estudiante();
        e1.setId(1);
        e1.setNombre("Juan");
        e1.setEdad(18);
        listaEstudiantes.add(e1);
        
        Estudiante e2= new Estudiante();
        e2.setId(1);
        e2.setNombre("Juan");
        e2.setEdad(18);
        listaEstudiantes.add(e2);
      //imprimir(listaEstudiantes);
      imprimir(listaEstudiantes);
            
        Set<Integer> lista2 =  new HashSet();
        lista2.add(1);
        lista2.add(2);
        lista2.add(3);
        lista2.add(4);
        lista2.add(4);
        //imprimir(lista2);
        
        Map mapa = new HashMap();
        mapa.put("Valor1", "Juan");
        mapa.put("Valor2", "Luis");
        mapa.put("Valor3", "Calos");
        //imprimir(mapa.values());
~~~~


### 

## Colecciones tipo *Set*

