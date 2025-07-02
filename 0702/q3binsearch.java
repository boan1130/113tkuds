import java.util.Scanner;

public class q3binsearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();         // 陣列長度
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();    // 讀入已排序陣列
        }

        int key = scanner.nextInt();       // 查詢值
        int left = 0;
        int right = n - 1;
        int count = 0;
        int index = -1;                    // 找不到預設為 -1

        while (left <= right) {
            count++;
            int mid = (left + right) / 2;
            if (arr[mid] == key) {
                index = mid;
                break;
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(index);   // 輸出索引（或 -1）
        System.out.println(count);   // 輸出比較次數
    }
}
