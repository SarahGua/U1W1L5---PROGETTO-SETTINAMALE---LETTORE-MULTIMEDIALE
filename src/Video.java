public class Video extends ElementoMultimediale implements Player, Luminosità, Volume{
    //ATTRIBUTI
    public int durata;
    public int volume;
    public int luminosita;

    //COSTRUTTORE
    public Video(String titolo, int volume, int luminosita, int durata) {
        super(titolo);
        this.volume = volume;
        this.luminosita = luminosita;
        this.durata = durata;

    }

    //METODI
    @Override
    public void play() {
        StringBuilder puntiEsclamativi = new StringBuilder();
        StringBuilder asterischi = new StringBuilder();
        for(int i = 0; i < volume; i++){
            puntiEsclamativi.append("!");
        }
        for(int i = 0; i < luminosita; i++){
            asterischi.append("*");
        }
        for(int i = 0; i < durata; i++){
            System.out.println(titolo + puntiEsclamativi + asterischi);
        }

    }



    @Override
    public void alzaLuminosita() {
        luminosita++;
    }

    @Override
    public void abbassaLuminosita() {
        if(luminosita > 0){
            luminosita--;
        }
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
