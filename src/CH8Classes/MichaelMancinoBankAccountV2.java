package CH8Classes;

public class MichaelMancinoBankAccountV2 {
    private double balance;
    private int pin;
    private String name;
    private String socialSecurityNumber;
    private MichaelMancinoAdress adress;
    private MichaelMancinoDateOfBirth dateofbirth;
    //real constructor hours
    public MichaelMancinoBankAccountV2(String name, String socialSecurityNumber, MichaelMancinoAdress adress, MichaelMancinoDateOfBirth dateofbirth){
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.adress = adress;
        this.dateofbirth = dateofbirth;

    }

    public MichaelMancinoBankAccountV2(double balance, String name, String socialSecurityNumber, MichaelMancinoAdress adress, MichaelMancinoDateOfBirth dateofbirth, int pin){
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.adress = adress;
        this.dateofbirth = dateofbirth;
        this.balance = balance;
        this.dateofbirth = dateofbirth;
        this.pin = pin;


    }

    //real behavior hours


    public String getName() {
        return name;
    }

    public double getBalace(){
        return balance;
    }
    public String getSocialSecurityNumber(){
        return socialSecurityNumber;
    }
    public MichaelMancinoAdress getAdress(){
        return adress;
    }
    public MichaelMancinoDateOfBirth getDateofbirth(){
        return dateofbirth;
    }
    //real setter hours


    public void withdraw(int amount){
        balance-=amount;
    }
    public void deposit(double cash){
        balance+=cash;
    }
   /* public void deposit(String check){
        balance+=check;
    }*/

    public String toString(){
        return (name+"\n" + balance);
    }






}


