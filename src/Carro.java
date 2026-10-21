public class Carro extends Vehiculo {

    // Atributos
    protected String marca;
    protected String modelo;
    protected short anio;

    // Métodos
    // Constructor
    public Carro(String marca, String modelo, short anio) {
        super("terrestre");
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;

    }

    //Getters
    public String getMarca() {
        return marca;
    }
    
    public short getAnio() {
        return anio;
    }

    public String getModelo() {
        return modelo;
    }

    // Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnio(short anio) {
        this.anio = anio;
    }
}
