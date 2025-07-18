package midterm;

import java.util.*;

public class Q4_TieredElectricBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int total = 0;

        for (int i = 0; i < n; i++) {
            int kWh = Integer.parseInt(sc.nextLine());
            int bill = calc(kWh);
            System.out.println("Bill: $" + bill);
            total += bill;
        }

        int average = Math.round((float) total / n);
        System.out.println("Total: $" + total);
        System.out.println("Average: $" + average);

        sc.close();
    }

    // 方法：根據用電量計算費用（四捨五入為整數）
    private static int calc(int kWh) {
        double cost = 0;

        int[] limits = {120, 330, 500, 700, 1000};
        double[] rates = {1.68, 2.45, 3.70, 5.04, 6.24, 8.46};

        int[] ranges = new int[6];
        ranges[0] = Math.min(kWh, limits[0]);

        for (int i = 1; i < limits.length; i++) {
            if (kWh > limits[i - 1]) {
                ranges[i] = Math.min(kWh, limits[i]) - limits[i - 1];
            }
        }

        if (kWh > limits[limits.length - 1]) {
            ranges[5] = kWh - limits[limits.length - 1];
        }

        for (int i = 0; i < 6; i++) {
            cost += ranges[i] * rates[i];
        }

        return (int) Math.round(cost);
    }
}

/*
     * Time Complexity: O(n)
     * 說明：外層迴圈執行 n 次處理每筆用電量，每次呼叫 calc 方法為常數時間 O(1)
     * calc 方法中的迴圈次數固定為 6（電費分段數），與輸入大小無關
     * 因此整體時間複雜度為 O(n × 1) = O(n)
     */