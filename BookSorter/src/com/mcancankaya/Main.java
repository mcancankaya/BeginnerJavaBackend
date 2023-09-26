package com.mcancankaya;

import com.sun.source.tree.Tree;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Tutunamayanlar",450,"Oğuz Atay", LocalDate.of(2005,8,25));
        Book book2 = new Book("Bozkurtlar",600,"Atsız", LocalDate.of(2000,8,25));
        Book book3 = new Book("Tehlikeli Oyunlar",350,"Oğuz Atay", LocalDate.of(2001,8,25));
        Book book4 = new Book("Sefiller",700,"Victor Hugo", LocalDate.of(2002,8,25));
        Set<Book> books = new TreeSet<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        for (Book b :
                books) {
            System.out.println(b.getName());
        }

        Set<Book> bookSet = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getNumberOfPage()- o2.getNumberOfPage();
            }
        });

        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);

        for (Book book :
                bookSet) {
            System.out.println(book.getName() + " - "+book.getNumberOfPage());
        }

    }
}
