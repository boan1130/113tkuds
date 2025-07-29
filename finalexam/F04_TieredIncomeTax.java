package finalexam;
import java.util.*;

public class F04_TieredIncomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] incomes = new int[n];
        int[] taxes = new int[n];
        int totalTax = 0;

        for (int i = 0; i < n; i++) {
            incomes[i] = sc.nextInt();
            taxes[i] = calculateTax(incomes[i]);
            totalTax += taxes[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Tax: $" + taxes[i]);
        }

        System.out.printf("Average: $%d\n", totalTax / n);
        sc.close();
    }

    
    public static int calculateTax(int income) {
        if (income <= 560000) {
            return (int) (income * 0.05);
        } else if (income <= 1260000) {
            return (int) (income * 0.12 - 39200);
        } else if (income <= 2520000) {
            return (int) (income * 0.20 - 151200);
        } else if (income <= 4720000) {
            return (int) (income * 0.30 - 403200);
        } else {
            return (int) (income * 0.40 - 875200);
        }
    }
}

/*
 * Time Complexity: O(n)
 * 說明：每筆收入只需一次常數時間的條件判斷與稅額計算，並累加求平均，總共執行 n 次，因此整體時間複雜度為 O(n)。
 */
