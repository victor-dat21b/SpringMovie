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

    public Movie(int year, int lenght, String title, String genre, int popularity, boolean awards){
        this.year = year;
        this.lenght = lenght;
        this.title = title;
        this.genre = genre;
        this.popularity = popularity;
        this.awards = awards;
    }

    @Override
    public int compareTo(Movie o) {
        return 0;
    }
}
