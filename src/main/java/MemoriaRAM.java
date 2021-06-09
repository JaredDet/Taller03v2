public class MemoriaRAM {

    private String marca;
    private int capacidadGB;
    private int frecuenciaHz;

    public MemoriaRAM(String marca, int capacidadGB, int frecuenciaHz) {
        this.marca = marca;
        this.capacidadGB = capacidadGB;
        this.frecuenciaHz = frecuenciaHz;
    }

    public MemoriaRAM() {
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCapacidadGB(int capacidadGB) {
        this.capacidadGB = capacidadGB;
    }

    public void setFrecuenciaHz(int frecuenciaHz) {
        this.frecuenciaHz = frecuenciaHz;
    }

    @Override
    public String toString() {
        return "  Marca: " + marca + "\n" +
                "  Capacidad GB: " + capacidadGB + "\n" +
                "  Frecuencia Hz: " + frecuenciaHz + "\n";
    }
}