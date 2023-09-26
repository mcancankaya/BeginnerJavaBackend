package com.mcancankaya.maps;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceAndHashMap {
    public static void main(String[] args) {

        Map<String, String> country = new HashMap<>();
        country.put("TR", "Türkiye");
        country.put("GR", "Almanya");
        country.put("EN", "İngiltere");

        System.out.println(country.get("TR"));
        for (String i : country.keySet()) {
            System.out.println(i);
        }

        for (String i : country.values()) {
            System.out.println(i);
        }

        for (String i : country.keySet()) {
            System.out.println("key: " + i + " value: " + country.get(i));
        }

}
}
