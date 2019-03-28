package Ch9Inheritance;

public class LawFirm {
    public static void main(String[] args) {
            EmployeeV2 tom = new LegalSecrateryV2();
            EmployeeV2 johonny = new MarketerV2();
            EmployeeV2 henry = new LawyerV2();
            PrintSalaries(tom);
            PrintSalaries(johonny);
            PrintSalaries(henry);




    }

public static void PrintSalaries(EmployeeV2 memployee){
        System.out.println(memployee.getSalary());
        System.out.println(memployee.getVacationDays());
        System.out.println(memployee.getVacationForm());

        }
        }
