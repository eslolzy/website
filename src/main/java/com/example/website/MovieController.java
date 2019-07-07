package com.example.website;

import com.example.website.model.DataProvider;
import com.example.website.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("/movie")
public class MovieController {

    public String exactMovie;

    @Autowired
    private DataProvider provider;

    @GetMapping(path = "/")
    public String getAllMovies (Model model){
        ArrayList<Movie> movies = provider.movies;
        model.addAttribute("movies", movies);
        return "movies";
    }

    @GetMapping("/movie/{title}")
    public String getMovie(@PathVariable("title") String title, Model model) {
        for (int i = 0; i < DataProvider.movies.size(); i++) {
            if (DataProvider.movies.get(i).getName().equals(title)) {
                exactMovie = DataProvider.movies.get(i).toString();
            }
        }
        model.addAttribute("movie", exactMovie);
        return "movieDesc";
    }

    @GetMapping("/search")
    public String searchMovie(@RequestParam("query") String query, Model model) {
        ArrayList<Movie> foundMovies = new ArrayList<>();
        for (int i = 0; i <DataProvider.movies.size() ; i++) {
            if(query.equals(DataProvider.movies.get(i).getName())) {
                foundMovies.add(DataProvider.movies.get(i));
            } else {
                String noResult = "NO results";
                return noResult;
            }
        }
        model.addAttribute("allmovies", foundMovies);
        return "movies";
    }

    @PostMapping("/create")
    public String createMovie(Movie movie, Model model) {
        DataProvider.movies.add(movie);
        return "createMovie";
    }

    @PostMapping(path = "delete/{title}") //??
    public String deleteMovie(@PathVariable("title") String title) {
        for (int i = 0; i <DataProvider.movies.size() ; i++) {
            if(title.equals(DataProvider.movies.get(i).getName())) {
                DataProvider.movies.remove(DataProvider.movies.get(i));
            } else {
                String noResult = "No results";
                return noResult;
            }
        }
        return "/";
    }

    public static ArrayList<Movie> moviesPerGenre = new ArrayList<>();
    @GetMapping(path = "genre_movies/{name}")
    public String getMoviePerGenre(@PathVariable("name") String genreName, Model model) {
        for (int i = 0; i < DataProvider.movies.size(); i++) {
            if (DataProvider.movies.get(i).getGenre().equals(genreName)) {
                moviesPerGenre.add(DataProvider.movies.get(i));
            }
        }
        model.addAttribute("movie", moviesPerGenre);
        return "moviePerGenre";

    }

}
