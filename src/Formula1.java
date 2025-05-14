public class Formula1 {
    public static void main(String[] args) {
        Inscrito lauda = new Inscrito();
        lauda.nome = "Nick Lauda";

        Inscrito hunt = new Inscrito();
        hunt.nome = "James Hunt";


        Equipe mclaren = new Equipe();
        mclaren.nomeEquipe = "McLaren";

        mclaren.participante1 = lauda;
        mclaren.participante2 = hunt;

        lauda.equipe = mclaren;
        hunt.equipe = mclaren;

        mclaren.exibirParticipantes();
        lauda.fichaTecnica();
        hunt.fichaTecnica();
    }

}
