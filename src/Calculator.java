import java.util.Scanner;

public class Calculator {
    public static float minusAB(float a, float b){
        return a - b;
    }
    public static float summAB(float a, float b){
        return a + b;
    }
    public static float umnozhAB(float a, float b){
        return a * b;
    }
    public static float delenAB(float a, float b){
        return a / b;
    }

    public String scannerZnak(String znak){
        Scanner s2 = new Scanner(System.in);
        znak = s2.nextLine();
        return znak;
    }
}


