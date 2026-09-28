public abstract class Bicicletas {
    private String codigoDeBicicleta;
    private int anoDeFabricacion;
    private double peso;

    public Bicicletas(String codigoDeBicicleta, int anoDeFabricacion, double peso) {
        setCodigoDeBicicleta(codigoDeBicicleta);
        setAnoDeFabricacion(anoDeFabricacion);
        setPeso(peso);
    }

    public String getCodigoDeBicicleta() {
        return codigoDeBicicleta;
    }

    public void setCodigoDeBicicleta(String codigoDeBicicleta) {
        if (codigoDeBicicleta == null || codigoDeBicicleta.trim().isEmpty()) {
            throw new IllegalArgumentException("El código de la bicicleta no puede ser nulo ni estar vacío.");
        }
        this.codigoDeBicicleta = codigoDeBicicleta;
    }

    public int getAnoDeFabricacion() {
        return anoDeFabricacion;
    }

    public void setAnoDeFabricacion(int anoDeFabricacion) {
        if (anoDeFabricacion < 2000 || anoDeFabricacion > 2026) {
            throw new IllegalArgumentException("El año de fabricación debe estar entre 2000 y 2026.");
        }
        this.anoDeFabricacion = anoDeFabricacion;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("El peso debe ser un valor mayor que cero.");
        }
        this.peso = peso;
    }

    public abstract double calcularCostoMantencion();

    @Override
    public String toString() {
        return "Código: " + getCodigoDeBicicleta() + " | Año: " + getAnoDeFabricacion();
    }
}