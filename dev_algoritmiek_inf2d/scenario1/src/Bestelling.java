import java.sql.Time;
import java.text.DateFormat;
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

    static boolean Verwerking;
    static String Duur = "1 minuut";
    static boolean Compleet;
    static boolean Dadelijk;

    static String compleet_tijd = "";
    static String start_tijd = "";

    public static void main(String args[])
    {
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
        Calendar cal2 = Calendar.getInstance();

        Scanner in = new Scanner(System.in);

        System.out.println("Voer uw achternaam in ");
        achternaam = in.nextLine();
        System.out.println("Uw achternaam is " + achternaam);

        System.out.println("Voer uw voornaam in ");
        voornaam = in.nextLine();
        System.out.println("Uw voornaam is " + voornaam);

        System.out.println("Voer uw leeftijd in ");
        leeftijd = in.nextInt();
        System.out.println("Uw leeftijd is " + leeftijd);

        System.out.println("Voer uw geslacht in M of V");
        geslacht = in.nextLine();
        System.out.println("Uw geslacht is " + geslacht);

        System.out.println("Voer uw woonplaats in ");
        plaats = in.nextLine();
        System.out.println("Uw achternaam is " + plaats);

        System.out.println("Voer uw e-mailadress in ");
        email = in.nextLine();
        System.out.println("Uw email is " + email);

        cal.add(Calendar.MINUTE, queue.size());
        cal2.add(Calendar.MINUTE, queue.size()+1);

        DateFormat sdf = new SimpleDateFormat("HH:mm");
        compleet_tijd = sdf.format(cal2.getTime());
        start_tijd = sdf.format(cal.getTime());

        Verwerking = true;
        Dadelijk = true;
        Compleet = false;

        test.addKlant(voornaam + " " + achternaam + " Klant id: " + klantid + " bestelling id: " + bestellingid + " klaar rond: "
                + compleet_tijd + " start tijd: "+ start_tijd+ " Verwerking: " + Verwerking + " Dadelijk: " + Dadelijk + " Compleet :"
                + Compleet + " Bestelling klaar in: " + Duur + "Na starttijd");
        System.out.println("Queue is momenteel:" + test.get());

        Bestelling.kiesOptie();

    }

    public static void updateQueue(){
        Klant test = Klant.getStreamInstance();
        Calendar cal = Calendar.getInstance();

        DateFormat sdf = new SimpleDateFormat("HH:mm");
        String current_tijd = sdf.format(cal.getTime());

        Integer i = 0;

        for (i = 0; i < queue.size(); i++){
            if (current_tijd != compleet_tijd)
            {
                Verwerking = false;
                Dadelijk = false;
                Compleet = true;
                System.out.println("De volgende klant is klaar: " + Compleet + test.poll());
                System.out.println("Queue is momenteel:" + test.get());
            }
            else
            {
                System.out.println("Queue is momenteel:" + test.get());
            }
        }
        Bestelling.kiesOptie();
    }
}

