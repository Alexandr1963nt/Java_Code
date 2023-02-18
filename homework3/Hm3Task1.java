package homework3;

// Задан целочисленный список ArrayList. 
// Найти минимальное, максимальное и среднее арифметическое из этого списка.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Hm3Task1 {

    static ArrayList<Integer> fillArList(ArrayList<Integer> list, int length, int mn, int mx) {
        for (int i = 0; i < length; i++) {
            list.add(new Random().nextInt(mn, mx));
        }
        return list;
    }

    static void getMinMaxList(List<Integer> list, int min, int max) {
        for (int item : list) {
            min = item <= min ? item : min;
            max = item >= max ? item : max;
        }
        System.out.printf("min = %d \nmax = %d\n", min, max);
    }

    static double averageList(List<Integer> list) {
        list.size();
        double sum = 0;
        for (int element : list) {
            sum += element;
        }
        double average = sum / list.size();
        return average;
    }

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

        fillArList(list, length, min, max);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        int temp = max;
        max = min;
        min = temp;

        getMinMaxList(list, min, max);

        double mid = averageList(list);
        System.out.printf("Среднее арифметическое = %.2f\n", mid);

    }
}