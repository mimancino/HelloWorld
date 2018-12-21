package CH8Classes;

public class MichaelMancinoClassClient {
    public static void main(String[] args) {
    MichaelMancinoBankAccountV2 bIcHaEl = new MichaelMancinoBankAccountV2("Michael", "58321985", new MichaelMancinoAdress("1H","apps","city","abs",24563), new MichaelMancinoDateOfBirth(12,25,16));
    bIcHaEl.deposit(5000000);
    System.out.println(bIcHaEl);
    bIcHaEl.withdraw(200);
    System.out.println(bIcHaEl);
}

}
