package Maths;

public class Cel_To_Fah {

    static float celsiousToFahrenheit(float n){
            return (n * 9.0f/5.0f + 32.0f);
    }
    public static void main(String[] args) {
        float n = 67;
        System.out.println("celsiousToFahrenheit:" + celsiousToFahrenheit(n));
    }
}
