// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Immagine imm1 = new Immagine("ciao", 2);
        imm1.show();

        Video video1 = new Video("video", 2, 5, 3);
        video1.play();

        RegistrazioneAudio audio1 = new RegistrazioneAudio("audio", 2, 4);
        audio1.play();

    }
}