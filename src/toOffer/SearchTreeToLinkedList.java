/** 
 * projectName: ToMyOffer 
 * fileName: SearchTreeToLinkedList.java 
 * packageName: toOffer 
 * date: 2019年4月16日下午5:34:39 
 * copyright(c) 2018-2020 bupt
 */


package toOffer;

import java.util.Stack;

import util.TreeNode;

/**
 * @title:SearchTreeToLinkedList.java
 * @package:toOffer
 * @description:TODO
 * @author:JerryG
 * @date:2019年4月16日下午5:34:39
 * @version:V1.0
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向
 * 
 * 解题思路：
 * 核心是中序遍历的非递归算法。因为中序遍历算法的特点是按照从小到大的顺序遍历二叉树的每一个结点。
 * 修改当前遍历节点与前一遍历节点的指针指向。
 * 当遍历到根结点的时候，我们把树看成三部分：根结点，左子树，右子树。
 * 根据排序链表的定义，根结点将和它的左子树的最大一个结点链接起来，同时它还将和右子树最小的结点链接起来。
 */
public class SearchTreeToLinkedList {
	//非递归
	public TreeNode Convert(TreeNode pRootOfTree) {
		if(pRootOfTree==null)//判边界条件
            return null;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode p = pRootOfTree;
        TreeNode pre = null;//保存上一节点
        boolean isFirst = true;//是否是第一次遍历
        while(p!=null||!stack.isEmpty()){
            while(p!=null){
                stack.push(p);
                p = p.left;
            }
            p = stack.pop();
            if(isFirst){
            	pRootOfTree = p;// 将中序遍历序列中的第一个节点记为pRootOfTree,即链表的头节点
                pre = pRootOfTree;
                isFirst = false;
            }else{
                pre.right = p;
                p.left = pre;
                pre = p;
            }      
            p = p.right;
        }
        return pRootOfTree;
    }
	/*
	 * 方法二：递归版
		解题思路：
		1.将左子树构造成双链表，并返回链表头节点。
		2.定位至左子树双链表最后一个节点。
		3.如果左子树链表不为空的话，将当前root追加到左子树链表。
		4.将右子树构造成双链表，并返回链表头节点。
		5.如果右子树链表不为空的话，将该链表追加到root节点之后。
		6.根据左子树链表是否为空确定返回的节点。
	 * 
	 */
	public TreeNode Convert2(TreeNode root) {
        if(root==null)
            return null;
        if(root.left==null&&root.right==null)
            return root;
        // 1.将左子树构造成双链表，并返回链表头节点
        TreeNode left = Convert(root.left);
        TreeNode p = left;
        // 2.定位至左子树双链表最后一个节点
        while(p!=null&&p.right!=null){
            p = p.right;
        }
        // 3.如果左子树链表不为空的话，将当前root追加到左子树链表
        if(left!=null){
            p.right = root;
            root.left = p;
        }
        // 4.将右子树构造成双链表，并返回链表头节点
        TreeNode right = Convert2(root.right);
        // 5.如果右子树链表不为空的话，将该链表追加到root节点之后
        if(right!=null){
            right.left = root;
            root.right = right;
        }
        return left!=null?left:root;       
	}
}
