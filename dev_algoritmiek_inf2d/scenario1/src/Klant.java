import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

/**
 * Created by Fabian on 13-1-2015.
 */
public class Klant {

    static ArrayList klant = new ArrayList();
    static String klantid;
    static String achternaam;
    static String voornaam;
    static int leeftijd;
    static String geslacht;
    static String plaats;
    static String email;

    public static void main (String[] args)
    {

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

        String uniqueID = UUID.randomUUID().toString();
        klantid = uniqueID;
        klant.add(klantid);
        System.out.println("Uw klantID is " + klantid);
    }

    public void voegKlant(){
        klant.add(klantid);
        voegKlant();
    }
}
