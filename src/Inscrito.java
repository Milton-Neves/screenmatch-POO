public class Inscrito {
    String nome;
    Equipe equipe;

    void fichaTecnica() {
        System.out.println("Participante: " + nome);
        if (equipe != null) {
            System.out.println("Equipe: " + equipe.nomeEquipe);
        }
    }
}
