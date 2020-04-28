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

    public static String scannerZnak(Scanner sc){
        System.out.println("Введите знак +, -, / или *");
        return sc.nextLine();
    }
}
