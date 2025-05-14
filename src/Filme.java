public class Filme {
    String nome;

    // abaixo, temos os atributos / caracteristicas ( podem ser vários )
    int anoLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalAvaliacoes;
    int duracao;

    // abaixo, temos os métodos / comportamentos

    void exibeFichaTecnica() { // quando um método não tem um retorno, chamamos de VOID
        System.out.println("Nome do Filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoLancamento);
    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;
    }

    double pegaMedia() {
        return somaDasAvaliacoes / totalAvaliacoes;
    }
}
