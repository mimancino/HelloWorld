/**
 * This class where you can create and add to your movie lists, and print them to the console.
 * @author Michael Mancino
 * @version 1.0
 * @since 1/2/19
 */
package CH8Classes;
public class MichaelMancinoMovies {



    /**
     *
     * @param args Not used.
     */
    public static void main(String[]args){
        MichaelMancinoDVDCollection movies = new MichaelMancinoDVDCollection();

        movies.addDVD("The Godfather", "Francis Ford Coppala", 1972, 24.95, true);
        System.out.println(movies);
        movies.addDVD("District 9", "Neill Blomkamp", 2009, 19.95, false);
        movies.addDVD("Iron Man", "Jon Favreau", 2008, 15.95, false);
        movies.addDVD("All About Eve", "Joseph Mankiewicz", 1950, 17.50, false);
        movies.addDVD("The Matrix", "Andy & Lana Wachowski", 1999, 19.95, true);
        System.out.println(movies);
        movies.addDVD("Iron Man 2", "Jon Favreau", 2010, 22.99, false);
        movies.addDVD("Casablanca", "Michael Curtiz", 1942, 19.95, false);
        System.out.println(movies);
    }
}
