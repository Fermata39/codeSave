package main.java.sample.treemap;

/**
 * Created by shinkook.kim on 2017-06-27.
 */
public class mapTest {
    public static void main(String[] args) {
        TreeMap map = new TreeMap();
        map.add(1, "map1");
        map.add(2, "map2");
        map.add(3, "map3");

        System.out.println("Map result: " + map.get(1));
        System.out.println("Map result: " + map.get(2));
        System.out.println("Map result: " + map.get(3));
    }
}
