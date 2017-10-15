package main.java;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(11, "a");
        map.put(4, "c");
        map.put(1, "b");
        map.put(55, "ber");
        map.put(554, "ber");

        for (Iterator it = map.keySet().iterator(); it.hasNext(); ) {
            Object key = it.next();
            System.out.println(key + "=" + map.get(key));

        }
    }
}
