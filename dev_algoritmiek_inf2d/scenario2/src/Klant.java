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

    public int getKlantid() {
        return klantid;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public String getGeslacht() {
        return geslacht;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public String getPlaats() {
        return plaats;
    }

    public String getEmail() {
        return email;
    }

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

    @Override
    public int compareTo(Klant k) {
        if(this.leeftijd > k.leeftijd){
            return 1;
        }else if(this.leeftijd < k.leeftijd){
            return -1;
        }
        return 0;
    }
}
