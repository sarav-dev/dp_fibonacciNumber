// import java.lang.*;
import java.util.*;

public class fibonacciNumber {
    public static int dp[];

    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int N = sc.nextInt();
        dp = new int[N+1];

        // Top Down approach
        // Recursion + Memory
        // TC: O(n) SC: O(n)
        
        //for (int i=0; i<N; i++) dp[i] = -1;
        //System.out.println(fib(N));
        
        // Bottom Up approach
        // TC: O(n) SC: O(n)
        
        dp[0] = 0;
        dp[1] = 1;
        
        for (int i=2; i<=N; i++) dp[i] = dp[i-1] + dp[i-2];
        System.out.println("The Fibonacci Number of " + N + " is " + dp[N]);
        
        // No Space approach
        // TC: O(n) SC: O(1)

        //int prev2 = 0;
        //int prev = 1;
        //int cur = 0;

        // for(int i=2; i<N; i++) {
        //     cur = prev2 + prev;
        //     prev2 = prev;
        //     prev = cur;
        // }
        // System.out.println(N == 0 || N == 1 ? N:cur);
        sc.close();
    }

    // public static int fib(int N) {
    //     if (N == 0 || N == 1) return N;
    //     if (dp[N] != 1) return dp[N];

    //     return dp[N] = fib(N-1) + fib(N-2);
    // }
}
