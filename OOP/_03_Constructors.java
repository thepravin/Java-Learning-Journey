import java.util.Arrays;

class Complex {
    int a;
    int b;
    int[] arr;

    boolean isShared = false;  // Used for lazy copy

    //* Default Constructor
    Complex() {
        a = 0;
        b = 0;
        arr = new int[]{0};
    }

    //* Parameterized Constructor
     /*
     * Parameterised Constructor :
     * - when it define then default construnctor not create.
     * - we have to create it by own.
     * - memory allocation happens when constructor is called.
     */
    Complex(int a1, int b1, int[] arr) {
        a = a1;
        b = b1;
        this.arr = arr;
    }

    //* Shallow Copy Constructor
    Complex(Complex other) {
        this.a = other.a;
        this.b = other.b;
        this.arr = other.arr;
    }

    //* Deep Copy Constructor
    Complex(Complex other, boolean deepCopy) {
        this.a = other.a;
        this.b = other.b;
        if (deepCopy) {
            this.arr = Arrays.copyOf(other.arr, other.arr.length);
        } else {
            this.arr = other.arr;
        }
    }

    /*  // Deep Copy Constructor (without lazy constructor)
        Complex(Complex other, boolean deepCopy) {
            this.a = other.a;
            this.b = other.b;
            // Deep copy (new array with copied values)
            this.arr = Arrays.copyOf(other.arr, other.arr.length);
        }
 */
    //* Lazy Copy Constructor
    /* 
     -> Lazy Copy defers the actual copying of data until a modification is made.
     -> Initially, multiple objects share the same data (like shallow copy).
     -> When one of them modifies the data, a deep copy is triggered at that moment—this is called copy-on-write.
     */
    Complex lazyCopy(Complex other) {
        Complex copy = new Complex();
        copy.a = other.a;
        copy.b = other.b;
        copy.arr = other.arr;
        copy.isShared = true;
        return copy;
    }

    // Method to set value at arr index (with copy-on-write)
    void setArrValue(int index, int value) {
        if (isShared) {
            // Deep copy triggered
            arr = Arrays.copyOf(arr, arr.length);
            isShared = false;
        }
        arr[index] = value;
    }

    void print() {
        System.out.println(a + " + " + b + "i, arr: " + Arrays.toString(arr));
    }
}


public class _03_Constructors {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        Complex original = new Complex(10, 20, arr);
        original.print();

          // Shallow copy
          Complex shallow = new Complex(original);
          shallow.arr[0] = 99;  // Modifying shared array
          System.out.println("After modifying shallow copy:");
          original.print(); // Also changed due to shared array
          shallow.print();
  
          // Deep copy
          Complex deep = new Complex(original, true);
          deep.arr[1] = 777;  // Only deep copy changes
          System.out.println("After modifying deep copy:");
          original.print(); // Unchanged
          deep.print();

        // Lazy Copy
        Complex lazy = new Complex().lazyCopy(original);
        System.out.println("After lazy copy (before modification):");
        lazy.print();
        original.print();

        // Modify lazy copy
        lazy.setArrValue(0, 99);  // Triggers deep copy
        System.out.println("After modifying lazy copy:");
        lazy.print();
        original.print(); // Original should remain unchanged
    }
}
