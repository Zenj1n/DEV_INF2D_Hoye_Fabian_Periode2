/**
 * Created by Fabian on 25-1-2015.
 */
public class BinarySearch {

    public int binarySearch(Klant[] array, String value, int min, int max) {
        if (min > max) {
            return -1;
        }

        int mid = (max + min) / 2;

        if (array[mid].achternaam.equals(value)) {
            return mid;
        } else if (array[mid].achternaam.compareTo(value) > 0) {
            return binarySearch(array, value, min, mid - 1);
        } else {
            return binarySearch(array, value, mid + 1, max);
        }
    }
}

/*
 * Created by Fabian on 25-1-2015. probeerde met achternamen met dezelfde begin letter

public class BinarySearch {

    public int binarySearch(Klant[] array, String value, int min, int max) {
        if (min > max) {
            return -1;
        }



        while(min < max) {
            int mid = (max + min) / 2;
            if (array[mid].achternaam.compareTo(value) > 0) {
                max = min;
            } else {
                min = min + 1;
            }
        }
        if (array[min].achternaam.equals(value) && (min == max)) {
            return min;
        }
        return -1;
    }
} */
