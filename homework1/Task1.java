package homework1;

/*
 * Вычислить n-ое треугольное число(сумма чисел от 1 до n)
 * n! (произведение чисел от 1 до n)
 */
import java.util.Scanner;

public class Task1 {

    static int factor(int n) {
        if(n==1)return 1;
        return n * factor(n-1);
    }

    static int numtriangle (int n) {
        if(n==1)return 1;
        return n + numtriangle(n-1);
    }

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число N ");
        Integer n = iScanner.nextInt();
        iScanner.close();
        // int result = 1;        
        // for (int i = n; i > 1; i--) {
        //     result += i;
        // }
        // System.out.printf("Сумма чисел от 1 до %d = %d\n", n, result);
        System.out.printf("Сумма чисел от 1 до %d = %d\n", n, numtriangle(n));
        // result = 1;
        // for (int i = n; i > 1; i--) {
        //     result *= i;
        // }
        // System.out.printf("Факториал числа %d = %d\n", n, result);

        System.out.printf("Факториал числа %d = %d\n", n, factor(n));
    }
}
