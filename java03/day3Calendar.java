package java03;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;
 
public class day3Calendar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        System.out.print("Enter month: ");
        int month = sc.nextInt();
        System.out.print("Enter day: ");
        int day = sc.nextInt();
        LocalDate inputDate = LocalDate.of(year, month, day);
        LocalDate after30Days = inputDate.plusDays(30);
        LocalDate mondayDate = after30Days;
        while (mondayDate.getDayOfWeek() != DayOfWeek.MONDAY) {
            mondayDate = mondayDate.plusDays(1);
        } 
        System.out.println("Input date: " + inputDate);
        System.out.println("Date after 30 days: " + after30Days);
        System.out.println("Next Monday: " + mondayDate);
        sc.close();
    }
}
