package patterns;

public class characterpattern {
    public static void main(String[] args) {
        //outer loop
        int n=4;
        char ch='A';

        //outer loop
        for(int lines=1; lines<=n; lines++){
            //inner loop
            for(int chars=1; chars<=lines; chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
