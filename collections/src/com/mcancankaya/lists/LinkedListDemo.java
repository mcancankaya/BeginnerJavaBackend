package com.mcancankaya.lists;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Mahmut");
        list.add("Mustafa");
        list.add("Çetindağ");
        list.add("Java");
        list.add("102");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        list.remove("Mustafa");
        list.remove(2);

        for (String str:list) {
            System.out.println(str);
        }
    }
}
