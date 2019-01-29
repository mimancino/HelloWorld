/** The DVDCollection class allows you to create and edit lists of movies, and calculates the total and average cost of the movies
 * @author Michael Mancino
 * @version 1.0
 * @since 1/2/19
 */
package CH8Classes;

public class MichaelMancinoDVDCollection {
    private MichaelMancinoDVD[] collection;
    private int count;
    private double totalCost;


    /**
     *
     * @param title Title of the movie
     * @param director Director of the movie
     * @param year Year when the movie released
     * @param cost Cost of the movie in USD
     * @param blueray Tells you if the movie is available in blu-ray
     */
    public void addDVD(String title, String director, int year, double cost, boolean blueray){
        increaseSize();

        collection[count] = new MichaelMancinoDVD(title,director,year,cost,blueray);
        totalCost += collection[count].getCost();
        count++;
    }

    /**
     *
     * @return Returns the movie list with the proper formatting
     */
    public String toString(){
        String DVDlist = "";
        for(int i = 0; i <count;i++){
            DVDlist+= collection[i] + "\n";
        }
        totalCost = Math.round(totalCost*100.0)/100.0;
        double avgcost = totalCost/count;
        avgcost = Math.round(avgcost*100.0)/100.0;

        return("My DVD Collection\nNumber of DVDs: " + count + "\nTotal Cost: $" + totalCost + "\nAverage cost: $" + avgcost + "\n\nDVD List: \n\n" + DVDlist);

    }

    /**
     * Increases the size of the movielist whenever needed
     */
    private void increaseSize(){
        if(count == 0){
            collection = new MichaelMancinoDVD[count+1];

        }
        else {
            MichaelMancinoDVD[] temp2 = new MichaelMancinoDVD[count + 1];
            for (int i = 0; i < count; i++) {
                temp2[i] = collection[i];
            }
            collection = temp2;
        }

    }
}
