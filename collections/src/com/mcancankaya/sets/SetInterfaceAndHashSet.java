package com.mcancankaya.sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetInterfaceAndHashSet {
    public static void main(String[] args) {
        hashSetAddandPrint();
        //hashSetForeach();
        //hashSetMethods();
        //hashSetIterator();
    }

    private static void hashSetAddandPrint() {
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        System.out.println(Arrays.toString(hashSet.toArray()));
    }
    private static void hashSetForeach(){
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        for (Integer i :
                hashSet) {
            System.out.println(i);
        }
    }
    private static void hashSetMethods(){
        HashSet<Integer> hashSet = new HashSet<>();
        System.out.println("HashSet Size : "+hashSet.size());
        System.out.println("HashSet isEmpty? : "+hashSet.isEmpty());
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(50);
        System.out.println("Contains null ? : "+(hashSet.contains(null)));
        hashSet.add(40);
        hashSet.add(null);
        System.out.println("HashSet Size : "+hashSet.size());
        System.out.println("HashSet isEmpty? : "+hashSet.isEmpty());
        System.out.println("Contains 5 ? : "+(hashSet.contains(5)));
        System.out.println("Contains 10 ? : "+(hashSet.contains(10)));
        System.out.println("Contains null ? : "+(hashSet.contains(null)));
        System.out.println("10 is remove ? : "+(hashSet.remove(10)));
        System.out.println("5 is remove ? : "+(hashSet.remove(5)));


    }
    private static void hashSetIterator(){
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(50);

        Iterator<Integer> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }


}