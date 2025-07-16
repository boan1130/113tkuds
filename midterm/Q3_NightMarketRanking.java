package midterm;

import java.util.*;

public class Q3_NightMarketRanking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        double[] scores = new double[n];

        for (int i = 0; i < n; i++) {
            scores[i] = Double.parseDouble(sc.nextLine());
        }

        // 選擇排序：由大到小
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (scores[j] > scores[maxIdx]) {
                    maxIdx = j;
                }
            }
            // 交換
            double temp = scores[i];
            scores[i] = scores[maxIdx];
            scores[maxIdx] = temp;
        }

        // 輸出前五名（或全部）
        int limit = Math.min(5, n);
        for (int i = 0; i < limit; i++) {
            System.out.printf("%.1f\n", scores[i]);
        }

        sc.close();
    }
}

/*
     * Time Complexity: O(n²)
     * 說明：選擇排序使用雙層巢狀迴圈，外層迴圈執行 n-1 次，內層迴圈執行 n-1-i 次
     * 總比較次數為 (n-1) + (n-2) + ... + 1 = n(n-1)/2 = O(n²)
     * 交換次數固定為 n-1 次，但時間複雜度仍由比較次數主導為 O(n²)
     */