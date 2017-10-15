package main.java;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class LinkedHashMapTest {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        linkedHashMap.put(5, "ddd");
        linkedHashMap.put(3, "bbb");
        linkedHashMap.put(1, "aaa");
        linkedHashMap.put(55, "ber");
        linkedHashMap.put(554, "ber");

        for (Iterator it = linkedHashMap.keySet().iterator(); it.hasNext(); ) {
            Integer key = (Integer) it.next();
            System.out.println(key + "=" + linkedHashMap.get(key));
        }
    }
}
