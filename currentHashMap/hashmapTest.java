
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class hashmapTest {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        ConcurrentHashMap<Integer, String> cmap = new ConcurrentHashMap<Integer, String>();

        map.put(1, "test1");
        map.put(2, "test2");
        map.put(3, "test3");

        cmap.put(1, "temp1");
        cmap.put(2, "temp2");
        cmap.put(3, "temp3");

        for (String test : map.values()) {
            System.out.println("test: " + test);
        }

        for (String test1 : cmap.values()) {
            System.out.println("test2: " + test1);
        }
    }
}

