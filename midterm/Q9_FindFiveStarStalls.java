package midterm;

import java.util.*;

public class Q9_FindFiveStarStalls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int[] scores = new int[n];
        String[] input = sc.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            scores[i] = Integer.parseInt(input[i]);
        }

        // 第一次走訪：統計 5 分數量
        int count = 0;
        for (int score : scores) {
            if (score == 5) count++;
        }

        if (count == 0) {
            System.out.println("None");
        } else {
            // 第二次走訪：收集 5 分的索引
            int[] result = new int[count];
            int idx = 0;
            for (int i = 0; i < n; i++) {
                if (scores[i] == 5) {
                    result[idx++] = i;
                }
            }

            // 輸出結果
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i]);
                if (i < result.length - 1) System.out.print(" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
