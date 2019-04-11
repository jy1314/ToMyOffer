/** 
 * projectName: ToMyOffer 
 * fileName: RebuildTree.java 
 * packageName: ToOffer 
 * date: 2019年4月11日下午4:50:05 
 * copyright(c) 2018-2020 bupt
 */


package toOffer;

import util.TreeNode;

/**
 * @title:RebuildTree.java
 * @package:ToOffer
 * @description:TODO
 * @author:JerryG
 * @date:2019年4月11日下午4:50:05
 * @version:V1.0
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 * 
 * 思路：
 * 由前序遍历的第一个节点可知根节点。根据根节点，可以将中序遍历划分成左右子树。
 * 在前序遍历中找出对应的左右子树，其第一个节点便是根节点的左右子节点。按照上述方式递归便可重建二叉树。
 */
public class RebuildTree {
	public TreeNode reConstructBinaryTree(int [] pre,int [] in) throws Exception {
		if(pre==null || in==null || pre.length<1 || in.length!=pre.length) {
			return null;
		}
		return reBuildTree(pre, 0, pre.length - 1 , in, 0, in.length - 1);  
    }
	public TreeNode reBuildTree(int []pre,int pres,int pree,int[] in ,int ins,int ine) throws Exception {
		if(pres>pree || ins>ine) return null;
		int value = pre[pres];//前序遍历第一个即为根节点
		int index = ins;
		while(index<=ine && value!=in[index]) {//找中序遍历的根节点
			index++;
		}
		if(index>ine) {//找不到则说明输入有误
			throw new Exception("input error");
		}
		//则中序遍历中左子树为in[ins]到in[index-1],右子树为in[index+1]到in[ine]
		//因此前序遍历的左子树为pre[pres+1]到pre[pres + 1 + (index - 1 - ins)],
		//右子树为pre[pres + 1 + (index - 1 - ins) + 1]到pre[pree]
		TreeNode root = new TreeNode(value);//重建根节点
		root.left = reBuildTree(pre, pres+1, pres + 1 + (index - 1 - ins), in, ins,index-1);
		root.right = reBuildTree(pre, pres + 1 + (index - 1 - ins) + 1, pree, in, index+1, ine);
		return root;
	}
	
}
