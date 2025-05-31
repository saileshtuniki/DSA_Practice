public class starpattern {
    public static void main(String[] args) {
        //outer loop
        for(int lines=1; lines <= 4; lines++){

            //inner loop
            for(int star=1; star <= lines; star++ ){
                System.out.print("*");
            }
            System.out.println();

        }
    }    
}


/*

 *
 **
 ***
 ****

 */