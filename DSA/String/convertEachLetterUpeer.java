
public class convertEachLetterUpeer {

    public static String fun(String str) {
        int n = str.length();
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < n; i++) {
            if (str.charAt(i - 1) == ' ') {
                ch = Character.toUpperCase(str.charAt(i));
                sb.append(ch);
            } else {
                sb.append(str.charAt(i));
            }

        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "hi, i am pravin";
        System.out.println(fun(str));
    }
}
