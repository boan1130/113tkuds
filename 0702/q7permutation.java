import java.util.Scanner;

public class q7permutation {
    static int ops = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] nums = new int[n];
        boolean[] used = new boolean[n];
        int[] perm = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
        }

        generatePermutations(nums, used, perm, 0);

        System.out.println(ops);  // 輸出排列次數（n!）
    }

    public static void generatePermutations(int[] nums, boolean[] used, int[] perm, int depth) {
        if (depth == nums.length) {
            // 找到一組完整排列
            for (int i = 0; i < perm.length; i++) {
                System.out.print(perm[i]);
                if (i < perm.length - 1) System.out.print(" ");
            }
            System.out.println();
            ops++;  // 每找到一組排列就加 1
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                used[i] = true;
                perm[depth] = nums[i];
                generatePermutations(nums, used, perm, depth + 1);
                used[i] = false; // 回溯
            }
        }
    }
}
