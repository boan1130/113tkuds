package midterm;

import java.util.*;

public class Q2_NextTHSRDeparture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int[] times = new int[n];
        String[] rawTimes = new String[n];

        for (int i = 0; i < n; i++) {
            rawTimes[i] = sc.nextLine();
            times[i] = toMinutes(rawTimes[i]);
        }

        String query = sc.nextLine();
        int queryMinutes = toMinutes(query);

        int idx = binarySearch(times, queryMinutes);

        if (idx == n) {
            System.out.println("No train");
        } else {
            System.out.println(rawTimes[idx]);
        }

        sc.close();
    }

    private static int toMinutes(String timeStr) {
        String[] parts = timeStr.split(":");
        return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
    }

    private static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}


/*
     * Time Complexity: O(log n)
     * 說明：主要時間複雜度由 binarySearch 方法決定，二分搜尋需要 O(log n) 次比較
     * 輸入處理和時間轉換為 O(n)，但整體瓶頸在於二分搜尋的 O(log n)
     * 因此整體時間複雜度為 O(n + log n) = O(n)
     */