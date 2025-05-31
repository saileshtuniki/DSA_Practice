public class Reversegivennum {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        int n = 1224;
        
        while (n > 0){
            int lastDigit = n%10;
            int rev = 0;
            System.out.print(lastDigit);
            rev = (rev*10) + lastDigit; 
            n=n/10;  // updates the n value  after eleminating the last digit.
        }
        // System.out.println();
    }
}
