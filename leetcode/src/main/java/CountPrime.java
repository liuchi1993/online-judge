/**
 * @Author: liuchi
 * @Date: 2019/8/14 19:24
 */
public class CountPrime {
    public static int countPrime(int n) {
        if (n <= 1) {
            return 0;
        }
        int count = 0;
        boolean[] notPrime = new boolean[n + 1];
        for (int i = 2; i < n; i++) {
            if (notPrime[i]) {
                continue;
            }
            count++;
            for (long j = (long) i * i; j < n; j += i){
                notPrime[(int)j] = true;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(countPrime(n));
    }
}
