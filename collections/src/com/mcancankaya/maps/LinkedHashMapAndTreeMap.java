package com.mcancankaya.maps;

import java.util.LinkedHashMap;

public class LinkedHashMapAndTreeMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(01,"Adana");
        linkedHashMap.put(06,"Ankara");
        linkedHashMap.put(45,"Manisa");
        linkedHashMap.put(64,"Uşak");

        for (Integer str :
                linkedHashMap.keySet()) {
            System.out.println("Key : "+str+" Value : "+linkedHashMap.get(str));
        }

    }
}
