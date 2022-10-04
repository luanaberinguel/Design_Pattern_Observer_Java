public class EnviarSms extends CandidatoObserver {
    
    public EnviarSms(CandidatoDominio candidato){
        super(candidato);
    }

        @Override
        public void update() {
            System.out.println("Enviando SMS.");
        }

}    

