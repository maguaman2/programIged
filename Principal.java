import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;



public class Principal {
    public static void main(String[] args) {
        try {
            /*                  //0  1 2  3  4  5  6 7   8-- tamano es:8
            int[] nums = {8,7,34,34,45,56,75,2};
            int target = 9;
            //Ejercicio nos pide los indices de los numeros que suman 9
            try{
            for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
            if (nums[j]+ nums[i] == target ) {
            System.out.printf("Los indice son: %d y %d ",i,j);
            //return new int[] { i, j };
            }
            }
            }
            int numero=5/0;
            }
            catch (Exception ex){
            System.out.println(ex.getClass()+ex.getMessage());
            }
            */
            
            //Clase FileWriter y PrinterWriter para escribir inf en archivo
            
            FileWriter archivo = new FileWriter("c:\\java\\prueba.txt",true);
            PrintWriter printer = new PrintWriter(archivo);
            printer.println("Escribiendo un mensaje 2");
            printer.close();
            
            //BuefferReader 
            
            
        } catch (IOException ex) {
            System.out.println(""+ex.getMessage());
        }       
    }  
    
}
