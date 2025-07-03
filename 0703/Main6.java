import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int intValue = sc.nextInt();      // 讀取整數
        double doubleValue = sc.nextDouble();  // 讀取浮點數

        double sum = intValue + doubleValue;

        // 輸出保留兩位小數
        System.out.printf("%.2f\n", sum);
    }
}

