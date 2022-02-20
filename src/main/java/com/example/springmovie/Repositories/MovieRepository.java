package com.example.springmovie.Repositories;

import com.example.springmovie.Models.Movie;
import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class MovieRepository {
    private ArrayList<Movie> myMovies;
    //læse movies

    //findAll

    public MovieRepository(){
        this.myMovies = new ArrayList<>();
        findAll();
    }


    public void findAll(){
        this.myMovies.clear();
        try {
            File file = new ClassPathResource("imdb-data.csv").getFile();
            Scanner myScanner = new Scanner(file);
            while (myScanner.hasNextLine()){
                String[] myStrings = myScanner.nextLine().split(";");
                Boolean myFlag = false;
                if (myStrings[5].equals("Yes")){
                    myFlag = true;
                }
                this.myMovies.add(new Movie(Integer.parseInt(myStrings[0]), Integer.parseInt(myStrings[1]), myStrings[2], myStrings[3], Integer.parseInt(myStrings[4]), myFlag));
            }
        }catch (IOException e){
            System.out.println("Error reading file" + e);

        }

    }




    public String getfirst(){
        Movie myMovie = this.myMovies.get(0);
        return myMovie.getTitle();
    }


    public Movie getRandomMovie(){
        int max = this.myMovies.toArray().length;
        Random rand = new Random();
        int randomint = rand.nextInt(max);
        Movie myMovie = this.myMovies.get(randomint);
        return myMovie;
    }

    public ArrayList<Movie> getTenSortByPopularity(){
        ArrayList<Movie> my10List = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            my10List.add(getRandomMovie());
        }
        return my10List;
    }

    public ArrayList<Movie> getMovieList(){
        return this.myMovies;
    }
}
