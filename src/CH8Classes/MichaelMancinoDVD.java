/** The DVD class initialises DVDs to be added to your movie collection
 * @author Michael Mancino
 * @version 1.0
 * @since 1/2/19
 */
package CH8Classes;
public class MichaelMancinoDVD {
    private String title;
    private String director;
    private int year;
    private double cost;
    private boolean blueray;

    /**
     *
     * @param title This is the title of the movie
     * @param director This is the director of the movie
     * @param year This is the year when the movie was published
     * @param cost This is the cost of the movie(US dollars)
     * @param blueray This shows if the movie is available in blueray
     */
    public MichaelMancinoDVD(String title, String director, int year, double cost, boolean blueray) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.cost = cost;
        this.blueray = blueray;
    }

    /**
     *
     * @return returns the DVD with the assigned format
     */
    public String toString(){
        String bluray = "";
        if(blueray){
            bluray = "Blu-Ray";
        }
        return ("$" + cost + " " + year + " " + title + " " + director + " \t" + bluray + "\n");
    }

    /**
     *
      * @return Returns the cost so it can be acessed in other methods.
     */
    public double getCost() {
        return cost;
    }
}
