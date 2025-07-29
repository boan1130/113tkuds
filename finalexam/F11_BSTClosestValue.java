package finalexam;

import java.util.*;

public class F11_BSTClosestValue {
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
        int target = sc.nextInt();

        if (input.length == 0 || input[0].equals("-1")) {
            System.out.println("Closest: -1");
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

        int closest = findClosest(root, target);
        System.out.println("Closest: " + closest);
        sc.close();
    }


    public static int findClosest(TreeNode root, int target) {
        int closest = root.val;

        while (root != null) {
            int diff = Math.abs(root.val - target);
            int closestDiff = Math.abs(closest - target);

            
            if (diff < closestDiff || (diff == closestDiff && root.val < closest)) {
                closest = root.val;
            }

           
            if (target < root.val) {
                root = root.left;
            } else if (target > root.val) {
                root = root.right;
            } else {
                break; 
            }
        }

        return closest;
    }
}

