package finalexam;

import java.util.*;

public class F12_TreeDiameter {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) {
            this.val = val;
        }
    }

    static int maxDiameter = 0; 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");

        if (input.length == 0 || input[0].equals("-1")) {
            System.out.println("Diameter: 0");
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

        getHeight(root); 
        System.out.println("Diameter: " + maxDiameter);

        sc.close();
    }

    
    public static int getHeight(TreeNode node) {
        if (node == null) return 0;

        int left = getHeight(node.left);
        int right = getHeight(node.right);

        
        maxDiameter = Math.max(maxDiameter, left + right);

        return Math.max(left, right) + 1; 
    }
}

