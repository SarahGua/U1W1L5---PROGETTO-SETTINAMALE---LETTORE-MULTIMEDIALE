import java.util.Objects;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scegli cosa vuoi creare: video, audio o immagine?");
        String scelta = scanner.nextLine();
        System.out.println("Hai scelto " + scelta);

        if(Objects.equals(scelta, "immagine")){
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
        }
        scanner.close();
    }
}