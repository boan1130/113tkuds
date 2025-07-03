import java.util.Scanner;

public class Main15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[][] matrix = new int[N][M];
        
        // 讀取原矩陣
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        // 輸出轉置矩陣
        for (int j = 0; j < M; j++) {
            for (int i = 0; i < N; i++) {
                System.out.print(matrix[i][j]);
                if (i < N - 1) System.out.print(" ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}