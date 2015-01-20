/**
 * Created by Fabian on 13-1-2015.
 */
public class Klant implements Comparable<Klant> {
    int klantid;
    String achternaam;
    String voornaam;
    int leeftijd;
    String geslacht;
    String plaats;
    String email;

    public Klant(int klantid, String achternaam, String voornaam, int leeftijd, String geslacht, String plaats, String email) {
        this.klantid = klantid;
        this.achternaam = achternaam;
        this.voornaam = voornaam;
        this.leeftijd = leeftijd;
        this.geslacht = geslacht;
        this.plaats = plaats;
        this.email = email;

        return;
    }

    public int compareTo(Klant klant) {
        return klant.leeftijd > this.leeftijd  ? 0 : -1;
    }
}
