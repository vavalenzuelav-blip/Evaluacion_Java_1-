public class Main {
    public static void main(String[] args) {
        GestorTaller gestor = new GestorTaller();

        // 1. Instanciación correcta de las 4 bicicletas
        BicicletasElectricas biciE1 = new BicicletasElectricas("BIC-E01", 2023, 22.5, 60.0, false);
        BicicletasElectricas biciE2 = new BicicletasElectricas("BIC-E02", 2022, 24.0, 45.0, true);
        BicicletasMontanyas biciM1 = new BicicletasMontanyas("BIC-M01", 2021, 13.5, 2);
        BicicletasMontanyas biciM2 = new BicicletasMontanyas("BIC-M02", 2020, 12.0, 1);


        biciE1.activarGarantiaExtendida();


        gestor.registrarBicicleta(biciE1);
        gestor.registrarBicicleta(biciE2);
        gestor.registrarBicicleta(biciM1);
        gestor.registrarBicicleta(biciM2);

        System.out.println("=== Busqueda por codigo : \"BIC-E01\" ===");
        Bicicletas buscada = gestor.buscarPorCodigo("BIC-E01");

        if (buscada instanceof BicicletasElectricas) {
            BicicletasElectricas e = (BicicletasElectricas) buscada;
            String cert = e.isBateriaCertificada() ? "Si" : "No";
            String gar = e.tieneGarantiaExtendida() ? "Si" : "No";

            System.out.println("Tipo: Bicicleta Eléctrica | Código: " + e.getCodigoDeBicicleta() +
                    " | Año: " + e.getAnoDeFabricacion() +
                    " | Peso: " + e.getPeso() + " kg" +
                    " | Autonomía: " + (int)e.getAutonomia() + " km" +
                    " | Batería certificada: " + cert +
                    "\n Garantía extendida: " + gar +
                    " | Costo mantención: $" + (int)e.calcularCostoMantencion());
        }
        System.out.println("---");

        // . AQUI LISTARÁ TODAS LAS BICICLETAS :)
        gestor.listarBicicletas();
    }
}