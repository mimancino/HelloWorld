package Ch9Inheritance;

public class LawFirmV2 {
    public static void main(String[] args) {
            EmployeeV2 tom = new LegalSecrateryV2();
            EmployeeV2 johonny = new MarketerV2();
            EmployeeV2 henry = new LawyerV2();

            EmployeeV2[] liss = new EmployeeV2[3];
            liss[0] = tom;
            liss[1] = johonny;
            liss[2] = henry;
            PrintSalaries(liss);




    }

public static void PrintSalaries(EmployeeV2[] memployee){
        for(int i = 0; i<memployee.length;i++) {
            System.out.println(memployee[i].getSalary());
            System.out.println(memployee[i].getVacationDays());
            System.out.println(memployee[i].getVacationForm());
        }

        }
        }
