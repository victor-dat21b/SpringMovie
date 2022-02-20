package com.example.springmovie.Controller;


import com.example.springmovie.Models.Movie;
import com.example.springmovie.Repositories.MovieRepository;
import com.example.springmovie.service.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class MovieController {
    private Service myService = new Service();

    @GetMapping("/")
    public String index(){
        return "Velkommen til Film biblioteket!";
    }


    @GetMapping("/findall")
    public void findall(){
        this.myService.findall();
    }

    @GetMapping("/getfirst")
    public String getfirst(){
        return this.myService.getfirst();
    }

    @GetMapping("/getrandom")
    public String getRandom(){
        return this.myService.getRandom();
    }

    @GetMapping("/getTenSortByPopularity")
    public ArrayList<Movie> getTenSortByPopularity(){
        return this.myService.getTenSortByPopularity();
    }


    @GetMapping("/getallawards")
    public ArrayList<Movie> getAllAwards(){
        return this.myService.getAllAwards();
    }

}
