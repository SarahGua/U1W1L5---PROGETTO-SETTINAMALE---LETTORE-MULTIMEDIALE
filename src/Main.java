import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String[] lista1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Vuoi scegliere un elemento multimediale random o vuoi creaerlo? Digita: scegli se vuoi sceglierlo oppure digita: crea se vuoi crearlo");
        String input = scanner.nextLine();
        if(Objects.equals(input, "crea")){
            System.out.println("Scegli cosa vuoi creare: video, audio o immagine?");
            String scelta = scanner.nextLine();
            if(Objects.equals(scelta, "immagine")){
                System.out.println("Hai scelto " + scelta);
                System.out.println("Inserisci il titolo");
                String titoloImmagine = scanner.nextLine();
                System.out.println("Il titolo scelto è " + titoloImmagine);
                System.out.println("Setta la luminosità preferita da 1 a 5");
                int luminositaImmagine = scanner.nextInt();
                System.out.println("La luminosità è settata a " + luminositaImmagine);
                System.out.println("Ecco la tua immagine:");
                Immagine imm1 = new Immagine(titoloImmagine, luminositaImmagine);
                imm1.show();
            } else if(Objects.equals(scelta, "video")){
                System.out.println("Hai scelto " + scelta);
                System.out.println("Inserisci il titolo");
                String titoloVideo = scanner.nextLine();
                System.out.println("Il titolo scelto è " + titoloVideo);
                System.out.println("Setta la luminosità preferita da 1 a 5");
                int luminositaVideo = scanner.nextInt();
                System.out.println("La luminosità è settata a " + luminositaVideo);
                System.out.println("Setta il volume da 1 a 5");
                int volumeVideo = scanner.nextInt();
                System.out.println("Il volume è settato a " + volumeVideo);
                System.out.println("Setta la durata da 1 a 10");
                int durataVideo = scanner.nextInt();
                System.out.println("La durata è settato a " + durataVideo);
                System.out.println("Ecco il tuo video:");
                Video video1 = new Video(titoloVideo, volumeVideo, luminositaVideo, durataVideo);
                video1.play();
            } else if(Objects.equals(scelta, "audio")) {
                System.out.println("Hai scelto " + scelta);
                System.out.println("Inserisci il titolo");
                String titoloAudio = scanner.nextLine();
                System.out.println("Il titolo scelto è " + titoloAudio);
                System.out.println("Setta il volume da 1 a 5");
                int volumeAudio = scanner.nextInt();
                System.out.println("Il volume è settato a " + volumeAudio);
                System.out.println("Setta la durata da 1 a 10");
                int durataAudio = scanner.nextInt();
                System.out.println("La durata è settato a " + durataAudio);
                System.out.println("Ecco il tuo video:");
                RegistrazioneAudio audio1 = new RegistrazioneAudio(titoloAudio, durataAudio, volumeAudio);
                audio1.play();
            } else {
                System.out.println("Errore nella compilazione");
            }
        } else if(Objects.equals(input, "scegli")){
            System.out.println("Scegli ora cosa riprodurre, inserisci un numero da 1 a 5, altrimenti se vuoi chiudere il player inserici il numero 0");
            int numero = scanner.nextInt();
            if(numero == 1){
                Immagine imm2 = new Immagine("titolo1", 5);
                imm2.show();
            } else if(numero == 2){
                RegistrazioneAudio audio2 = new RegistrazioneAudio("titolo2", 5, 8);
                audio2.play();
            } else if(numero == 3){
                Video video2 = new Video("titolo", 3, 5, 7);
                video2.play();
            } else if(numero == 4){
                RegistrazioneAudio audio3 = new RegistrazioneAudio("tit", 3, 6);
                audio3.play();
            } else if(numero == 5){
                Immagine imm3 = new Immagine("ttt", 2);
                imm3.show();
            } else if(numero == 0){
                scanner.close();
            } else {
                System.out.println("Errore nella riproduzione");
            }
        }


        scanner.close();
    }
}