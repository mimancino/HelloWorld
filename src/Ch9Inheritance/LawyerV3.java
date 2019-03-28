package Ch9Inheritance;

public class LawyerV3 extends EmployeeV3 {

    public int getVacationDays() {

        return 15; // 3 weeks' paid vacation

    }

    public String getVacationForm() {

        return "pink"; // use the yellow form

    }
    public LawyerV3(String name,int YrsOfExperience){
        super(name,YrsOfExperience);
    }
}
