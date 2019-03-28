package Ch9Inheritance;
public class EmployeeV3 {
    String name;
    int YrsOfExperience;
    public EmployeeV3(String name, int YrsOfExperience){
        this.name = name;
        this.YrsOfExperience = YrsOfExperience;
    }
    public int getHours() {

        return 40; // works 40 hours / week

    }

    public double getSalary() {

        return 50000.0; // $40,000.00 / year

    }

    public int getVacationDays() {

        return 10; // 2 weeks' paid vacation

    }

    public String getVacationForm() {

        return "yellow"; // use the yellow form

    }
    public String getName() {

        return name;

    }

    public int getYrsOfExperience() {
        return YrsOfExperience;
    }
}
