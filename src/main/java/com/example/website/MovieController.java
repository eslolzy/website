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

    public Movie exactMovie;

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
                exactMovie = DataProvider.movies.get(i);
                System.out.println(exactMovie);
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
                return "movies";
            }
        }
        model.addAttribute("allmovies", foundMovies);
        return "movies";
    }


    @GetMapping("/createForm")
    public String MovieForm(Model model) {
            ArrayList<Movie> movies = provider.movies;
            model.addAttribute("movie", movies);
        return "createMovie";
    }

    @PostMapping("/createSubmit")
    public String processForm(@ModelAttribute(value="movie") Movie movie) {
        DataProvider.movies.add(movie);
        return "movies";
    }

    @PostMapping(path = "/delete/{title}") //??
    public String deleteMovie(@PathVariable("title") String title) {
        for (int i = 0; i <DataProvider.movies.size() ; i++) {
            if(title.equals(DataProvider.movies.get(i).getName())) {
                DataProvider.movies.remove(DataProvider.movies.get(i));
            } else {
                return "movies";
            }
        }
        return "/";
    }

    public static ArrayList<Movie> moviesPerGenre = new ArrayList<>();
    @GetMapping(path = "/genre_movies/{name}")
    public String getMoviePerGenre(@PathVariable("name") String genreName, Model model) {
        moviesPerGenre.clear();
        for (int i = 0; i < DataProvider.movies.size(); i++) {

            if (DataProvider.movies.get(i).getGenre().equals(genreName)) {
                moviesPerGenre.add(DataProvider.movies.get(i));
            }
        }
        model.addAttribute("movie", moviesPerGenre);
        return "moviePerGenre";

    }

}
