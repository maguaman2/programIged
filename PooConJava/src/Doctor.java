public class Doctor {
    static int id=0;  //Con static el valor del dato prevalece mas alla de la instancia
    String name;
    String speciality;

    Doctor (){
        System.out.println("Construyendo");
        id++;
    }
    Doctor (String nombre){
        System.out.println("Construyendo " +nombre);
    }
    //comportameintos
    public void showName()
    {
        System.out.println(name);
    }
    public void showId()
    {
        System.out.println(id);
    }

}
