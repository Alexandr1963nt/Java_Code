package homework3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

// Пусть дан произвольный список целых чисел, удалить из него четные числа
public class Hm3Task2 {

    public static void main(String[] args) {

        Scanner iSc = new Scanner(System.in);
        System.out.print("Введите длину списка ");
        int length = iSc.nextInt();
        System.out.print("Введите min значение ");
        int min = iSc.nextInt();
        System.out.print("Введите max значение ");
        int max = iSc.nextInt() + 1;
        iSc.close();

        ArrayList<Integer> list = new ArrayList<>();

        Hm3Task1.fillArList(list, length, min, max);
        System.out.println(list);
        Iterator<Integer> iter = list.iterator();

        while (iter.hasNext()) {
            int i = iter.next() ;
            if (i % 2 == 0) {
                System.out.printf("%d четное. Удаляю\n", i);
                iter.remove();
            }
        }
        System.out.println("Останки списка " + list);
    }
}
