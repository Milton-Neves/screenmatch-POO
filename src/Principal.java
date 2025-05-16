import br.com.alura.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.setNome("Terminator");
        meuFilme.setAnoLancamento(1994);
        meuFilme.setDuracao(120);


//        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

//        System.out.println("Soma das Avaliações: " + meuFilme.somaDasAvaliacoes);

        String sufixo = meuFilme.sufixoAvaliacao() == 1 ? "avaliação" : "avaliações";
        System.out.println("Total das avaliações: " + meuFilme.getTotalAvaliacoes() + " " + sufixo);

//        System.out.println(meuFilme.pegaMedia());


    }
}