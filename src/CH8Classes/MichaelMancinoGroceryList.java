//Michael Mancino
//Last edited 12/21/18
package CH8Classes;

public class MichaelMancinoGroceryList {
    private MichaelMancinoGroceryItemOrder[] list;
    private int numItems;
    public final int MaxItems = 10;

    public MichaelMancinoGroceryList() {
        list = new MichaelMancinoGroceryItemOrder[MaxItems];
        this.numItems = 0;
    }
    //adds an item to this list, as long as there is not 10 items already
    public void addItem(MichaelMancinoGroceryItemOrder item){
        if(numItems <= 10) {
            list[numItems] = item;
        }
        numItems++;
    }
    //adds the total cost of all the items
    public double getTotalCost(){
        double totalcost = 0;
        for(int i = 0; i<numItems;i++){
            totalcost+=list[i].getCost();
        }
        return totalcost;
    }
    //prints out the grocery list
    public String toString(){
        String thing = "";
        thing = thing+ "My Grocery list \n";
        for(int i = 0; i<numItems; i++){
            thing += list[i].toString();
            thing+=  "\n";
        }

        return thing;
    }
}