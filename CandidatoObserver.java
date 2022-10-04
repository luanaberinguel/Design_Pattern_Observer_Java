public abstract class CandidatoObserver {

    protected CandidatoDominio candidato;

    public CandidatoObserver(CandidatoDominio candidato){
        this.candidato =  candidato;
    }
    
    public abstract void update();
}
