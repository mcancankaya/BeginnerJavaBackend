package com.mcancankaya.sets;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>(new OrderByNameComparator().reversed());
        students.add(new Student("Mustafa", 20));
        students.add(new Student("Mahmut Can", 80));
        students.add(new Student("Ahmet", 100));
        students.add(new Student("Behlül", 45));
        students.add(new Student("Damla", 20));

        for (Student s : students) {
            System.out.println(s.getName());
        }
    }
}

class Student {
    private String name;
    private int note;

    public Student(String name, int note) {
        this.name = name;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }
}

class OrderNoteComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getNote() - o2.getNote();
    }
}
class OrderByNameComparator implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}