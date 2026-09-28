import java.util.ArrayList;
import java.util.List;

public class GestorTaller {

    private List<Bicicletas> listaBicicletas;

    public GestorTaller() {
        this.listaBicicletas = new ArrayList<>();
    }

    public void registrarBicicleta(Bicicletas bicicleta) {
        listaBicicletas.add(bicicleta);
        System.out.println(bicicleta.getCodigoDeBicicleta() + " (" + bicicleta.getClass().getSimpleName() + ") registrada correctamente.");
    }

    public Bicicletas buscarPorCodigo(String codigo) {
        for (Bicicletas bici : listaBicicletas) {
            if (bici.getCodigoDeBicicleta().equalsIgnoreCase(codigo)) {
                return bici;
            }
        }
        return null;
    }

    public void listarBicicletas() {
        System.out.println("\n=== LISTADO DE BICICLETAS ===");
        for (Bicicletas bici : listaBicicletas) {
            System.out.println(bici.toString());
        }
    }
}