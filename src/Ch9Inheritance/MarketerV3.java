package Ch9Inheritance;

public class MarketerV3 extends EmployeeV3 {


    public double getSalary() {

        return super.getSalary()+10000; // $50,000.00 / year

    }
    public void advertise(){

        System.out.println("Ill convince you to hire our lawfirm ");
    }
    public MarketerV3(String name,int YrsOfExperience){
        super(name,YrsOfExperience);
    }
}
