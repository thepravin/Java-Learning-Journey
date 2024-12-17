
class Complex {
    int a, b;

    void print() {
        System.out.println(a + " + " + b + "i");
    }
}

public class _01_Class {

    public static void main(String args[]) {
        Complex c1 = new Complex();
        c1.a = 5;
        c1.b = 4;
        c1.print();
    }
}