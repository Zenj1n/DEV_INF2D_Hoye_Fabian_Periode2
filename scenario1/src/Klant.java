import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by Hoye on 13-1-2015.
 */
public class Klant {

    static String achternaam;
    static String voornaam;
    static int leeftijd;
    static String geslacht;
    static String plaats;
    static String email;

    static boolean Compleet = false;
    static boolean Dadelijk = true;
    static boolean Verwerking = true;

    static Queue<String> queue = new LinkedList<String>();

    private static Klant queueInstance = null;
    public static Klant getStreamInstance() {
        if (queueInstance == null){
            queueInstance = new Klant();
        }
        return queueInstance;
    }

    public Queue<String> get (){
        return queue;
    }

    public void addKlant(String value){
        synchronized (queue) {
            queue.add(value);
        }
}

    public String poll(){
        String data = queue.poll();
        return data;
    }


}
