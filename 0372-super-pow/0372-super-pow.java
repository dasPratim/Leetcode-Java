public class Solution {
    public int superPow(int a, int[] b) {
        long res = 1;
        a = a % 1337;
        for (int i = 0; i < b.length; ++i) {
            res = pow(res, 10) * pow(a, b[i]) % 1337;
        }
        return (int)res;
    }
    private long pow(long x, int n) {
        if (n == 0) return 1;
        long v = pow(x, n / 2);
        if (n % 2 == 0) {
            return v * v % 1337;
        } 
        else {
            return v * v * x % 1337;
        }
    }
}