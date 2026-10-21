public class EmpleadoRH extends Empleado{

    public EmpleadoRH(String nombre, String apellidos){
        super(nombre, apellidos, "Recursos humanos");
    }

    public Empleado contratarEmpleado(String nombre, String apellidos, String puesto){
        Empleado nuevoEmpleado = new Empleado(nombre, apellidos, puesto);
        System.out.println("Se ha contratado a: " + nombre + " " + apellidos);
        return nuevoEmpleado;
    }

}
