public class RegistrazioneAudio extends ElementoMultimediale {
    //ATTRIBUTI
    public int duarata;
    public int volume;

    //COSTRUTTORE
    public RegistrazioneAudio(String titolo) {
        super(titolo);
    }

    //METODI
    public void play(){
        System.out.println(titolo + "!");
    }

    public void aumentaVolume(){

    }

    public void diminuisciVolume(){

    }
}
