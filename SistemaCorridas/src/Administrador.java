import java.util.ArrayList;
import java.util.List;



public class Administrador extends Usuario 

	implements Criador {
	    private List<Corrida> corridas = new ArrayList<>();
	    private List<Percurso> percursos = new ArrayList<>();

	    public Administrador(String nome, String email) {
	        super(nome, email);
	    }

	    @Override
	    public void criarCorrida(String nome, Percurso percurso) {
	        Corrida corrida = new Corrida(nome, percurso);
	        corridas.add(corrida);
	        System.out.println("Corrida '" + nome + "' criada pelo administrador " + this.nome);
	    }

	    @Override
	    public void criarPercurso(String nome, double distancia) {
	        Percurso percurso = new Percurso(nome, distancia);
	        percursos.add(percurso);
	        System.out.println("Percurso '" + nome + "' criado com distância de " + distancia + " km");
	    }

	    public List<Corrida> getCorridas() {
	        return corridas;
	    }

	    public List<Percurso> getPercursos() {
	        return percursos;
	    }
	}

