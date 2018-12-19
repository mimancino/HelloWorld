package CH8Classes;

public class MichaelMancinoBankAccount {
    private double balance;
    private int pin;
    private String name;
    private String socialSecurityNumber;
    private String adress;
    private String dateofbirth;
    //real constructor hours
    public MichaelMancinoBankAccount(String name,String socialSecurityNumber, String adress,String dateofbirth){
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.adress = adress;
        this.dateofbirth = dateofbirth;

    }

    public MichaelMancinoBankAccount(double balance, String name,String socialSecurityNumber, String adress,String dateofbirth,int pin){
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
    public String getAdress(){
        return adress;
    }
    public String getDateofbirth(){
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


