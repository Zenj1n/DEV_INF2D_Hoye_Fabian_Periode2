import java.sql.Time;
import java.util.Date;
import java.util.Scanner;
import java.util.*;
import java.util.Random;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;

/**
 * Created by Hoye on 13-1-2015.
 */


public class Bestelling extends Klant{
    static Random randomGenerator = new Random();

    static int klantid = randomGenerator.nextInt(1000);
    static int bestellingid = randomGenerator.nextInt(1000);

    static String voornaam = "hoye1";
    static String achternaam = "lam";
    static SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

    public static void main(String args[]) {
        Bestelling.kiesOptie();
    }

    public static void kiesOptie(){
        Scanner in = new Scanner(System.in);
        Integer inputkeuze;

        System.out.println("Kies 1 voor bekijk queue / Kies 2 voor voegKlant toe / Kies 3 voor update queue");
        inputkeuze = in.nextInt();

        if (inputkeuze == 1){
            Bestelling.bekijkQueue();
        }
        if (inputkeuze == 2){
            Bestelling.voegKlant();
        }
        if (inputkeuze == 3){
            Bestelling.updateQueue();
        }
    }

    public static void bekijkQueue(){
        Klant test = Klant.getStreamInstance();
        System.out.println("Queue is momenteel:" + test.get());
        Bestelling.kiesOptie();
    }

    public static void voegKlant(){
        Klant test = Klant.getStreamInstance();
        Calendar cal = Calendar.getInstance();

        Timer timer = new Timer();

        cal.getTime();

        test.addKlant("Meneer/Mevrouw: "+ voornaam + " " + achternaam + " met klant id: " + klantid + "bestelling id: "+ bestellingid + "starttijd: "+ sdf + "duur is: 1 minuut");
        System.out.println("Queue is momenteel:" + test.get());

        Bestelling.kiesOptie();

    }

    public static void updateQueue(){
        Klant test = Klant.getStreamInstance();
        System.out.println("De volgende klant is klaar: " + test.poll());
        System.out.println("Queue is momenteel:" + test.get());

        }
}

