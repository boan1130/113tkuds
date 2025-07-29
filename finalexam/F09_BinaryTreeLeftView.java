package finalexam;
import java.util.*;

public class F09_BinaryTreeLeftView {
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
        if (input.length == 0 || input[0].equals("-1")) {
            System.out.println("LeftView:");
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

       
        List<Integer> leftView = new ArrayList<>();
        Queue<TreeNode> bfs = new LinkedList<>();
        bfs.offer(root);

        while (!bfs.isEmpty()) {
            int size = bfs.size();
            for (int j = 0; j < size; j++) {
                TreeNode node = bfs.poll();
                if (j == 0) {
                    leftView.add(node.val); 
                }
                if (node.left != null) bfs.offer(node.left);
                if (node.right != null) bfs.offer(node.right);
            }
        }

        System.out.print("LeftView:");
        for (int val : leftView) {
            System.out.print(" " + val);
        }
        System.out.println();

        sc.close();
    }
}

