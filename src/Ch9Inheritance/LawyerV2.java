package Ch9Inheritance;

public class LawyerV2 extends EmployeeV2 {

    public int getVacationDays() {

        return 15; // 3 weeks' paid vacation

    }

    public String getVacationForm() {

        return "pink"; // use the yellow form

    }
}
