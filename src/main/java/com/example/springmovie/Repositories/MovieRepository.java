package com.example.springmovie.Repositories;

import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MovieRepository {
    //læse movies

    //findAll


    public void findAll(){
        try {
            File file = new ClassPathResource("imdb-data.csv").getFile();
            Scanner myScanner = new Scanner(file);
            while (myScanner.hasNextLine()){
                System.out.println(myScanner.next());
            }


        }catch (IOException e){
            System.out.println("Error reading file" + e);

        }


    }
}
