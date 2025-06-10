package Maths;

public class QuadraticRoots {

    public static void findRoots (double a, double b, double c){
        double discriminant =  b * b - 4 * a * c;
        double root1, root2;

        if(discriminant > 0){
            //Real and distinct roots
            root1 = (-b + Math.sqrt(discriminant)/ (2 * a));
            root2 = (-b - Math.sqrt(discriminant)/ (2 * a));

            System.out.println("Real and distinct roots:");
            System.out.println("Root1: " + root1);
            System.out.println("Root2: " + root2);
        }else if(discriminant == 0){
            //real and equal roots

            root1 = root2 = -b / (2 * a);
            System.out.println("real and equal roots:");
            System.out.println("Root:" + root1);
        }else{
            //Complex roots

            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) /(2*a);

            System.out.println("Complex roots:");
            System.out.println("Root1: "+realPart+"+"+imaginaryPart+"i");
            System.out.println("Root2: "+realPart+"+"+imaginaryPart+"i");
        }
    }

    public static void main(String[] args) {
        double a= 1, b= -3, c= 2;
        findRoots(a,b,c);
    }
}
