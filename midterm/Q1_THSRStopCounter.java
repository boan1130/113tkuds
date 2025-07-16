package midterm;

import java.util.*;

public class Q1_THSRStopCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        String[] stops = sc.nextLine().split(" ");
        String start = sc.next();
        String end = sc.next();

        int startIdx = -1, endIdx = -1;
        for (int i = 0; i < n; i++) {
            if (stops[i].equals(start)) startIdx = i;
            if (stops[i].equals(end)) endIdx = i;
        }

        if (startIdx == -1 || endIdx == -1) {
            System.out.println("Invalid");
        } else {
            System.out.println(Math.abs(endIdx - startIdx) + 1);
        }

        sc.close();
    }
}

/*
     * Time Complexity: O(n)
     * 說明：需要遍歷長度為 n 的 stops 陣列一次來找到起始和終點站的索引
     * 字串比較 equals() 在最壞情況下為 O(k)，k 為字串長度，但通常視為常數
     * 因此整體時間複雜度為 O(n)
     */
