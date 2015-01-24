import java.util.Scanner;

/**
 * Created by Fabian on 24-1-2015.
 */
public class LinearSearch {

    public void linearSearch(Klant[] array, int keuze) {
        int leeftijd;
        int id;
        int counter;
        String achternaam, voornaam, geslacht, plaats, email, opnieuw;
        Scanner in = new Scanner(System.in);


        switch (keuze) {
            case 1:
                System.out.println("Voer de id in");
                id = in.nextInt();
                for (counter = 0; counter < array.length; counter++) {
                    if (array[counter].klantid == id) {
                        System.out.println(id + " staat op locatie " + (counter + 1));
                        break;
                    }
                }
                if (counter == array.length)
                    System.out.println(id + " bestaat niet in deze array.");
                break;
            case 2:
                System.out.println("Voer de leeftijd in");
                leeftijd = in.nextInt();
                for (counter = 0; counter < array.length; counter++) {
                    if (array[counter].leeftijd == leeftijd) {
                        System.out.println(leeftijd + " staat op locatie " + (counter + 1));
                        break;
                    }
                }
                if (counter == array.length)
                    System.out.println(leeftijd + " bestaat niet in deze array.");
                break;
            case 3:
                System.out.println("Voer de achternaam in");
                achternaam = in.nextLine();
                for (counter = 0; counter < array.length; counter++) {
                    if (array[counter].achternaam.equals(achternaam)) {
                        System.out.println(achternaam + " staat op locatie " + (counter + 1));
                        break;
                    }
                }
                if (counter == array.length)
                    System.out.println(achternaam + " bestaat niet in deze array.");
                break;
            case 4:
                System.out.println("Voer de voornaam in");
                voornaam = in.nextLine();
                for (counter = 0; counter < array.length; counter++) {
                    if (array[counter].voornaam.equals(voornaam)) {
                        System.out.println(voornaam + " staat op locatie " + (counter + 1));
                        break;
                    }
                }
                if (counter == array.length)
                    System.out.println(voornaam + " bestaat niet in deze array.");
                break;
            case 5:
                System.out.println("Voer het geslacht (m/v) in");
                geslacht = in.nextLine();
                for (counter = 0; counter < array.length; counter++) {
                    if (array[counter].geslacht.equals(geslacht)) {
                        System.out.println(geslacht + " staat op locatie " + (counter + 1));
                        break;
                    }
                }
                if (counter == array.length)
                    System.out.println(geslacht + " bestaat niet in deze array.");
                break;
            case 6:
                System.out.println("Voer de plaats in");
                plaats = in.nextLine();
                for (counter = 0; counter < array.length; counter++) {
                    if (array[counter].plaats.equals(plaats)) {
                        System.out.println(plaats + " staat op locatie " + (counter + 1));
                        break;
                    }
                }
                if (counter == array.length)
                    System.out.println(plaats + " doesn't exist in array.");
                break;
            case 7:
                System.out.println("Voer het e-mail adres in in");
                email = in.nextLine();
                for (counter = 0; counter < array.length; counter++) {
                    if (array[counter].email.equals(email)) {
                        System.out.println(email + " staat op locatie " + (counter + 1));
                        break;
                    }
                }
                if (counter == array.length)
                    System.out.println(email + " bestaat niet in deze array.");
                break;
        }
        System.out.println("Wilt u nog een keer zoeken? (j/n)");
        opnieuw = in.nextLine();
        if(opnieuw.equals("j")){
            linearSearch(array, keuze);
        }else{
            System.out.println("Bedankt voor het gebruiken van de zoek functie");
        }

    }
}
