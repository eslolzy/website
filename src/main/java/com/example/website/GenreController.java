package com.example.website;


import com.example.website.model.DataProvider;
import com.example.website.model.Genre;
import com.example.website.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("/genres")
public class GenreController {



    @Autowired
    private DataProvider provider;

    @GetMapping(path = "/")
    public String getAllGenres(Model model) {
        ArrayList<Genre> genres = provider.genres;
        model.addAttribute("genres", genres);
        return "genres";
    }



}
