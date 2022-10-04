public class Tabela extends CandidatoObserver {

    public Tabela(CandidatoDominio candidato){
        super(candidato);
    }
    
    @Override
    public void update(){
        System.out.println("Candidatos: " + candidato.getState().nome + "Votos: " + candidato.getState().votos);
        
    }
}
