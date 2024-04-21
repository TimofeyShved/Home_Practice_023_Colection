package com.company;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, Integer> s = new HashMap<String, Integer>();
        s.put("1", 1);
        s.put("sss", 1);
        s.put("2", 2);
        s.put("sss", 2);
        s.put("3", 4);
        s.put("3", 2);
        s.put("s", 3);

        Map<Integer, Collection<String>> map = inversToMap(s);

        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value count: " + map.get(key));
        }
    }

    public static <K, V> Map<V, Collection<K>>  inversToMap(Map<K, V> map){
        Map<V, Collection<K>> newMap = new HashMap<V, Collection<K>>();

        for (K k: map.keySet()){

        }

        return newMap;
    }
}
