public class CarroElectrico extends Carro {

    // Atributos
    private short autonomia;

    // Métodos
    // Constructor
    public CarroElectrico(String marca, String modelo, short anio, short autonomia) {
        super(marca, modelo, anio);
        this.autonomia = autonomia;

    }

    //Getters
    public short getAutonomia() {
        return autonomia;
    }

    //Setters
    public void setAutonomia(short autonomia) {
        this.autonomia = autonomia;
    }


}
