public class _12_String_Builder {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) {  // O(26)
            sb.append(ch);
        }
        System.out.println(sb);       
    }
}
