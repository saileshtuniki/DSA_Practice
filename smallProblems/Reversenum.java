// n = 10899
// o/p - 99801

import java.util.Scanner;

public class Reversenum {
    public static void main(String[] args) {
        
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        int n = 1224;
        
        while (n > 0){
            int lastDigit = n%10;

            System.out.print(lastDigit);

            n=n/10;
        }
        System.out.println();
    }
}
