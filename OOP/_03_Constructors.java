
class Complex {
    int a;
    int b;

    /* Default Constructor */
    Complex() {
        a = 0;
        b = 0;
    }

    /*
     * Parameterised Constructor :
     * - when it define then default construnctor not create.
     * - we have to create it by own.
     */
    Complex(int a1, int b1) {
        a = a1;
        b = b1;
    }

    void print() {
        System.out.println(a + " + " + b + "i");
    }
}

public class _03_Constructors {

    public static void main(String[] args) {
        Complex c1 = new Complex();
        c1.print();
        Complex c2 = new Complex(15, 20);
        c2.print();
    }

}