package homework2;

import java.util.Scanner;

public class Task_1 {
    static String inputPhrase() {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите фразу  ");
        String str = iScanner.nextLine();
        // System.out.println(str);
        iScanner.close();
        return str;
    }

    static String delSpace(String str) {
        StringBuilder strBuild = new StringBuilder(str);

        while (strBuild.indexOf("  ") != -1) {
            int i = strBuild.indexOf("  ");
            strBuild.deleteCharAt(i + 1);
        }
        for (int i = 0; i < strBuild.length() - 1; i++) {
            if (strBuild.charAt(i) == ' ' && Character.isUpperCase(strBuild.charAt(i + 1))) {
                strBuild.insert(i, '.');
                i++;
            }
        }
        strBuild.append('.');
        return str = strBuild.toString();
    }

    public static void main(String[] args) {


        System.out.println(delSpace(inputPhrase()));

    }

}
