/*
 * Задано уравнение вида q + w = e, q, w, e >= 0. 
 * Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
 * Требуется восстановить выражение до верного равенства. 
 * Предложить хотя бы одно решение или сообщить, что его нет.
 */
package homework1;

public class Task4 {
    public static void main(String[] args) {

        String equation = "2? + ?9 = 69";
        String[] mass = equation.split(" ");

        int y = Integer.parseInt(mass[4]);
        int x1 = 0;
        int x2 = 0;

        for (int i = 0; i < 3; i += 2) {
            int questind = mass[i].indexOf('?') != -1 ? mass[i].indexOf('?') : -1;
            x1 += questind == 0 ? 0 : Integer.parseInt(mass[i].substring(0, 1));
            x2 += questind == 1 ? 0 : Integer.parseInt(mass[i].substring(1, 2));
        }

        int temp = y - x2;

        for (int i = 0; i < 3; i += 2) {
            int questind = mass[i].indexOf('?') != -1 ? mass[i].indexOf('?') : -1;
            if (questind == 1) {
                x2 = Integer.parseInt(mass[i].substring(0, 1)) * 10 + temp % 10;
                mass[i] = String.valueOf(x2);
                x1 = y - x2;
                int j = i == 0 ? 2 : 0;
                mass[j] = String.valueOf(x1);
            }
        }
        if (x1 <= 0) System.out.println("Решения нет");
        else {
        System.out.printf("%s %s %s %s %s", mass[0], mass[1], mass[2], mass[3], mass[4]);
        }
    }

}
