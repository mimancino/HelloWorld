package Ch9Inheritance;

public class LegalSecrateryV2 extends SecretaryV2 {

    public double getSalary() {

        return super.getSalary()+5000.0; // $45,000.00 / year

    }


}
