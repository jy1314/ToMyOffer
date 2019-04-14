/** 
 * projectName: ToMyOffer 
 * fileName: PrintTree.java 
 * packageName: toOffer 
 * date: 2019年4月14日下午4:09:30 
 * copyright(c) 2018-2020 bupt
 */


package toOffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import util.TreeNode;

/**
 * @title:PrintTree.java
 * @package:toOffer
 * @description:TODO
 * @author:JerryG
 * @date:2019年4月14日下午4:09:30
 * @version:V1.0
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 * 
 * 思路：
 * 从上到下打印二叉树的规律：每一次打印一个结点的时候，如果该结点有子结点， 则把该结点的子结点放到一个队列的末尾。
 * 接下来到队列的头部取出最早进入队列的结点，重复前面的打印操作，直至队列中所有的结点都被打印出来为止。
 */
public class PrintTree {
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		if(root == null) return result;
		Queue<TreeNode> nodequeue = new LinkedList<>();//队列用于存放下一层的节点
		nodequeue.add(root);//存入根节点
		while(!nodequeue.isEmpty()) {//队列不空就继续
			TreeNode temp = nodequeue.remove();//取出队列首位节点
			result.add(temp.val);//保存值
			if(temp.left != null) {//下一层入队
				nodequeue.add(temp.left);
			}
			if(temp.right != null) {
				nodequeue.add(temp.right);
			}
		}
		return result;
	}
}
