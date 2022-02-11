package com.example.springmovie.Repositories;

import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MovieRepository {
    //læse movies

    //findAll


    public String findAll(){
        try {
            File file = new ClassPathResource("imdb-data.csv").getFile();
            Scanner myScanner = new Scanner(file);
            while (myScanner.hasNextLine()){
                String[] myStrings = myScanner.next().split(";");
                if (!myStrings[0].equals("Year")){

                }


            }


        }catch (IOException e){
            System.out.println("Error reading file" + e);

        }
        return " ";

    }
}
