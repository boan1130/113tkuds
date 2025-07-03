import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char c = sc.next().charAt(0); // 讀入一個字元
        int ascii = (int) c;          // 轉換為 ASCII 整數值

        System.out.println(ascii);
    }
}
