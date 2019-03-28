package Ch9Inheritance;

public class LawFirmV4 {
    public static void main(String[] args) {


        EmployeeV3[] liss = {new LegalSecrateryV3("Tom",15),
        new MarketerV3("henry",5),new LawyerV3("jonny",1)} ;
        PrintSalaries(liss);




    }

public static void PrintSalaries(EmployeeV3[] memployee){
        for(EmployeeV3 staff: memployee){
            System.out.println(staff.getName());//why u no work
            System.out.println(staff.getSalary());
            System.out.println(staff.getVacationDays());
            System.out.println(staff.getVacationForm());
        }
            /*for(int i = 0; i<memployee.length;i++) {
            System.out.println(memployee[i].getSalary());
            System.out.println(memployee[i].getVacationDays());
            System.out.println(memployee[i].getVacationForm());
        }

        */}

        }

