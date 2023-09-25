package com.mcancankaya.sets;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> days = new LinkedHashSet<>();
        days.add("Pazartesi");
        days.add("Salı");
        days.add("Çarşamba");
        days.add("Perşembe");
        days.add("Cuma");
        days.add("Cumartesi");
        days.add("Pazar");

        Iterator<String> iterator = days.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("--------------------");
        for (String str : days){
            System.out.println(str);
        }


    }
}
