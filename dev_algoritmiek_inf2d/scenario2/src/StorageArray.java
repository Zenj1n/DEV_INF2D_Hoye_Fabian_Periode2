import java.util.Arrays;
import java.util.Random;

/**
 * Created by Fabian on 13-1-2015.
 */
public class StorageArray {

    static int index = 0;
    static Klant[] array = new Klant[100];
    static Random randomGenerator = new Random();
    private int[] numbers;
    private int[] helper;
    private int number;


    public static void main(String[] args){
        StorageArray sa = new StorageArray();
        sa.addInfo("Doe", "John", 18, "m", "Rotterdam", "hallo@live.nl");
        sa.addInfo("Do", "Jon", 32, "m", "Amsterdam", "hallo1@live.nl");
        sa.addInfo("De", "Joh", 44, "m", "Leiden", "hallo2@live.nl");
        sa.addInfo("Lee", "Mike", 8, "m", "Brabant", "hallo3@live.nl");
        sa.addInfo("Lie", "Mike", 29, "m", "Leeuwarden", "hallo4@live.nl");

        System.out.println(array[4].leeftijd);

    }

     public void addInfo(String achternaam, String voornaam, int leeftijd, String geslacht, String plaats, String email) {
         int klantid = randomGenerator.nextInt(1000);
         Klant klant = new Klant(klantid, achternaam, voornaam, leeftijd, geslacht, plaats, email);
         array[index] = klant;
         index++;
     }

    public void sort(int[] values) {
        this.numbers = values;
        number = values.length;
        this.helper = new int[number];
        mergesort(0, number - 1);
    }

    private void mergesort(int low, int high) {
        // check if low is smaller then high, if not then the array is sorted
        if (low < high) {
            // Get the index of the element which is in the middle
            int middle = low + (high - low) / 2;
            // Sort the left side of the array
            mergesort(low, middle);
            // Sort the right side of the array
            mergesort(middle + 1, high);
            // Combine them both
            merge(low, middle, high);
        }
    }

    private void merge(int low, int middle, int high) {

        // Copy both parts into the helper array
        for (int i = low; i <= high; i++) {
            helper[i] = numbers[i];
        }

        int i = low;
        int j = middle + 1;
        int k = low;
        // Copy the smallest values from either the left or the right side back
        // to the original array
        while (i <= middle && j <= high) {
            if (helper[i] <= helper[j]) {
                numbers[k] = helper[i];
                i++;
            } else {
                numbers[k] = helper[j];
                j++;
            }
            k++;
        }
        // Copy the rest of the left side of the array into the target array
        while (i <= middle) {
            numbers[k] = helper[i];
            k++;
            i++;
        }

    }
}
