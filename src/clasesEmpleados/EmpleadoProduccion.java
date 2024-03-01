package clasesEmpleados;

public class EmpleadoProduccion extends Empleado{

    private int tiempoExperiencia;

    public EmpleadoProduccion(String nombre, String apellido, String dni, int tiempoExperiencia){
        super(nombre, apellido, dni);
        this.tiempoExperiencia = tiempoExperiencia;
    }


    @Override
    public void trabajar(){
        System.out.println("Empleado de Producción" +  getNombre());
    }
}
