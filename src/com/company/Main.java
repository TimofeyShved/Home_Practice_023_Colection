package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<String, Integer> s = new HashMap<String, Integer>();
        s.put("1 000", 1);
        s.put("2 500", 2);
        s.put("Squad", 2);
        s.put("3 000", 4);
        s.put("Olimp", 3);
        s.put("SSS+", 3);
        s.put("Zorro", 2);

        Map<Integer, Collection<String>> map = inversToMap(s);

        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value count: " + map.get(key));
        }
    }

    public static <K, V> Map<V, Collection<K>>  inversToMap(Map<K, V> map){
        Map<V, Collection<K>> newMap = new HashMap<V, Collection<K>>();

        for (K k: map.keySet()){
            newMap.put(map.get(k), null);
        }

        for (V v: newMap.keySet()){
            Collection<K> collection = new ArrayList<K>();
            for (K k: map.keySet()){
                if(v.equals(map.get(k))){
                    collection.add(k);
                }
            }
            newMap.put(v, collection);
        }

        return newMap;
    }
}
