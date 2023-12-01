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
            asterischi.append("*");
        }
        System.out.println(titolo + asterischi);

//        for(int i = 0; i < luminosita; i++){
//            System.out.println(titolo + asterischi);
//        }

    }

    public void aumentaLuminosita(){
        luminosita++;
    }

    public void diminuisciLuminosita(){
        if(luminosita > 0) {
            luminosita--;
        }
    }
}
