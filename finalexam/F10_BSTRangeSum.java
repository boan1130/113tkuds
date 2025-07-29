package finalexam;

import java.util.*;

public class F10_BSTRangeSum {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        String[] input = sc.nextLine().split(" ");
        int L = sc.nextInt();
        int R = sc.nextInt();

        if (input.length == 0 || input[0].equals("-1")) {
            System.out.println("Sum: 0");
            return;
        }

        
        TreeNode root = new TreeNode(Integer.parseInt(input[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int i = 1;
        while (i < input.length) {
            TreeNode current = queue.poll();
            if (current == null) continue;

            if (i < input.length && !input[i].equals("-1")) {
                current.left = new TreeNode(Integer.parseInt(input[i]));
                queue.offer(current.left);
            }
            i++;

            if (i < input.length && !input[i].equals("-1")) {
                current.right = new TreeNode(Integer.parseInt(input[i]));
                queue.offer(current.right);
            }
            i++;
        }

        int sum = rangeSumBST(root, L, R);
        System.out.println("Sum: " + sum);

        sc.close();
    }


    public static int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null) return 0;

        if (root.val < L) {
            return rangeSumBST(root.right, L, R);
        }
        if (root.val > R) {
            return rangeSumBST(root.left, L, R); 
        }

        
        return root.val
             + rangeSumBST(root.left, L, R)
             + rangeSumBST(root.right, L, R);
    }
}

