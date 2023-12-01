public class Immagine extends ElementoMultimediale{
    //ATTRIBUTI
    public int luminosita;

    public Immagine(String titolo) {
        super(titolo);
    }

    //METODI
    public void Show(){
        System.out.println(titolo + "!");
    }

}
