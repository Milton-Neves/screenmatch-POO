public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        // na parte da ESQUERDA: A variável 'meuFilme', do tipo: Filme, pode armazenar um objeto da classe 'Filme'.

        // na parte da DIREITA: Estou criando um novo objeto com o operador 'new'. O resultado disso é uma instância de Filme na memória.

        // Resumindo, criamos um objeto de Filme e armazena a referência dele na variável meuFilme.

        meuFilme.nome = "Pulp Fiction";

        // Em: meuFilme.nome, isso acessa o atributo nome do objeto meuFilme.

        // atribui Pulp Fiction ao atributo nome.

        // Resumindo: Você está atribuindo o valor "Pulp Fiction" ao atributo nome do objeto meuFilme.


        // INSTANCIANDO OBJETOS
        meuFilme.anoLancamento = 1994;
        meuFilme.duracao = 120;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Soma das Avaliações: " + meuFilme.somaDasAvaliacoes);
        System.out.println("Total das avaliações: " + meuFilme.totalAvaliacoes);

        System.out.println(meuFilme.pegaMedia());
    }
}