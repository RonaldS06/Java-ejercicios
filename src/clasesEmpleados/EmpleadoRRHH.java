package clasesEmpleados;

public class EmpleadoRRHH extends Empleado {

    private int altasLogradas;

    public EmpleadoRRHH(String nombre, String apellido, String dni, int altasLogradas) {
        super(nombre, apellido, dni);
        this.altasLogradas = altasLogradas;
    }

    //Se ejecuta este codigo y no el del padra.
    @Override
    public void trabajar(){
        System.out.println("Empleado de RRHH" +  getNombre() + " trabajando");
    }

}
