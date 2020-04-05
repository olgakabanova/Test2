import java.util.NoSuchElementException;
import java.util.Scanner;

public class Hard {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Введите значения a и b через пробелы: ");
        while (s1.hasNext()) {
            try {
                result(s1.nextFloat(), s1.nextFloat());
                break;
            } catch (NoSuchElementException exp) {
                System.out.println("Ошибка ввода! Попробуйте еще раз:");
                s1.nextLine();
            }
        }
    }
    public static void result(final float a, final float b) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите знак +, -, / или *");
        String cm = sc.nextLine();
        switch (cm) {
            case "+":
                System.out.println("Ответ: " + Calculator.summAB(a, b));
                break;
            case "-":
                System.out.println("Ответ: " + Calculator.minusAB(a, b));
                break;
            case "/":
                System.out.println("Ответ: " + Calculator.delenAB(a, b));
                break;
            case "*":
                System.out.println("Ответ: " + Calculator.umnozhAB(a, b));
                break;
            }
        }
    }
