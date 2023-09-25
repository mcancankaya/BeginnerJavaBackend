package com.mcancankaya.queues;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedLists {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Mustafa");
        queue.add("Çetindağ");

        queue.offer("Patika");
        System.out.println("queue.element() : "+queue.element());
        Iterator<String> iterator = queue.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
