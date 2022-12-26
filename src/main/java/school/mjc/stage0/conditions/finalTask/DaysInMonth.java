package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        int febday = 28;
        if (year%4==0&&(year/100)%4==0){
            febday = 29;
        }
        switch (month){
            case 1,3,5,7,8,10,12:
                System.out.println(31); break;
            case 4,6,9,11:
                System.out.println(30); break;
            case 2:
                System.out.println(febday); break;
            default:
                System.out.println("invalid date");
        }
    }
}
