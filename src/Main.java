public class Main {

    public static void main(String[] args){
        Vehiculo vehiculo = new Vehiculo("aéreo");

        Carro miCarro = new Carro("Hyundai", "Elantra", (short)1992);

        CarroElectrico carroNuevo = new CarroElectrico("BYD","Seagull", (short)2025, (short)600);

        Vehiculo[] coleccionGeneral = new Vehiculo [3];
        coleccionGeneral[0] = vehiculo;
        coleccionGeneral[1] = miCarro;
        coleccionGeneral[1] = carroNuevo;

        Carro[] coleccionCarros = new Carro [3];
        coleccionCarros[0] = miCarro;
        coleccionCarros[1] = carroNuevo;
        //coleccionCarros[2] = vehiculo; (Error porque vehiculo no necesariamente es carro)

        // Animales
        Animal perro = new Animal("Perro", "Canis lupus familiaris", 20.5);
        Gato gato = new Gato("Siamés");
        perro.hacerSonido();
        gato.hacerSonido();
        System.out.println();
 
        // Figuras
        Circulo circulo = new Circulo(5);
        Rectangulo rectangulo = new Rectangulo(4, 6);
        System.out.println("Círculo -> Área: " + circulo.calcularArea() + " | Perímetro: " + circulo.calcularPerimetro());
        System.out.println("Rectángulo -> Área: " + rectangulo.calcularArea() + " | Perímetro: " + rectangulo.calcularPerimetro());
        System.out.println();
 
        // Empleados
        Empleado ana = new Empleado("Ana", " Mora", "Desarrolladora");
        EmpleadoRH luis = new EmpleadoRH("Luis", " Vargas");
        Empleado carlos = luis.contratarEmpleado("Carlos", "Rojas", "Analista");
 
        ana.trabajar();
        luis.trabajar();
        carlos.trabajar();
        System.out.println("Salario semanal de Ana: " + ana.calcularSalario());
    }
}
