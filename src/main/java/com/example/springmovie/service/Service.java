package com.example.springmovie.service;

import com.example.springmovie.Models.Movie;
import com.example.springmovie.Repositories.MovieRepository;

import java.util.ArrayList;
import java.util.Collections;

public class Service {
    private MovieRepository myRepo = new MovieRepository();





    public void findall(){
        this.myRepo.findAll();
    }


    public String getfirst(){
        return "The first movie is: " + this.myRepo.getfirst();
    }

    public String getRandom(){
        return this.myRepo.getRandomMovie().getTitle();
    }

    public ArrayList<Movie> getTenSortByPopularity(){
        ArrayList<Movie> myList = this.myRepo.getTenSortByPopularity();
        Collections.sort(myList);
        return myList;
    }
    public ArrayList<Movie> getAllAwards(){
        ArrayList<Movie> myAwardList = new ArrayList<>();
        ArrayList<Movie> myList = this.myRepo.getMovieList();
        for (Movie m: myList){
            if (m.getBool()){
                myAwardList.add(m);
            }
        }
        return myAwardList;
    }
}
