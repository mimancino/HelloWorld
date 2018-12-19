package CH8Classes;

public class MichaelMancinoClassClient {
    public static void main(String[] args) {
    MichaelMancinoBankAccount bIcHaEl = new MichaelMancinoBankAccount("Michael", "58321985", "yuh avenue", "8/9/02");
    bIcHaEl.deposit(5000000);
    System.out.println(bIcHaEl);
    bIcHaEl.withdraw(200);
    System.out.println(bIcHaEl);
}

}
