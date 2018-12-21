package CH8Classes;
//Michael Mancino
//Last edited 12/21/18
public class GroceriesClient {
    public static void main(String[]args){
        GroceryList omega = new GroceryList();
        omega.addItem(new GroceryItemOrder("Milk",5,2.42));
        omega.addItem(new GroceryItemOrder("Gift cards",3,20));
        System.out.println(omega);
        double rtz = omega.getTotalCost();
        System.out.println(rtz);

    }
}
