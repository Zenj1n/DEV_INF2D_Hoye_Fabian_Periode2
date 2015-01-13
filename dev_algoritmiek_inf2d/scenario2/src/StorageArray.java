import java.util.Arrays;
import java.util.Random;

/**
 * Created by Fabian on 13-1-2015.
 */
public class StorageArray {

    static int index = 0;
    static Klant[] array = new Klant[100];
    static Random randomGenerator = new Random();

    public static void main(String[] args){
        StorageArray sa = new StorageArray();
        sa.addInfo("Doe", "John", 18, "m", "Rotterdam", "hallo@live.nl");

    }

     public void addInfo(String achternaam, String voornaam, int leeftijd, String geslacht, String plaats, String email){
         int klantid = randomGenerator.nextInt(1000);
         Klant klant = new Klant(klantid, achternaam, voornaam, leeftijd, geslacht, plaats, email);
         array[index] = klant;
         index++;}
}
