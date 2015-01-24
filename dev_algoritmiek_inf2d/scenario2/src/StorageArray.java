import java.util.Random;
import java.util.Scanner;

/**
 * Created by Fabian on 13-1-2015.
 */
public class StorageArray {

    int index = 0;
    Random randomGenerator = new Random();


    public static void main(String[] args) {
        Klant[] array = new Klant[4];
        MergeSort ms = new MergeSort();
        StorageArray sa = new StorageArray();
        LinearSearch ls = new LinearSearch();
        InsertionSort is = new InsertionSort();
        Scanner in = new Scanner(System.in);

        int keuze;

        sa.addInfo(array, "Doe", "John", 18, "m", "Rotterdam", "hallo@live.nl");
        sa.addInfo(array, "Do", "Jon", 32, "m", "Amsterdam", "hallo1@live.nl");
        sa.addInfo(array, "De", "Joh", 44, "m", "Leiden", "hallo2@live.nl");
        sa.addInfo(array, "Lee", "Mike", 8, "m", "Brabant", "hallo3@live.nl");

        System.out.println("Ongesorteerd");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].leeftijd);
        }
        ms.mergeSort(array);
        System.out.println("Gesorteerd");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].leeftijd);
        }
        System.out.println("Linear search. 1  id, 2 leeftijd, 3 achternaam, 4 voornaam, 5 geslacht, 6 plaats, 7 email");
        keuze = in.nextInt();
        ls.linearSearch(array , keuze);

        is.selectionSort(array);
        System.out.println("Gesorteerd met de insertion sort");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].leeftijd);
        }
    }


    public void addInfo(Comparable[] c, String achternaam, String voornaam, int leeftijd, String geslacht, String plaats, String email) {
        int klantid = randomGenerator.nextInt(1000);
        Klant klant = new Klant(klantid, achternaam, voornaam, leeftijd, geslacht, plaats, email);
        c[index] = klant;
        index++;
    }

}
