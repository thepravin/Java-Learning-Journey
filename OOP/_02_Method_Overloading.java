
class Sum {
     void add(int a, int b) {
          System.out.println(a + b);
     }

     void add(int a, int b, int c) {
          System.out.println(a + b + c);

     }

     void add(int a, int b, int c, int d) {
          System.out.println(a + b + c + d);
     }
}

public class _02_Method_Overloading {
     public static void main(String[] args) {
          Sum s1 = new Sum();
          s1.add(5, 5);
          s1.add(5, 5, 5);
          s1.add(5, 5, 5, 5);
     }
}
