package java02;
import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Sum: " + (a + b));
        System.out.println("Difference: " + (a - b));
        System.out.println("Product: " + (a * b));
        System.out.println("Quotient: " + (a / b));
        System.out.println("Remainder: " + (a % b));

        int x = 10, y = 20;
        System.out.println(x > y); // false
        System.out.println(x < y); // true
        System.out.println(x == y); // false
        System.out.println(x != y); // true
        System.out.println(x >= 10); // true

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        System.out.println("You entered: " + num);
        


    }
}