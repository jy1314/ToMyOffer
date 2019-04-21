/** 
 * projectName: ToMyOffer 
 * fileName: TreeDepth.java 
 * packageName: toOffer 
 * date: 2019年4月21日下午8:33:53 
 * copyright(c) 2018-2020 bupt
 */


package toOffer;

import util.TreeNode;

/**
 * @title:TreeDepth.java
 * @package:toOffer
 * @description:TODO
 * @author:JerryG
 * @date:2019年4月21日下午8:33:53
 * @version:V1.0
 * 输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
 * 
 * 思路：
 * 显然可以用递归思想。
 */
public class TreeDepth {
	public int treeDepth(TreeNode root) {
		if(root == null) return 0;
		return Math.max(treeDepth(root.left), treeDepth(root.right))+1;
	}
}
