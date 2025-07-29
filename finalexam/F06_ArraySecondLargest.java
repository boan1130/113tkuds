package finalexam;
import java.util.*;

public class F06_ArraySecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = findMaxAndSecond(arr, 0, n - 1);
        System.out.println("SecondMax: " + result[1]);

        sc.close();
    }

    
    public static int[] findMaxAndSecond(int[] arr, int left, int right) {
        if (left == right) {
            return new int[]{arr[left], Integer.MIN_VALUE}; 
        }

        int mid = (left + right) / 2;

        int[] leftPair = findMaxAndSecond(arr, left, mid);
        int[] rightPair = findMaxAndSecond(arr, mid + 1, right);

        int max, second;

        if (leftPair[0] > rightPair[0]) {
            max = leftPair[0];
            second = Math.max(leftPair[1], rightPair[0]);
        } else {
            max = rightPair[0];
            second = Math.max(rightPair[1], leftPair[0]);
        }

        return new int[]{max, second};
    }
}

/*
 * Time Complexity: O(n)
 * 說明：使用 divide and conquer 將陣列分成兩半遞迴處理，合併時只做常數次比較。整體為 T(n) = 2T(n/2) + O(1)，為線性時間 O(n)。
 */
