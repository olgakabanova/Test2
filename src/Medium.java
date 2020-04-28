import java.util.NoSuchElementException;
import java.util.Scanner;

public class Medium {
    public static void medium () {
        Scanner input = new Scanner(System.in);
        System.out.printf("Введите значения a и b через пробел"+"\n");
        while (input.hasNext()) {
            try {
                result(input.nextFloat(), input.nextFloat());
                break;
            }
            catch (NoSuchElementException exp) {
                System.out.println("Ошибка ввода! Попробуйте еще раз:"+"\n");
                input.nextLine();
            }
        }
    }
    public static void result(final float a, final float b) {
        System.out.println("Сумма равна " + Calculator.summAB(a,b));
        System.out.println("Вычитание равно " + Calculator.minusAB(a,b));
        System.out.println("Умножение равно " + Calculator.umnozhAB(a,b));
        System.out.println("Деление равно " + Calculator.delenAB(a,b));
    }
}