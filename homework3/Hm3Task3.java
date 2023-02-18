package homework3;
// 3* Реализовать алгоритм сортировки слиянием

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Hm3Task3 {

    static Integer[] createArray(int length, int min, int max) {
        Integer[] myArray = new Integer[length];
        for (int i = 0; i < length; i++) {
            myArray[i] = new Random().nextInt(min, max);
        }
        return myArray;
    }

    static void printArray(Object[] newArr) {
        System.out.print("[");
        for (Object item : newArr) {
            System.out.print(item + ", ");
        }
        System.out.print("\b\b]\n");
    }

    static ArrayList<Integer> convertArrayToList(Integer[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int item : array) {
            list.add(item);
        }
        return list;
    }

    static ArrayList<Integer> differentList(List<Integer> base) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : base) {
            list.add(i);
        }
        return list;
    }

    static ArrayList<Integer> mergeSortArray(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();
        if (list.size() < 2)
            return list;
        else if ((list.size() == 2)) {
            if (list.get(1) < list.get(0)) {
                list.add(0, list.remove(1));
            }
            return list;
        } else {

            int half = list.size() / 2;

            List<Integer> subList1 = mergeSortArray(differentList(list.subList(0, half)));
            ArrayList<Integer> subList2 = mergeSortArray(differentList(list.subList(half, list.size())));

            while (subList1.size() > 0 && subList2.size() > 0) {
                int element = subList1.get(0) <= subList2.get(0) ? subList1.remove(0) : subList2.remove(0);
                result.add(element);
            }
            result.addAll(subList1);
            result.addAll(subList2);
        }

        return result;
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

        Integer[] newArr = createArray(length, min, max);
        System.out.println("Задан массив ");
        printArray(newArr);

        ArrayList<Integer> instead = convertArrayToList(newArr);
        
        System.out.println("Сортировка массива стандартным Arrays.parallelSort(массив)");
        Arrays.parallelSort(newArr);
        printArray(newArr);

        // рекурсивная Альтернатива по честному :)))

        Integer[] recursResultArr = new Integer[length];
        mergeSortArray(instead).toArray(recursResultArr);
        System.out.println("Рекурсивная Альтернатива по честному :)))");
        printArray(recursResultArr);

    }

}
