/* 

 ****
 ***
 **
 *

*/


public class Invertedstar {
    
    public static void main(String[] args) {
        
        // int n=4;
        //outer loop
        for(int lines=1; lines <= 4; lines++){

            //inner loop
            for(int star=1; star <= 4-lines+1; star++ ){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
