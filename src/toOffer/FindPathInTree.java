/** 
 * projectName: ToMyOffer 
 * fileName: FindPathInTree.java 
 * packageName: toOffer 
 * date: 2019年4月15日下午4:47:10 
 * copyright(c) 2018-2020 bupt
 */


package toOffer;

import java.util.ArrayList;
import java.util.List;

import util.TreeNode;

/**
 * @title:FindPathInTree.java
 * @package:toOffer
 * @description:TODO
 * @author:JerryG
 * @date:2019年4月15日下午4:47:10
 * @version:V1.0
 * 输入一颗二叉树的跟节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。(注意: 在返回值的list中，数组长度大的数组靠前)
 * 
 * 
 */
public class FindPathInTree {
	ArrayList<ArrayList<Integer>> res = new ArrayList<>();
	public void	findPath(TreeNode root,int target) {
		ArrayList<Integer> list = new ArrayList<>();
		if(root != null) findPath(root, target,0,list); 
	}
	
	public void findPath(TreeNode root,int target,int sum, ArrayList<Integer> result) {
		if(root != null) {//节点不为空继续累加
			sum += root.val;//记录和
			result.add(root.val);//记录路径
			if(sum<target) {//没到继续累加
				findPath(root.left,target,sum,result);//判断左右节点
				findPath(root.right,target,sum,result);
			}else if(sum == target){
				if(root.left == null && root.right == null) {//和相等，且是叶子节点，则把路径写入结果集合
					res.add(result);
				}
			}
		}
		result.remove(result.size()-1);//节点判断完后从路径中删除
		//感觉其实可以用栈做
	}
}
