import java.util.NoSuchElementException;
import java.util.Scanner;

public class Hard {
    private static Scanner scanner;

    static {
        scanner = new Scanner(System.in);
    }

    public static void hard () {
        System.out.println("Введите значения a и b через пробел: "+"\n");
        while (scanner.hasNext()) {
            try {
                result(scanner.nextFloat(), scanner.nextFloat());
                break;
            } catch (NoSuchElementException exp) {
                System.err.println("Ошибка ввода! Попробуйте еще раз:"+"\n");
                scanner.nextLine();
            }
        }
    }

    public static void result(final float a, final float b) {
        scanner.nextLine();
        String cm = Calculator.scannerZnak(scanner);
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
