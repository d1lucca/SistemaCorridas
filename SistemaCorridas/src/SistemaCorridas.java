// Classe principal para executar o sistema
public class SistemaCorridas {
	
    public static void main(String[] args) {
    	
        // Criar um administrador
        Administrador admin = new Administrador("Carlos", "admin@corridas.com");

        // Criar percursos
        admin.criarPercurso("Percurso 5k", 5.0);
        admin.criarPercurso("Percurso 10", 10.0);

        // Criar corridas
        Percurso percurso1 = admin.getPercursos().get(0); // Percurso 5km
        admin.criarCorrida("Corrida 5k", percurso1);

        Percurso percurso2 = admin.getPercursos().get(1); // Percurso 10km
        admin.criarCorrida("Corrida 10k", percurso2);

        // Criar corredores
        Corredor corredor1 = new Corredor("Ciara", "ciara@exemplo.com");
        Corredor corredor2 = new Corredor("Guilherme", "guilherme@exemplo.com");

        // Inscrever corredores nas corridas
        Corrida corrida1 = admin.getCorridas().get(0); // Corrida 5k
        corredor1.inscreverCorrida(corrida1);
        corrida1.adicionarCorredor(corredor1);

        Corrida corrida2 = admin.getCorridas().get(1); // Corrida 10k
        corredor2.inscreverCorrida(corrida2);
        corrida2.adicionarCorredor(corredor2);

        // Exibir informações das corridas
        System.out.println("\nInformações das corridas:");
        for (Corrida corrida : admin.getCorridas()) {
            System.out.println("Corrida: " + corrida.getNome());
            System.out.println("Percurso: " + corrida.getPercurso().getNome() + 
                               " (" + corrida.getPercurso().getDistancia() + " km)");
            System.out.println("Inscritos:");
            for (Corredor inscrito : corrida.getInscritos()) {
                System.out.println("- " + inscrito.getNome());
            }
            System.out.println();
        }
    }
}