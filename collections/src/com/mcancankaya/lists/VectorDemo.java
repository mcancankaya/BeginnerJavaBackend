package com.mcancankaya.lists;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Ankara");
        vector.add("Ankara");
        vector.add("İstanbul");
        vector.add("Manisa");
        vector.add(2,"Bolu");

        System.out.println(vector.contains("Ankara"));

        Iterator<String> iterator = vector.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (String str: vector) {
            System.out.println(str);
        }
    }
}
