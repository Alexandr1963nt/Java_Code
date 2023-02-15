package homework2;

public class Task_1For2 {

    static String delSpaceAddPoint(String str) {
        StringBuilder strBuild = new StringBuilder(str.trim());
        char zero = strBuild.charAt(0);
        if (Character.isLowerCase(zero))
            strBuild.setCharAt(0, Character.toUpperCase(zero));
        for (int i = 1; i < strBuild.length() - 1; i++) {
            if (strBuild.charAt(i) == ' ' & strBuild.charAt(i + 1) == ' ') {
                strBuild.deleteCharAt(i + 1);
                i--;
            }
            if (strBuild.charAt(i) == ' ' && Character.isUpperCase(strBuild.charAt(i + 1))) {
                strBuild.insert(i, '.');
                i++;
            }
        }
        strBuild.append('.');
        return str = strBuild.toString();
    }

    public static void main(String[] args) {

        String question = "   how you going  I'm    splended  by java :))   Thanks   ";
        System.out.println(question);
        System.out.println(delSpaceAddPoint(question));

    }

}
