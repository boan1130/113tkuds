package midterm;

import java.util.*;

public class Q5_CPBLPrefixWins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int[] games = new int[n];
        String[] input = sc.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            games[i] = Integer.parseInt(input[i]);
        }

        int k = Integer.parseInt(sc.nextLine());

        // 建立 prefix sum 陣列
        int[] ps = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            ps[i] = ps[i - 1] + games[i - 1];
        }

        // 輸出前 k 場的 prefix sum
        System.out.print("PrefixSum:");
        for (int i = 1; i <= k; i++) {
            System.out.print(" " + ps[i]);
        }
        System.out.println();

        sc.close();
    }
}

/*
     * Time Complexity: O(n)
     * 說明：建立 prefix sum 陣列需要遍歷 n 個元素，每次累加為常數時間操作
     * 輸出前 k 場的 prefix sum 為 O(k)，但由於 k ≤ n，整體仍為 O(n)
     * 因此總時間複雜度為 O(n + k) = O(n)
     */
