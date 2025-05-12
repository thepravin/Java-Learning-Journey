public class modularExponentiation {
    static int exponentiation(int x, int y, int p) {
        int answer = 1;
        for (int i = 0; i < y; i++) {
            answer = (answer * x) % p;
        }
        return answer % p;
    }

    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        int p = 13;
        System.out.println("Power is " + exponentiation(x, y, p));
    }
}
