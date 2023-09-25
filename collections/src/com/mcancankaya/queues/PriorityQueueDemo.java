package com.mcancankaya.queues;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<String> strings = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        strings.add("ankara");
        strings.add("kocaeli");
        strings.add("istanbul");
        strings.add("bursa");

        for (String str : strings)
            System.out.println(str);
    }
}
