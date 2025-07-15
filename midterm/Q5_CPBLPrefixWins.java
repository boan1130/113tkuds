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
 * 說明：
 * 預先走訪 n 筆戰績資料建立 prefix sum 陣列；
 * 查詢前 k 場只需線性輸出，不影響複雜度；
 * 整體為 O(n)。
 */
