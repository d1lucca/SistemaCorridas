import java.util.ArrayList;
import java.util.List;

class Corredor extends Usuario {
    private List<Corrida> corridas = new ArrayList<>();

    public Corredor(String nome, String email) {
        super(nome, email);
    }

    public void inscreverCorrida(Corrida corrida) {
        corridas.add(corrida);
        System.out.println(nome + " inscrito na corrida " + corrida.getNome());
    }

    public List<Corrida> getCorridas() {
        return corridas;
    }
}
