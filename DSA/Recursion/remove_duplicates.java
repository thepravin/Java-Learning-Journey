
public class remove_duplicates {

    public static void fun(String str, StringBuilder newStr, int idx) {
        // base case
        if (idx == str.length()) {
            return;
        }

        if (idx == 0 || str.charAt(idx) != str.charAt(idx - 1)) {
            newStr.append(str.charAt(idx));
        }

        fun(str, newStr, idx + 1);

    }

    public static void main(String[] args) {
        String str = "prraviin";
        StringBuilder newStr = new StringBuilder();
        fun(str, newStr, 0);

        System.out.println(newStr);
    }
}
