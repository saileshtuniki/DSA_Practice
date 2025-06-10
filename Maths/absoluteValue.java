package Maths;

public class absoluteValue {

    static void findAbsoluteVal(int N){

        if( N < 0 ){
            N = (-1) * N;
        }

        System.out.println("AbsoluteVal: "+N);
    }
    public static void main(String[] args) {

        int N = 2;

        findAbsoluteVal(N);
    }
}



