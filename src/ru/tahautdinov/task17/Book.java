package ru.tahautdinov.task17;

import java.io.Serializable;

public class Book implements Serializable {
    private String name;
    private String autor;
    private int year;

    public Book(String name, String autor, int year) {
        this.name = name;
        this.autor = autor;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", autor='" + autor + '\'' +
                ", year=" + year +
                '}';
    }
}


