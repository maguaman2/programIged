# Lectura y escritura de archivo en Java

## Crear archivo y guardar texto.
~~~~
File file1 = new File("c:\\java\\archivo.txt");
          BufferedReader entrada = new BufferedReader(new FileReader(file1));
          String lee = entrada.readLine();
          while (lee!=null)
          {
              System.out.println(lee);
              lee = entrada.readLine();
          }
          entrada.close();
~~~~
## Abrir y mostrar archivo
~~~~
  FileWriter file= new FileWriter("c:\\java\\archivo.txt",true);
        PrintWriter printer= new PrintWriter(file);
        printer.println("Escribiendo en el archivoor");
        printer.close();  
      
    ~~~~   
