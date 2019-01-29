//Michael Mancino
//Last edited 12/21/18
package CH8Classes;
public class MichaelMancinoGroceryItemOrder {
    private String name;
    private int quantity;
    private double ppu;

    //Constructor, initializes the items
    public MichaelMancinoGroceryItemOrder(String name, int quantity, double pricePerUnit) {
        this.name = name;
        this.quantity = quantity;
        this.ppu = pricePerUnit;
    }
    //gets the cost of a single item
    public double getCost() {
        return quantity*ppu;

    }
    //if you want to change the quantity of the item you can do that using this
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    //prints out specific items
    public String toString(){

        return (quantity + " " + name + " $" + ppu);
    }
}