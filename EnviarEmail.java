public class EnviarEmail extends CandidatoObserver {
    
    public EnviarEmail(CandidatoDominio candidato){
        super(candidato);
    }

        @Override
        public void update() {
            System.out.println("Enviando email.");
        }

}
