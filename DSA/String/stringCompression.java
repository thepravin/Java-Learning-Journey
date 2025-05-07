
public class stringCompression {

    public static String fun(String str) {
        int n = str.length();
        String sb = "";

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            Integer count = 1;
            while (i < n - 1 && ch == str.charAt(i + 1)) {
                count++;
                i++;
            }

            sb += ch;
            if (count > 1)
                sb += count.toString();
        }

        return sb;

    }

    public static void main(String[] args) {
        String str = "aaabbccdd";
        System.out.println(fun(str));
    }
}
