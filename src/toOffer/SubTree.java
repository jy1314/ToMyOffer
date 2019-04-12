/** 
 * projectName: ToMyOffer 
 * fileName: SubTree.java 
 * packageName: toOffer 
 * date: 2019年4月12日下午4:22:25 
 * copyright(c) 2018-2020 bupt
 */


package toOffer;

import util.TreeNode;

/**
 * @title:SubTree.java
 * @package:toOffer
 * @description:TODO
 * @author:JerryG
 * @date:2019年4月12日下午4:22:25
 * @version:V1.0
 * 输入两棵二叉树A 和B，判断B 是不是A 的子结构。(约定空树不是任意一个树的子结构)
 * 思路：
 * 第一步在树A中找到和B的根结点的值一样的结点R， 
 * 第二步再判断树A中以R为根结点的子树是不是包含和树B 一样的结构。
 */
public class SubTree {
	public boolean HasSubtree(TreeNode root1, TreeNode root2) {//先在树A中找到和B的根结点的值一样的结点R
		boolean result = false;
        //有一棵树为null，直接返回false
        if (root2 != null && root1 != null) {
            //如果找到了对应Tree2的根节点的点
            if(root1.val == root2.val){
                //以这个根节点为为起点判断是否包含Tree2
                result = match(root1,root2);//如果包含，则返回true
            }
            //如果找不到，那么就再去root的左儿子当作起点，去判断时候包含Tree2
            if (!result) {
                result = HasSubtree(root1.left,root2);
            }
             
            //如果还找不到，那么就再去root的右儿子当作起点，去判断时候包含Tree2
            if (!result) {
                result = HasSubtree(root1.right,root2);
               }
            }
            //返回结果
        return result;
	}
	public boolean match(TreeNode root1, TreeNode root2) {
		// 只要两个对象是同一个就返回true
        if (root1 == root2) {
            return true;
        }
        // 只要树B的根结点为空就返回true
        if (root2 == null) {
            return true;
        }
        // 树B的根结点不为空，如果树A的根结点为空就返回false
        if (root1 == null) {
            return false;
        }
        // 如果两个结点的值相等，则分别判断其左子结点和右子结点
        if (root1.val == root2.val) {
            return match(root1.left, root2.left) && match(root1.right, root2.right);
        }
        // 结点值不相等返回false
        return false;
	}
}
