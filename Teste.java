public class Teste {

    public static void main(String[] args){

        CandidatoDominio cand = new CandidatoDominio();
        cand.adiciona(new Tabela(cand));
        cand.adiciona(new EnviarEmail(cand));
        cand.adiciona(new EnviarSms(cand));

        cand.setState(new Candidato("Pedro ", 46));
        cand.setState(new Candidato("Fernanda ", 80));


    }
    
}
