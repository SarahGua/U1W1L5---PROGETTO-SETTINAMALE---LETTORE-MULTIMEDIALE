public class Immagine extends ElementoMultimediale implements Luminosità{
    //ATTRIBUTI
    public int luminosita;

    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

    //METODI
    public void show(){
        StringBuilder asterischi = new StringBuilder();

        for(int i = 0; i < luminosita; i++){
            asterischi.append("*");
        }
        System.out.println(titolo + asterischi);
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

}
