package sol;

/**
 * Created by Administrator on 2016/12/14.
 */
public class Solution2 {
    public int Fibonacci(int n) {

        if (n < 0 || n > 39) return 0;
        else if (n == 1 || n == 2) {
            return 1;
        } else {
            int c = 0, b = 1, a = 1;
            for (int i = 3; i < n; i++) {
                c = a + b;
                b = a;
                a = c;
            }
            return c;
        }

    }

    public static void main(String[] args) {
        int fib = new Solution2().Fibonacci(10);
        System.out.println("斐波那契数列的第n项:" + fib);
    }

}
