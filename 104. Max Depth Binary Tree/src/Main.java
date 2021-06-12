import java.util.*;

class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
    public TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}

public class Main {
    public static void main(String[] args) {
    /*
                1
              /   \
              2     3
            /     / \
            4     6   7
            \   /     \
              5 8       9
                \
                  10
    */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        // child of 2
        root.left.left = new TreeNode(4);
        root.left.left.right = new TreeNode(5);

        // Child of 3
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        root.right.left.left = new TreeNode(8);
        root.right.left.left.right = new TreeNode(10);

        root.right.right.right = new TreeNode(9);

        System.out.println("Max Depth of the binary Tree = " + MaxDepth(root));

    }
    public static int MaxDepth(TreeNode root){
        int result = 0;

        if (root == null) {
            return 0;
        }

        int left = MaxDepth(root.left);
        int right = MaxDepth(root.right);

        result = Math.max(left, right) + 1;
        return result;
    }
}
