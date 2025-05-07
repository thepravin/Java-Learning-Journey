public class _12_String_Methods {
    public static void main(String args[]) {
        String str = "prAviN";

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        // System.out.println(str.startsWith("pr1"));
        // System.out.println("PRAVIN".startsWith("pr"));
        System.out.println("PRAVIN".startsWith("PR"));

        System.out.println(str.charAt(2)); // print: A

        int age = 21;
        System.out.println(String.valueOf(age)); // int to string

        String sentence = "I love Java, Java is a good language";
        String newSentence = sentence.replace("Java", "C++");
        System.out.println(newSentence);

        System.out.println(sentence.contains("C++"));
        System.out.println(newSentence.contains("C++"));

        System.out.println(sentence.substring(2, 8)); // 2 include , 8 exclude

        /*
         * .split("char or string or space or ,")
         * - return array
         */
        String words[] = sentence.split(" ");
        /*
         * for(String word : words){
         * System.out.println(word);
         * }
         */

        char charArray[] = str.toCharArray();
        /*
         * for(char ch : charArray){
         * System.out.println(ch);
         * }
         */

        String empty = "";
        System.out.println(empty.isEmpty());

        String blank = "   ";
        System.out.println(blank.isBlank());

        /*
         * .trim() -> remove spaces from front and back
         * 
         */

        /*
         * str1.compareTo(str2) -> lexicogriphicaly compare two strings.
         * 0 = equal
         * < 0 = -ve str1<str2
         * > 0 = +ve str1 > str2
         */

         /* 
          * str1.compareToIgnoreCase(str2) -> ignore upper and lower case.
          */
    }
}