package com.example.website.model;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class DataProvider {
    public static ArrayList<Movie> movies;
    public static ArrayList<Genre> genres;
    public static ArrayList<User> users;



    public void removeMovie(Movie movie){
        movies.remove(movie);
    }



    static {
        movies = new ArrayList<>();

        movies.add(new Movie("Hachi: A Dog's Tale", "22.10.2009", "A college professor bonds with an abandoned dog he takes into his home.", "Drama", "$389 537 000", ""));
        movies.add(new Movie("Titanic", "14.02.1997", "A seventeen-year-old aristocrat falls in love with a kind but poor artist aboard the luxurious, ill-fated R.M.S. Titanic.", "Drama", "$2 187 000 000 ", "titanic_drama.jpg"));

        movies.add(new Movie("The Mask", "14.12.1994", "Bank clerk Stanley Ipkiss is transformed into a manic superhero when he wears a mysterious mask.", "Comedy", "$389 537 000", ""));
        movies.add(new Movie("Deadpool", "11.02.2016", "A wisecracking mercenary gets experimented on and becomes immortal but ugly, and sets out to track down the man who ruined his looks.", "Comedy", "$500 123 000", "deadpool_comedy.jpg"));

        movies.add(new Movie("Heima", "5.10.2006", "In the summer of 2006, Sigur Rós returned home to play a series of free, unannounced concerts for the people of Iceland.", "Documentary", "$150 453 000", "heima_doc.jpg"));
        movies.add(new Movie("The cove", "03.12.2009", "Using state-of-the-art equipment, a group of activists, led by renowned dolphin trainer Ric O'Barry, infiltrate a cove near Taijii, Japan to expose both a shocking instance of animal abuse and a serious threat to human health.", "Documentary", "$389 537 000", ""));


        movies.add(new Movie("Logan", "2.03.2017", "In a future where mutants are nearly extinct, an elderly and weary Logan leads a quiet life. But when Laura, a mutant child pursued by scientists, comes to him for help, he must get her to safety.", "Action", "$389 537 000", "logan_action.jpg"));
        movies.add(new Movie("Avengers: Endgame", "29.04.2019", "The universe is in ruins. With the help of remaining allies, the Avengers assemble once more in order to undo Thanos' actions and restore order to the universe.", "Action", "$389 537 000", ""));


        movies.add(new Movie("Harry Potter and the Sorcerer's Stone", "21.03.2002", "An orphaned boy enrolls in a school of wizardry, where he learns the truth about himself, his family and the terrible evil that haunts the magical world.", "Fantasy", "$389 537 000", ""));
        movies.add(new Movie("Lord of the rings: The Fellowship of the ring", "1.03.2002", "A meek Hobbit from the Shire and eight companions set out on a journey to destroy the powerful One Ring and save Middle-earth from the Dark Lord Sauron.", "Fantasy", "$389 537 000", "lord_fantasy.jpg"));

        movies.add(new Movie("Horton Hears a Who!", "13.03.2008", "Horton the Elephant struggles to protect a microscopic community from his neighbors who refuse to believe it exists.", "Animated_movies", "$389 537 000", ""));
        movies.add(new Movie("Zootopia", "3.03.2016", "In a city of anthropomorphic animals, a rookie bunny cop and a cynical con artist fox must work together to uncover a conspiracy.", "Animated_movies", "$389 537 000", "zoo_animated.jpg"));

        movies.add(new Movie("Pulp Fiction", "29.09.1995", "The lives of two mob hitmen, a boxer, a gangster & his wife, and a pair of diner bandits intertwine in four tales of violence and redemption.", "Crime", "$389 537 000", ""));
        movies.add(new Movie("God father", "28.09.1972", "The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.", "Crime", "$389 537 000", "god_father_crime.jpg"));

        movies.add(new Movie("Annabelle Comes Home", "27.06.2019", "", "Horror", "$389 537 000", ""));
        movies.add(new Movie("It", "17.09.2017", "In the summer of 1989, a group of bullied kids band together to destroy a shape-shifting monster, which disguises itself as a clown and preys on the children of Derry, their small Maine town.", "Horror", "$389 537 000", ""));

        movies.add(new Movie("La La Land", "12.01.2017", "", "Romance", "$389 537 000", ""));
        movies.add(new Movie("Dear John", "25.02.2010", "A romantic drama about a soldier who falls for a conservative college student while he's home on leave.", "Romance", "$389 537 000", ""));




        genres = new ArrayList<>();
        genres.add(new Genre("Drama", "drama.jpg"));
        genres.add(new Genre("Horror", "horror.jpg"));
        genres.add(new Genre("Action", "action.jpg"));
        genres.add(new Genre("Comedy", "comedy.jpg"));
        genres.add(new Genre("Fantasy", "fantasy.jpg"));
        genres.add(new Genre("Documentary", "documentary.jpg"));
        genres.add(new Genre("Romance", "romance.jpg"));
        genres.add(new Genre("Animated_movies", "animated_movies.jpg"));
        genres.add(new Genre("Fantasy", "fantasy.jpg"));
    }




}
