import java.util.Scanner;

public class q1arraysum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();  // 讀入整數個數
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();  // 讀入每個整數
            sum += value;
        }

        System.out.println(sum);  // 輸出總和
        System.out.println(n);    // 輸出 ops（其實就是 n）
    }
}
