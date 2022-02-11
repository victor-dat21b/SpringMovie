package com.example.springmovie.Controller;


import com.example.springmovie.Repositories.MovieRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    @GetMapping("/")
    public String index(){
        return "forklaring på siden";
    }


    @GetMapping("/findall")
    public String findall(){
        MovieRepository movieR = new MovieRepository();
        return movieR.findAll();
    }

}
