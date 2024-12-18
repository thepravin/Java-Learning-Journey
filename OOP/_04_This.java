
/* 
 * - Used to resolve ambiguity
 * - point to variable or methods of current object
 */

class Complex {
    int a;
    int b;

    Complex(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void print() {
        System.out.println(a + " + " + b + "i");
    }

    Complex add(Complex num2) {
        this.print();
        num2.print();
        return new Complex(a + num2.a, b + num2.b);
    }
}

public class _04_This {
    public static void main(String[] args) {
        Complex c1 = new Complex(15, 12);
        Complex c2 = new Complex(12, 10);
        Complex result = c1.add(c2);
        result.print(); // * 15 + 12i and 12 + 10i and 27 + 22i
    }
}
