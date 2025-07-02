import java.util.Scanner;

public class q4paircount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();      // 讀入 n
        int[] arr = new int[n];         // 陣列（實際不使用元素值）
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int count = 0;  // 計算配對次數

        // 對每一對 i < j 做配對
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                count++;
            }
        }

        System.out.println(count);  // 輸出總共配對次數
        System.out.println(count);  // ops（同上）
    }
}
