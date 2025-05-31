package smallProblems;
import java.util.Scanner;

public class primeornot {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();

         if(n == 2){
            System.out.println("n is prime");
         }else{
            boolean isPrime = true;

            // for(int i=2;i<=Math.sqrt(n);i++){} // Tis will also work
            // i*i <= n //  --> is faster than sqrt(n).
            for(int i=2; i*i <= n  ; i++){
                if(n % i == 0 ){
                    // System.out.println(" n is not a prime");
                    isPrime = false;
                }
            }
            if(isPrime == true){
                System.out.println("n is  prime");
            }else{
                System.out.println("n is not prime");
            }
         }
    }
}


