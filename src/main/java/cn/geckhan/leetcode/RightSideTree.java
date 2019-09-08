package cn.geckhan.leetcode;

import java.util.ArrayList;
import java.util.List;

public class RightSideTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

    }
    public List<Integer> run(TreeNode root) {
        List<Integer> rightSideNodes = new ArrayList<Integer>();


        ArrayList<TreeNode> nextLevelNodes = new ArrayList<TreeNode>(1);
        nextLevelNodes.add(root);
        do {
            ArrayList<TreeNode> currentLevelNodes = nextLevelNodes;

            if (currentLevelNodes.isEmpty()||currentLevelNodes.get(0)==null) {
                return rightSideNodes;
            }
            TreeNode currentNode = currentLevelNodes.get(0);
            nextLevelNodes = new ArrayList<TreeNode>();
            rightSideNodes.add(currentNode.val);

            for (TreeNode node :currentLevelNodes){
                if (node.right!=null){
                    nextLevelNodes.add(node.right);
                }

                if (node.left!=null){
                    nextLevelNodes.add(node.left);
                }
            }

        } while (true);
    }
}
