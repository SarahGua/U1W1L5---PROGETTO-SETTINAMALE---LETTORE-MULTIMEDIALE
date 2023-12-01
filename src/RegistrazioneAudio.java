public class RegistrazioneAudio extends ElementoMultimediale implements Volume, Player{
    //ATTRIBUTI
    public int durata;
    public int volume;

    //COSTRUTTORE
    public RegistrazioneAudio(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }

    //METODI

    @Override
    public void play() {
        StringBuilder puntiEsclamativi = new StringBuilder();
        for(int i = 0; i < volume; i++){
            puntiEsclamativi.append("!");
        }
        for(int i = 0; i < durata; i++){
            System.out.println(titolo + puntiEsclamativi);
        }
    }
    public void aumentaVolume(){
        if(volume > 0){
            volume--;
        }
    }

    public void diminuisciVolume(){
        volume++;
    }

    @Override
    public void abbassaVolume() {
        if(volume > 0){
            volume--;
        }
    }

    @Override
    public void alzaVolume() {
        volume++;
    }

}
