package midterm;

import java.util.*;

public class Q8_MergeTHSRPriceTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        String[] station = new String[n];
        int[][] price = new int[n][2]; // [][0] = Standard, [][1] = Business

        for (int i = 0; i < n; i++) {
            station[i] = sc.next();         // 站名
            price[i][0] = sc.nextInt();     // Standard
            price[i][1] = sc.nextInt();     // Business
        }

        // 輸出表頭
        System.out.printf("%-8s|%9s|%8s\n", "Station", "Standard", "Business");

        // 輸出每站資料
        for (int i = 0; i < n; i++) {
            System.out.printf("%-8s|%9d|%8d\n", station[i], price[i][0], price[i][1]);
        }

        sc.close();
    }
}
