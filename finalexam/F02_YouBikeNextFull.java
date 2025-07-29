package finalexam;  
import java.util.*;

public class F02_YouBikeNextFull {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 
        sc.nextLine();       

        int[] times = new int[n];

        
        for (int i = 0; i < n; i++) {
            String[] parts = sc.nextLine().split(":");
            int hour = Integer.parseInt(parts[0]);
            int minute = Integer.parseInt(parts[1]);
            times[i] = hour * 60 + minute;
        }

        
        String[] queryParts = sc.nextLine().split(":");
        int queryTime = Integer.parseInt(queryParts[0]) * 60 + Integer.parseInt(queryParts[1]);

        
        int left = 0, right = n - 1;
        int ans = -1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (times[mid] > queryTime) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (ans == -1) {
            System.out.println("No bike");
        } else {
            int hour = times[ans] / 60;
            int minute = times[ans] % 60;
            System.out.printf("%02d:%02d\n", hour, minute);
        }

        sc.close();
    }
}

/*
 * Time Complexity: O(log n)
 * 說明：以二分搜尋法在遞增時間陣列中查找第一個大於查詢時間的元素，時間複雜度為對數時間。
 */
