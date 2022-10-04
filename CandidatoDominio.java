import java.util.ArrayList;

public class CandidatoDominio {
    
protected ArrayList<CandidatoObserver>observers;
protected Candidato candidato;

public CandidatoDominio(){

    observers = new ArrayList<CandidatoObserver>();

}

public void adiciona(CandidatoObserver observer){
    observers.add(observer);

}

public void remove(int indice){
    observers.remove(indice);
}

public void setState(Candidato candidato){
    this.candidato = candidato;
    notifyObservers();
}


private void notifyObservers(){

    for(CandidatoObserver observer : observers){
        observer.update();
    }
    
}

public Candidato getState(){
    return candidato;
}

}
