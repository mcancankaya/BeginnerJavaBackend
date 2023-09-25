package com.mcancankaya.lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(1);
        list.add(null);
        list.add(4);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(5);
        list.add(30);
        list.add(null);

        for (Integer i : list) {
            System.out.println(i);
        }

        System.out.println("get(3) : "+list.get(3));
        System.out.println("get(0) : "+list.get(0));
        //System.out.println("get(100) : "+list.get(100)); // return IndexOutOfBoundsException
        System.out.println("indexOf(1) : "+list.indexOf(1));
        System.out.println("lastIndexOf(1) : "+list.lastIndexOf(1));
        System.out.println("indexOf(100) : "+list.indexOf(100)); // output -1 because element not found
        list.add(2,13);

    }
}
