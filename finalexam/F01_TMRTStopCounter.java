package finalexam;
import java.util.*;

public class F01_TMRTStopCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 
        String[] stops = new String[n];
        for (int i = 0; i < n; i++) {
            stops[i] = sc.next(); 
        }

        String start = sc.next();
        String end = sc.next();

        int startIndex = -1;
        int endIndex = -1;

        for (int i = 0; i < n; i++) {
            if (stops[i].equals(start)) {
                startIndex = i;
            }
            if (stops[i].equals(end)) {
                endIndex = i;
            }
        }

        if (startIndex == -1 || endIndex == -1) {
            System.out.println("Invalid");
        } else {
            System.out.println(Math.abs(endIndex - startIndex) + 1);
        }

        sc.close();
    }
}

/*
 * Time Complexity: O(n)
 * 說明：需線性掃描 n 個停靠站，找出起訖站的索引位置；每次比較為常數時間操作，因此總時間與 n 成正比。
 */
