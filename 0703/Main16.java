import java.util.Scanner;

public class Main16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        // 讀取陣列
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // 反向輸出
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i > 0) System.out.print(" ");
        }
        System.out.println();
        
        sc.close();
    }
}