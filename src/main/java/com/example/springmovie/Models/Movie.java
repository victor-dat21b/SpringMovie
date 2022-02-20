package com.example.springmovie.Models;

public class Movie implements Comparable<Movie> { //implements Comparable
    private int year;
    private int lenght;
    private String title;
    private String genre;
    private int popularity;
    private boolean awards;

    //year, title, ...
    //getters, setters, constructor, toString, comparable

    public Movie(int year, int lenght, String title, String genre, int popularity, boolean awards) {
        this.year = year;
        this.lenght = lenght;
        this.title = title;
        this.genre = genre;
        this.popularity = popularity;
        this.awards = awards;
    }

    public String getTitle() {
        return this.title;
    }

    public Boolean getBool() {
        return this.awards;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public boolean isAwards() {
        return awards;
    }

    public void setAwards(boolean awards) {
        this.awards = awards;
    }

    @Override
    public int compareTo(Movie o) {
        int number = 0;
        if (o.popularity < this.popularity) {
            number = 1;
        } else if (o.popularity > this.popularity) {
            number = -1;
    }
        return number;
}


    @Override
    public String toString() {
        return "Movie{" +
                "year=" + year +
                ", lenght=" + lenght +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", popularity=" + popularity +
                ", awards=" + awards +
                '}';
    }
}
