package main.java;

import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
        treeMap.put(5, "ddd");
        treeMap.put(3, "bbb");
        treeMap.put(1, "aaa");
        treeMap.put(55, "ber");
        treeMap.put(55, "berddd");
        treeMap.put(515, "ber");
        treeMap.put(554, "ber");

        for (Iterator it = treeMap.keySet().iterator(); it.hasNext(); ) {
            Integer key = (Integer) it.next();
            if(key.equals(5)){
                it.remove();
            }
            System.out.println(key + "=" + treeMap.get(key));
        }
    }
}
