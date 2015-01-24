/**
 * Created by Fabian on 24-1-2015.
 */
public class InsertionSort {

    public static void selectionSort (Comparable[] a)
    {
        int min;
        Comparable temp;

        for (int index = 0; index < a.length-1; index++)
        {
            min = index;
            for (int scan = index+1; scan < a.length; scan++)
                if (a[scan].compareTo(a[min]) < 0)
                    min = scan;

            // Swap the values
            temp = a[min];
            a[min] = a[index];
            a[index] = temp;
        }
    }

    //-----------------------------------------------------------------
    //  Sorts the specified array of objects using the insertion
    //  sort algorithm.
    //-----------------------------------------------------------------
    public static void insertionSort (Comparable[] a)
    {
        for (int index = 1; index < a.length; index++)
        {
            Comparable key = a[index];
            int position = index;

            //  Shift larger values to the right
            while (position > 0 && key.compareTo(a[position-1]) < 0)
            {
                a[position] = a[position-1];
                position--;
            }

            a[position] = key;
        }
    }
}
