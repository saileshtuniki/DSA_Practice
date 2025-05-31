public class halfpyramidpattern {
    public static void main(String[] args) {
        
        int n=4;

        for(int lines=1; lines<=n; lines++){

            //innerloop -> number
            for(int number=1; number<=lines; number++){
                System.out.print(number);
            }
            //nextline
            System.out.println();
        }
        //exit
    }
}

/*
1
12
123
1234
 */
