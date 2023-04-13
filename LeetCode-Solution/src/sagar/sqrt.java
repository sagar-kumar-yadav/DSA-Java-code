package sagar;

public class sqrt {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(mySqrt(x));
    }
    public static int mySqrt(int x) {
        long low = 1;
        long high = x;
        long ans = 0;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            long sqr = mid * mid;

            if (sqr == x) {
                return (int) mid;
            }
            if (sqr < x) {
                ans = mid;
                low = mid + 1;
            }
            else {
                high = mid -1;
            }
        }
        return (int) ans;
    }
}
