public class BicicletasMontanyas extends Bicicletas {

    private int suspensiones;

    public BicicletasMontanyas(String codigoDeBicicleta, int anoDeFabricacion, double peso, int suspensiones) {
        super(codigoDeBicicleta, anoDeFabricacion, peso);
        setSuspensiones(suspensiones);
    }

    public int getSuspensiones() {
        return suspensiones;
    }

    public void setSuspensiones(int suspensiones) {
        if (suspensiones < 0) {
            throw new IllegalArgumentException("La cantidad de suspensiones no puede ser negativa.");
        }
        this.suspensiones = suspensiones;
    }

    @Override
    public double calcularCostoMantencion() {
        double costoBase = 30000;
        if (this.suspensiones > 1) {
            costoBase *= 1.15;
        }
        return costoBase;
    }
}