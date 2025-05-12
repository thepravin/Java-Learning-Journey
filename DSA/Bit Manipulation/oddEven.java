
public class oddEven {

    public static void oddOrEven(int n) {
        int bitMask = 1;

        if ((n & bitMask) == 0)
            System.out.println(n + " is Even Number");
        else
            System.out.println(n + " is Odd Number");
    }

    public static void main(String[] args) {
        oddOrEven(18);
        oddOrEven(11);
    }
}