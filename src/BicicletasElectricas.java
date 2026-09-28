public class BicicletasElectricas extends Bicicletas implements ConGarantiaExtendida {
    private double autonomia;
    private boolean bateriaCertificada;
    private boolean garantiaExtendidaActiva;

    public BicicletasElectricas(String codigoDeBicicleta, int anoDeFabricacion, double peso, double autonomia, boolean bateriaCertificada) {
        super(codigoDeBicicleta, anoDeFabricacion, peso);
        setAutonomia(autonomia);
        setBateriaCertificada(bateriaCertificada);
        this.garantiaExtendidaActiva = false;
    }

    public double getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(double autonomia) {
        if (autonomia <= 0) {
            throw new IllegalArgumentException("La autonomía debe ser mayor que cero.");
        }
        this.autonomia = autonomia;
    }

    public boolean isBateriaCertificada() {
        return bateriaCertificada;
    }

    public void setBateriaCertificada(boolean bateriaCertificada) {
        this.bateriaCertificada = bateriaCertificada;
    }

    @Override
    public boolean tieneGarantiaExtendida() {
        return this.garantiaExtendidaActiva;
    }

    @Override
    public void activarGarantiaExtendida() {
        this.garantiaExtendidaActiva = true;
    }

    @Override
    public double calcularCostoMantencion() {
        double costoBase = 45000;
        if (!bateriaCertificada) {
            costoBase *= 1.25; // Incremento del 25% si no está certificada
        }
        return costoBase;
    }
}