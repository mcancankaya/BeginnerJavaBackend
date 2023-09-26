package com.mcancankaya;

import java.time.LocalDate;

public class Book implements Comparable<Book>{
    private String name;
    private int numberOfPage;
    private String authorName;
    private LocalDate releaseDate;

    public Book(String name, int numberOfPage, String authorName, LocalDate releaseDate) {
        this.name = name;
        this.numberOfPage = numberOfPage;
        this.authorName = authorName;
        this.releaseDate = releaseDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public int compareTo(Book o) {
        return this.getName().compareTo(o.getName());
    }
}
