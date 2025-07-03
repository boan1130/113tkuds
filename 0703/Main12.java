import java.util.Scanner;

public class Main12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        for (int i = 1; i <= N; i++) {
            // 從1到i
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                if (j < i) System.out.print(" ");
            }
            
            // 從i-1到1
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(" " + j);
            }
            
            System.out.println();
        }
        
        sc.close();
    }
}