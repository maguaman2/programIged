import static ui.UIMenu.*;

public class Main {

    public static void main(String[] args) {
        Doctor myDoctor;   //Declarar
        //myDoctor= new Doctor();  // Instanaciar
        myDoctor= new Doctor();
        myDoctor.name="Juan";
        myDoctor.showName();
        myDoctor.showId(); // imprime: 1

        myDoctor= new Doctor();
        myDoctor.showId();  // imprime: 2

        showMenu(); //Llamar menu de otra clase de otro package gracias a public y static.

    }
}
