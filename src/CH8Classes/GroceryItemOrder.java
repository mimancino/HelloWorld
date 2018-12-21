package CH8Classes;
//Michael Mancino
//Last edited 12/21/18
public class GroceryItemOrder {
    private String name;
    private int quantity;
    private double ppu;

    //Constructor, initializes the items
    public GroceryItemOrder(String name, int quantity, double pricePerUnit) {
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
    public String toString(){
        return (name + " " + quantity + " " + ppu);
    }
}
