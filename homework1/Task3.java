package homework1;

import java.util.Scanner;

// Реализовать простой калькулятор

public class Task3 {
    public static void main(String[] args) throws Exception {
        Scanner iScanner = new Scanner(System.in);

        System.out.print("Число A ?  ");
        Double a = iScanner.nextDouble();

        System.out.print("Арифметическое действие ?  ");
        int act = System.in.read();
        char activ = (char) act;

        System.out.print("Число B ?  ");
        Double b = iScanner.nextDouble();

        iScanner.close();

        System.out.printf("\nРезультат %.2f %c %.2f = ", a, activ, b);

        switch (activ) {
            case '+':

                System.out.printf(" %.2f", a + b);
                break;
            case '-':
                System.out.printf(" %.2f", a - b);
                break;
            case '/':
                System.out.printf(" %.2f", a / b);
                break;
            case '*':
                System.out.printf(" %.2f", a * b);
                break;
        }
    }
}
