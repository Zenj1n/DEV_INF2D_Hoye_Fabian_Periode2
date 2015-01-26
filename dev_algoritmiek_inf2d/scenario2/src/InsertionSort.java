/**
 * Created by Fabian on 24-1-2015.
 */
public class InsertionSort {

    public static void insertionSort(Klant[] array) {
        for (int index = 1; index < array.length; index++) {
            Klant key = array[index];
            int position = index;

            //  Shift larger values to the right

            while (position > 0 && (key.getInt(key.achternaam.substring(0, 1), array[position - 1].achternaam.substring(0, 1))) > 0) {
                array[position] = array[position - 1];
                position--;
            }

            array[position] = key;
        }
    }
}
