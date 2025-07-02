import java.util.Scanner;

public class q6fibonaccirec {
    static int ops = 0;
    
    static int fib(int n) {
        ops++; // 每次呼叫函數就計數
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ops = 0; // 重置計數器
        System.out.println(fib(n));
        System.out.println(ops);
    }
}