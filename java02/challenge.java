package java02;
import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;

public class challenge {
    public static void main(String[] args) {
        //challenge 1
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("enter the no");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }System.out.println();
        }
        
        //challenge 2
        int[] arr={2,1,4,5,6};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
        int avg=sum/arr.length;
        System.out.println(avg);
        Arrays.sort(arr);
        System.out.println("max element is:"+arr[0]);
        System.out.println("mim element is:"+arr[arr.length-1]);

        //challenge 3
        int count = 0;

        for (int i = 2; i <= 50; i++) {
            boolean isPrime = true;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println("\nTotal prime numbers = " + count);
    }
}
