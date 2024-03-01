import clasesEmpleados.EmpleadoMarketing;
import clasesNaves.Asteroide;
import clasesNaves.Nave;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Empleados
        EmpleadoMarketing empleado1 = new EmpleadoMarketing("Pepe", "Ramos", "12345", "Redes sociales");
        empleado1.trabajar();
        empleado1.trabajar(3);
        System.out.println(empleado1);
        //Naves
        Nave nave1 = new Nave(0,0,'E',3.0);
        nave1.irA(13,4,'E');
        nave1.restaVida(5);
        nave1.girar('S');
        System.out.println(nave1);

        Asteroide asteroide1 = new Asteroide(0,0,'S',3);
        asteroide1.irA(9,12,'E');
    }
}