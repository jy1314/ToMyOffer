/** 
 * projectName: ToMyOffer 
 * fileName: BalancedTree.java 
 * packageName: toOffer 
 * date: 2019年4月21日下午10:01:30 
 * copyright(c) 2018-2020 bupt
 */


package toOffer;

import util.TreeNode;

/**
 * @title:BalancedTree.java
 * @package:toOffer
 * @description:TODO
 * @author:JerryG
 * @date:2019年4月21日下午10:01:30
 * @version:V1.0
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。如果某二叉树中任意结点的左右子树的深度相差不超过1 ，那么它就是一棵平衡二叉树。
 * 
 * 思路：后序遍历的方式遍历二叉树的每一个结点，在遍历到一个结点之前我们就已经遍历了它的左右子树。
 * 只要在遍历每个结点的时候记录它的深度，我们就可以一边遍历一边判断每个结点是不是平衡的。
 * 
 */
public class BalancedTree {
	
	public boolean IsBalanced_Solution(TreeNode root) {
		int[] depth = new int[1];//用于保存节点深度
		return isBalancedHelper(root,depth);
    }
	public boolean isBalancedHelper(TreeNode root, int[] depth) {
        if (root == null) {//节点为空则深度为0
            depth[0] = 0;
            return true;
        }

        int[] left = new int[1];//左节点深度
        int[] right = new int[1];//右节点深度

        if (isBalancedHelper(root.left, left) && isBalancedHelper(root.right, right)) {//左右节点均为平衡二叉树才需要再判断
            int diff = left[0] - right[0];//深度差
            if (diff >= -1 && diff <= 1) {//深度差小于等于1，是此节点以下平衡二叉树
                depth[0] = 1 + (left[0] > right[0] ? left[0] : right[0]);//此节点深度就是左右深度中深的再+1
                return true;
            }
        }

        return false;
    }
}
