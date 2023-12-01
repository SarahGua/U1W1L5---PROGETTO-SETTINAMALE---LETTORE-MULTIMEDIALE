public class Video extends ElementoMultimediale {
    //ATTRIBUTI
    public int duarata;
    public int volume;
    public int luminosita;

    //COSTRUTTORE
    public Video(String titolo) {
        super(titolo);
    }

    //METODI
    public void play(){
        System.out.println(titolo + "!");
    }

    public void aumentaLuminosita(){

    }

    public void diminuisciLuminosita(){

    }

}
