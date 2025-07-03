import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[][] arr = new int[N][M];
        
        // 讀取陣列
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        // 計算每列總和並輸出
        for (int j = 0; j < M; j++) {
            int sum = 0;
            for (int i = 0; i < N; i++) {
                sum += arr[i][j];
            }
            if (j > 0) System.out.print(" ");
            System.out.print(sum);
        }
        System.out.println();
        
        sc.close();
    }
}