
public class shortestDistance {

    public static int fun(String path) {
        int n = path.length();
        int x = 0;
        int y = 0;

        for (int i = 0; i < n; i++) {
            char dir = path.charAt(i);

            if (dir == 'S')
                y--;
            else if (dir == 'N')
                y++;
            else if (dir == 'E')
                x++;
            else
                x--;
        }

        // calculate shortest distance
        int x2 = x * x;
        int y2 = y * y;

        int ans = (int) Math.sqrt(x2 + y2);

        return ans;

    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";

        System.out.print(fun(path));
    }
}
