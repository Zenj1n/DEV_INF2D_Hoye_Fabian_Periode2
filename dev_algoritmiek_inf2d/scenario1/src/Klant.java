import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by Hoye on 13-1-2015.
 */
public class Klant {

    static ArrayList klant = new ArrayList();
    static String klantid;
    static String achternaam;
    static String voornaam;
    static int leeftijd;
    static String geslacht;
    static String plaats;
    static String email;

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

    public void removeKlant (String value){
        synchronized (queue){
            queue.remove(value);
        }
    }

    public String poll(){
        String data = queue.poll();
        return data;
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int getTotalSize(){
        return queue.size();
    }
}
