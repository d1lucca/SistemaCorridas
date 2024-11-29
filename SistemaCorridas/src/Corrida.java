import java.util.ArrayList;
import java.util.List;

public class Corrida {
	
    private String nome;
    private Percurso percurso;
    private List<Corredor> inscritos = new ArrayList<>();

    public Corrida(String nome, Percurso percurso) {
        this.nome = nome;
        this.percurso = percurso;
    }

    public void adicionarCorredor(Corredor corredor) {
        inscritos.add(corredor);
    }

    public String getNome() {
        return nome;
    }

    public Percurso getPercurso() {
        return percurso;
    }

    public List<Corredor> getInscritos() {
        return inscritos;
    }
}
