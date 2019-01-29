
//Michael Mancino
//Last edited 12/21/18
package CH8Classes;
public class MichaelMancinoGroceriesClient {
    public static void main(String[]args){
        //Client where you can make and add/change grocery lists
        MichaelMancinoGroceryList omega = new MichaelMancinoGroceryList();
        MichaelMancinoGroceryItemOrder item = new MichaelMancinoGroceryItemOrder("Chicken",6,3);
        omega.addItem(new MichaelMancinoGroceryItemOrder("Milk",5,2.42));
        omega.addItem(new MichaelMancinoGroceryItemOrder("Gift cards",3,20));
        System.out.println(omega);
        //Put here because the with the API you would have to put the cost in a separate method than toString as it would not let me use getTotalCost from inside toString
        double cost = omega.getTotalCost();
        System.out.println("Total Cost: $" + cost);
        item.setQuantity(7);
        omega.addItem(item);
        System.out.println(omega);
        cost = omega.getTotalCost();
        System.out.println("Total Cost: $" + cost);

    }
}