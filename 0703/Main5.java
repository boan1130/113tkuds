import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int celsius = sc.nextInt(); // 讀入攝氏溫度
        int fahrenheit = (celsius * 9 / 5) + 32; // 計算華氏溫度
        System.out.println(fahrenheit); // 輸出結果
    }
}
