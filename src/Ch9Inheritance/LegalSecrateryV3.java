package Ch9Inheritance;

public class LegalSecrateryV3 extends SecretaryV3 {

    public double getSalary() {

        return super.getSalary()+5000.0; // $45,000.00 / year

    }
    public LegalSecrateryV3(String name,int YrsOfExperience){
        super(name,YrsOfExperience);
    }


}
