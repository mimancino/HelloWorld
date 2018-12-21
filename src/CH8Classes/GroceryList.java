package CH8Classes;
//Michael Mancino
//Last edited 12/21/18

import java.util.Arrays;

public class GroceryList {
    private GroceryItemOrder[] list;
    private int numItems;
    public final int MaxItems = 10;

    public GroceryList() {
        list = new GroceryItemOrder[MaxItems];
        this.numItems = 0;
    }
    //adds an item to this list, as long as there is not 10 items already
    public void addItem(GroceryItemOrder item){
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
    public String toString(){
        String thing = "";
        for(int i = 0; i<numItems; i++){
            thing = thing+ "My Grocery list \n";
            thing += list[i].toString();
        }
        return thing;
    }
}
