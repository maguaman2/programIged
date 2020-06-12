
public class Burbuja {
    public static void main(String[] args) {
     /* //public int[] sumadosnumeros(int[])  
        int[] numeros ={2,15,11,7,85};
        int[] resultado = new int[2];
        //numeros[0]=7
        //numeros[1]=15
        //numeros[2]=11
        //numeros[3]=2
        //numeros[4]=16
        int suma = 9;
        for(int i=0; i<numeros.length;i++)
        {
            for(int j=i+1; j<numeros.length;j++)
            {   
                if((numeros[i]+numeros[j])==suma)
                    System.out.println("Solcion encontrada, los indices son: "+ i + " y "+j);
                //System.out.println("Comparando " + numeros[i] +" con "+numeros[j]);
                
            }
        }     
        */
     // aux = 15
     int aux;
                    //0 1  2  3  4
     int[] numeros ={11,7,15,20,1};
        for (int i=0;i<numeros.length;i++){
             System.out.println("\n::Primer for i en "+i+". j ira hasta el indice menor a "+((numeros.length-1)-i) );
      
                for (int j=0;j<(numeros.length-1) ;j++){
                    System.out.printf("Compara %d es mayor a %d - con j en %d",numeros[j],numeros[j+1],j);  
                    if(numeros[j]>numeros[j+1])
                    {
                        System.out.printf(" si, Cambiando..");
                    aux = numeros[j];
                    numeros[j]=numeros[j+1];
                    numeros[j+1]=aux;                                       
                    }
                    System.out.printf("\n");
                }
                
                }
        
        for (int num :  numeros )
        {
           System.out.println("" +num);
        }
        
        
        
    }
}
