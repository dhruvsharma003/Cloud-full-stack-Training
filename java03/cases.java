package java03;
enum Day{
    Monday,
    Tuesday,
    Wednesday
}
public class cases {
    public static void printDay(Day day){
        switch (day) {
            case Monday:
                System.out.println("option 1");
                break;

            case Tuesday:
                System.out.println("option 2");
                break;

            case Wednesday:
                System.out.println("option 3");
                break;

            default:
                System.out.println("Invalid day");
                break;
        }
    }
    public static void main(String[] args) {
        printDay(Day.Wednesday);
    }
}
