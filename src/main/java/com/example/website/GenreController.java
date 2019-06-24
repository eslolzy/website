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
    public static ArrayList<Movie> moviesPerGenre = new ArrayList<>();


    @Autowired
    private DataProvider provider;

    @GetMapping(path = "/")
    public String getAllGenres(Model model) {
        ArrayList<Genre> genres = provider.genres;
        model.addAttribute("genres", genres);
        return "genres";
    }

    @GetMapping(path = "/genre_movies/{name}")
    public String getMoviePerGenre(@PathVariable("name") String genreName, Model model) {
        for (int i = 0; i < DataProvider.movies.size(); i++) {
            if (DataProvider.movies.get(i).getGenre().equals(genreName)) {
                moviesPerGenre.add(DataProvider.movies.get(i));
            }
        }
        model.addAttribute("movie", moviesPerGenre);
        return "movie";

    }

}
