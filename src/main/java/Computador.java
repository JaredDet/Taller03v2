public class Computador {

    private MemoriaRAM memoriaRAM;
    private String marca;
    private String modelo;

    public Computador() {
    }

    public MemoriaRAM getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMemoriaRAM(MemoriaRAM memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    @Override
    public String toString() {
        return "  Marca: " + marca + "\n" +
                "  Modelo: " + modelo + "\n" +
                "  \n" + "Memoria RAM: " + "\n" + memoriaRAM.toString() + "\n";
    }
}