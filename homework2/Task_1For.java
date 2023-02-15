package homework2;

public class Task_1For {

    static String delSpaceAddPoint(String str) {
        StringBuilder strBuild = new StringBuilder(str.trim());
        char zero = strBuild.charAt(0);
        if (Character.isLowerCase(zero))
            strBuild.setCharAt(0, Character.toUpperCase(zero));
        int start = -1;
        int end = -1;

        for (int i = 1; i < strBuild.length() - 1; i++) {
            start = strBuild.charAt(i) == ' ' &
                    start < 0 &
                    strBuild.charAt(i + 1) == ' ' ? i + 1 : start;
            end = start > 0 & strBuild.charAt(i) == ' ' ? i + 1 : end;

            if (strBuild.charAt(i) != ' ' & end > 0) {
                strBuild.delete(start, end);
                i -= end - start; 
                start = -1;
                end = -1;
            }
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

        String question = "   how you going  I'm    splended  by java :))   Thanks   ";
        System.out.println(question);
        System.out.println(delSpaceAddPoint(question));

    }

}
