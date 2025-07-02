import java.util.Scanner;

public class q2seqsearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();           // 讀入陣列長度
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();      // 讀入每個陣列元素
        }

        int key = scanner.nextInt();         // 要搜尋的目標數字
        int count = 0;
        boolean found = false;

        for (int i = 0; i < n; i++) {
            count++;                         // 每比較一次就加一
            if (arr[i] == key) {
                found = true;
                break;                       // 找到了就跳出
            }
        }

        if (found) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println(count);           // 輸出比較次數
    }
}
