package finalexam;

import java.util.*;

public class F05_LCMRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcd = recursiveGCD(a, b);
        int lcm = a * b / gcd;

        System.out.println("LCM: " + lcm);
        sc.close();
    }

   
    public static int recursiveGCD(int a, int b) {
        if (a == b) return a;
        if (a > b) return recursiveGCD(a - b, b);
        else return recursiveGCD(a, b - a);
    }
}

/*
 * Time Complexity: O(max(a, b))
 * 說明：使用輾轉相減法遞迴求 GCD，每次減少一個數值，最壞情況下可能遞迴 max(a, b) 次，因此時間複雜度為 O(max(a, b))。
 */
