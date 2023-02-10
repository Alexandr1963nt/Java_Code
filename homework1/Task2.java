package homework1 ;
// Вывести все простые числа от 1 до 1000
public class Task2 {
    public static void main(String[] args) {
        System.out.println(1);
        int simple = 2;
        for (int i = 1; i <= 1000; i += 2 ) {
            for (int j = i-1; j > 1 ; j--) {
                simple = (i%j == 0) && (j != 1)? 0 : i;
                if (simple == 0) { break; }
            }
            if (simple != 0) { System.out.println(simple); }
        }
    }
}
