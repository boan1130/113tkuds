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
 * 說明：
 * 走訪 n 個站點字串，依序比對起訖站是否出現；
 * 最多比對 n 次，屬於線性時間操作。
 */
