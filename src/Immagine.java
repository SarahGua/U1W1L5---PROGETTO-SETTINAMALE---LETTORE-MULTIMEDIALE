public class Immagine extends ElementoMultimediale{
    //ATTRIBUTI
    public int luminosita;

    public Immagine(String titolo) {
        super(titolo);
    }

    //METODI
    public void Show(int luminosita, String titolo){
        StringBuilder asterischi = new StringBuilder();
        for(int i = 0; i < luminosita; i++){
            System.out.println(titolo + asterischi.append("*"));
        }



    }

}
