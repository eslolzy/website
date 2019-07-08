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

        movies.add(new Movie("Hachi: A Dog's Tale", "22.10.2009", "Commuting by train, music professor Parker Wilson finds an Akita puppy, whose cage broke unnoticed during shipping, leaving his destination unknown, and since the station can't care for it and the dog catcher warns even such cute ones may not be adopted in the two weeks allowed, he kindly takes it home. His bossy, jealous wife Cate initially makes Parker swear it won't stay, but by the time its' clear nobody will claim him and an adoption candidate is found, she agrees to keep the dog, who won over their daughter Andy and her fiance Michael at first sight. Parker's Japanese college friend Ken inspires naming the pup Hachi(ko), and is pleasantly surprised when Parker successfully tackles the challenge to get it to fetch, which Akitas don't usually do. Hachi makes a habit of waiting for his equally doting master at the station every evening, but after a cardiac crisis, Parker dies. Hachi refuses to accept this, being moved to Michael's home as Cate moves out, waiting for a master who ...", "Drama", "Cumulative Worldwide Gross: $47,707,417 ", "hachi.jpg"));
        movies.add(new Movie("Titanic", "14.02.1997", "84 years later, a 100 year-old woman named Rose DeWitt Bukater tells the story to her granddaughter Lizzy Calvert, Brock Lovett, Lewis Bodine, Bobby Buell and Anatoly Mikailavich on the Keldysh about her life set in April 10th 1912, on a ship called Titanic when young Rose boards the departing ship with the upper-class passengers and her mother, Ruth DeWitt Bukater, and her fiancé, Caledon Hockley. Meanwhile, a drifter and artist named Jack Dawson and his best friend Fabrizio De Rossi win third-class tickets to the ship in a game. And she explains the whole story from departure until the death of Titanic on its first and last voyage April 15th, 1912 at 2:20 in the morning. ", "Drama", "Cumulative Worldwide Gross: $2,186,772,302, 11 August 2015 ", "titanic_drama.jpg"));

        movies.add(new Movie("The Mask", "14.12.1994", "Stanley Ipkiss (Jim Carrey) is a bank clerk that is an incredibly nice man. Unfortunately, he is too nice for his own good and is a pushover when it comes to confrontations. After one of the worst days of his life, he finds a mask that depicts Loki, the Norse night god of mischief. Now, when he puts it on, he becomes his inner, self: a cartoon romantic wild man. However, a small time crime boss, Dorian Tyrel (Peter Greene), comes across this character dubbed \"The Mask\" by the media. After Ipkiss's alter ego indirectly kills his friend in crime, Tyrel now wants this green-faced goon destroyed. ", "Comedy", "$389 537 000", "mask.jpg"));
        movies.add(new Movie("Deadpool", "11.02.2016", "This is the origin story of former Special Forces operative turned mercenary Wade Wilson, who after being subjected to a rogue experiment that leaves him with accelerated healing powers, adopts the alter ego Deadpool. Armed with his new abilities and a dark, twisted sense of humor, Deadpool hunts down the man who nearly destroyed his life. ", "Comedy", "$500 123 000", "deadpool_comedy.jpg"));

        movies.add(new Movie("Heima", "5.10.2006", "In the summer of 2006, Sigur Rós returned home to play a series of free, unannounced concerts for the people of Iceland. This film documents their already legendary tour with intimate reflections from the band and a handful of new acoustic performances. ", "Documentary", "$150 453 000", "heima_doc.jpg"));
        movies.add(new Movie("The Cove", "03.12.2009", "Richard O'Barry was the man who captured and trained the dolphins for the television show Flipper (1964). O'Barry's view of cetaceans in captivity changed from that experience when as the last straw he saw that one of the dolphins playing Flipper - her name being Kathy - basically committed suicide in his arms because of the stress of being in captivity. Since that time, he has become one of the leading advocates against cetaceans in captivity and for the preservation of cetaceans in the wild. O'Barry and filmmaker 'Louie Psihoyos (I)' go about trying to expose one of what they see as the most cruel acts against wild dolphins in the world in Taiji, Japan, where dolphins are routinely corralled, either to be sold alive to aquariums and marine parks, or slaughtered for meat. The primary secluded cove where this activity is taking place is heavily guarded. O'Barry and Psihoyos are well known as enemies by the authorities in Taiji, the authorities who will use whatever tactic to expel the...", "Documentary", "$389 537 000", "cove.jpg"));


        movies.add(new Movie("Logan", "2.03.2017", "In 2029 the mutant population has shrunken significantly due to genetically modified plants designed to reduce mutant powers and the X-Men have disbanded. Logan, whose power to self-heal is dwindling, has surrendered himself to alcohol and now earns a living as a chauffeur. He takes care of the ailing old Professor X whom he keeps hidden away. One day, a female stranger asks Logan to drive a girl named Laura to the Canadian border. At first he refuses, but the Professor has been waiting for a long time for her to appear. Laura possesses an extraordinary fighting prowess and is in many ways like Wolverine. She is pursued by sinister figures working for a powerful corporation; this is because they made her, with Logan's DNA. A decrepit Logan is forced to ask himself if he can or even wants to put his remaining powers to good use. It would appear that in the near-future, the times in which they were able put the world to rights with razor sharp claws and telepathic powers are now over. ", "Action", "$389 537 000", "logan_action.jpg"));
        movies.add(new Movie("Avengers: Endgame", "29.04.2019", "After the devastating events of Avengers: Infinity War (2018), the universe is in ruins due to the efforts of the Mad Titan, Thanos. With the help of remaining allies, the Avengers must assemble once more in order to undo Thanos's actions and undo the chaos to the universe, no matter what consequences may be in store, and no matter who they face... ", "Action", "$389 537 000", "avengers.jpg"));


        movies.add(new Movie("Harry Potter and the Sorcerer's Stone", "21.03.2002", "This is the tale of Harry Potter, an ordinary 11-year-old boy serving as a sort of slave for his aunt and uncle who learns that he is actually a wizard and has been invited to attend the Hogwarts School for Witchcraft and Wizardry. Harry is snatched away from his mundane existence by Rubeus Hagrid, the grounds keeper for Hogwarts, and quickly thrown into a world completely foreign to both him and the viewer. Famous for an incident that happened at his birth, Harry makes friends easily at his new school. He soon finds, however, that the wizarding world is far more dangerous for him than he would have imagined, and he quickly learns that not all wizards are ones to be trusted.", "Fantasy", "$389 537 000", "potter.jpg"));
        movies.add(new Movie("Lord of the rings: The Fellowship of the ring", "1.03.2002", "An ancient Ring thought lost for centuries has been found, and through a strange twist of fate has been given to a small Hobbit named Frodo. When Gandalf discovers the Ring is in fact the One Ring of the Dark Lord Sauron, Frodo must make an epic quest to the Cracks of Doom in order to destroy it. However, he does not go alone. He is joined by Gandalf, Legolas the elf, Gimli the Dwarf, Aragorn, Boromir, and his three Hobbit friends Merry, Pippin, and Samwise. Through mountains, snow, darkness, forests, rivers and plains, facing evil and danger at every corner the Fellowship of the Ring must go. Their quest to destroy the One Ring is the only hope for the end of the Dark Lords reign.", "Fantasy", "$389 537 000", "lord_fantasy.jpg"));

        movies.add(new Movie("Horton Hears a Who!", "13.03.2008", "One day, Horton the elephant hears a cry from help coming from a speck of dust. Even though he can't see anyone on the speck, he decides to help it. As it turns out, the speck of dust is home to the Whos, who live in their city of Whoville. Horton agrees to help protect the Whos and their home, but this gives him nothing but torment from his neighbors, who refuse to believe that anything could survive on the speck. Still, Horton stands by the motto that, \"After all, a person is a person, no matter how small.\"", "Animated_movies", "$389 537 000", "horton.jpg"));
        movies.add(new Movie("Zootopia", "3.03.2016", "From the largest elephant to the smallest shrew, the city of Zootopia is a mammal metropolis where various animals live and thrive. When Judy Hopps becomes the first rabbit to join the police force, she quickly learns how tough it is to enforce the law. Determined to prove herself, Judy jumps at the opportunity to solve a mysterious case. Unfortunately, that means working with Nick Wilde, a wily fox who makes her job even harder. ", "Animated_movies", "$389 537 000", "zoo_animated.jpg"));

        movies.add(new Movie("Pulp Fiction", "29.09.1995", "Jules Winnfield (Samuel L. Jackson) and Vincent Vega (John Travolta) are two hit men who are out to retrieve a suitcase stolen from their employer, mob boss Marsellus Wallace (Ving Rhames). Wallace has also asked Vincent to take his wife Mia (Uma Thurman) out a few days later when Wallace himself will be out of town. Butch Coolidge (Bruce Willis) is an aging boxer who is paid by Wallace to lose his fight. The lives of these seemingly unrelated people are woven together comprising of a series of funny, bizarre and uncalled-for incidents. ", "Crime", "$389 537 000", "pulp.jpg"));
        movies.add(new Movie("God father", "28.09.1972", "The Godfather \"Don\" Vito Corleone is the head of the Corleone mafia family in New York. He is at the event of his daughter's wedding. Michael, Vito's youngest son and a decorated WW II Marine is also present at the wedding. Michael seems to be uninterested in being a part of the family business. Vito is a powerful man, and is kind to all those who give him respect but is ruthless against those who do not. But when a powerful and treacherous rival wants to sell drugs and needs the Don's influence for the same, Vito refuses to do it. What follows is a clash between Vito's fading old values and the new ways which may cause Michael to do the thing he was most reluctant in doing and wage a mob war against all the other mafia families which could tear the Corleone family apart.", "Crime", "$389 537 000", "god_father_crime.jpg"));

        movies.add(new Movie("Annabelle Comes Home", "27.06.2019", "Determined to keep Annabelle from wreaking more havoc, demonologists Ed and Lorraine Warren bring the possessed doll to the locked artifacts room in their home, placing her \"safely\" behind sacred glass and enlisting a priest's holy blessing. But an unholy night of horror awaits as Annabelle awakens the evil spirits in the room, who all set their sights on a new target--the Warrens' ten-year-old daughter, Judy, and her friends.", "Horror", "$389 537 000", "annabelle.jpg"));
        movies.add(new Movie("It", "17.09.2017", "In the Town of Derry, the local kids are disappearing one by one. In a place known as 'The Barrens', a group of seven kids are united by their horrifying and strange encounters with an evil clown and their determination to kill It.", "Horror", "$389 537 000", "it.jpg"));

        movies.add(new Movie("La La Land", "12.01.2017", "Aspiring actress serves lattes to movie stars in between auditions and jazz musician Sebastian scrapes by playing cocktail-party gigs in dingy bars. But as success mounts, they are faced with decisions that fray the fragile fabric of their love affair, and the dreams they worked so hard to maintain in each other threaten to rip them apart.", "Romance", "$389 537 000", "lala.jpg"));
        movies.add(new Movie("Dear John", "25.02.2010", "South Carolina US Army Special operations soldier John is on summer leave from his German base, visiting his widowed father. Being gallant on the pier, he befriends college student Savannah, a college student, and her buddies, a terminal father and his angelic son. John falls in love with Savannah, who diagnoses his beloved, gentle but weird father as mildly autistic. He plans not to sign up again, but 9/11 changes that, and she won't wait idly while their friends desperately need help.", "Romance", "$389 537 000", "john.jpg"));




        genres = new ArrayList<>();
        genres.add(new Genre("Drama", "drama.jpg"));
        genres.add(new Genre("Horror", "horror.jpg"));
        genres.add(new Genre("Action", "action.jpg"));
        genres.add(new Genre("Comedy", "comedy.jpg"));
        genres.add(new Genre("Fantasy", "fantasy.jpg"));
        genres.add(new Genre("Documentary", "documentary.jpg"));
        genres.add(new Genre("Romance", "romance.jpg"));
        genres.add(new Genre("Animated movies", "animated_movies.jpg"));
        genres.add(new Genre("Fantasy", "fantasy.jpg"));
    }




}
