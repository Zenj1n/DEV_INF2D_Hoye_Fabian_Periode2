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
        sa.addInfo("Do", "Jon", 32, "m", "Amsterdam", "hallo1@live.nl");
        sa.addInfo("De", "Joh", 44, "m", "Leiden", "hallo2@live.nl");
        sa.addInfo("Lee", "Mike", 8, "m", "Brabant", "hallo3@live.nl");
        sa.addInfo("Lie", "Mike", 29, "m", "Leeuwarden", "hallo4@live.nl");

        System.out.println(array[4].leeftijd);
        System.out.println(array[0].compareTo(array[3]));

    }

     public void addInfo(String achternaam, String voornaam, int leeftijd, String geslacht, String plaats, String email) {
         int klantid = randomGenerator.nextInt(1000);
         Klant klant = new Klant(klantid, achternaam, voornaam, leeftijd, geslacht, plaats, email);
         array[index] = klant;
         index++;
     }

    public static void mergeSort( Comparable [ ] a )
    {
        Comparable [ ] tmpArray = new Comparable[ array.length ];

        mergeSort( a, tmpArray, 0, array.length - 1 );
    }

    /**
     * Internal method that makes recursive calls.
     * @param a an array of Comparable items.
     * @param tmpArray an array to place the merged result.
     * @param left the left-most index of the subarray.
     * @param right the right-most index of the subarray.
     */
    private static void mergeSort( Comparable [ ] a, Comparable [ ] tmpArray,
                                   int left, int right )
    {
        if( left < right )
        {
            int center = ( left + right ) / 2;
            mergeSort( a, tmpArray, left, center );
            mergeSort( a, tmpArray, center + 1, right );
            merge( a, tmpArray, left, center + 1, right );
        }
    }

    /**
     * Internal method that merges two sorted halves of a subarray.
     * @param a an array of Comparable items.
     * @param tmpArray an array to place the merged result.
     * @param leftPos the left-most index of the subarray.
     * @param rightPos the index of the start of the second half.
     * @param rightEnd the right-most index of the subarray.
     */
    private static void merge( Comparable [ ] a, Comparable [ ] tmpArray,
                               int leftPos, int rightPos, int rightEnd )
    {
        int leftEnd = rightPos - 1;
        int tmpPos = leftPos;
        int numElements = rightEnd - leftPos + 1;

        // Main loop
        while( leftPos <= leftEnd && rightPos <= rightEnd )
            if( a[ leftPos ].compareTo( a[ rightPos ] ) <= 0 )
                tmpArray[ tmpPos++ ] = a[ leftPos++ ];
            else
                tmpArray[ tmpPos++ ] = a[ rightPos++ ];

        while( leftPos <= leftEnd )    // Copy rest of first half
            tmpArray[ tmpPos++ ] = a[ leftPos++ ];

        while( rightPos <= rightEnd )  // Copy rest of right half
            tmpArray[ tmpPos++ ] = a[ rightPos++ ];

        // Copy tmpArray back
        for( int i = 0; i < numElements; i++, rightEnd-- )
            a[ rightEnd ] = tmpArray[ rightEnd ];
    }
}
