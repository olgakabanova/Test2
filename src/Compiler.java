import java.util.Scanner;

public class Compiler {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Выберите пример:"+"\n"+"1. Easy (легкий);"+"\n"+"2. Medium (средний);"+"\n"+"3. Hard (сложный)"+"\n");
        int i = s.nextInt();
        if (i==1){
            Easy.easy();
        } else if (i==2) {
            Medium.medium();
        } else if (i==3){
            Hard.hard();
        } else if (i<0){
            System.out.println("Этого нет в выборе. Начните программу заново. ");
        } else if (i>4){
            System.out.println("Этого нет в выборе. Начните программу заново. ");
        }
    }
}

