public class Video extends ElementoMultimediale implements Player{
    //ATTRIBUTI
    public int durata;
    public int volume;
    public int luminosita;

    //COSTRUTTORE
    public Video(String titolo) {
        super(titolo);
    }

    //METODI
    public interface Player{
        public default void play(String titolo, int volume, int durata){
            
        };
    }




    public void aumentaLuminosita(){

    }

    public void diminuisciLuminosita(){

    }

}
