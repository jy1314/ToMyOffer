/** 
 * projectName: ToMyOffer 
 * fileName: VerifySquenceOfBST.java 
 * packageName: toOffer 
 * date: 2019年4月14日下午4:22:35 
 * copyright(c) 2018-2020 bupt
 */


package toOffer;

/**
 * @title:VerifySquenceOfBST.java
 * @package:toOffer
 * @description:TODO
 * @author:JerryG
 * @date:2019年4月14日下午4:22:35
 * @version:V1.0
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出true,否则输出false。
 * 假设输入的数组的任意两个数字都互不相同。
 * 
 * 思路：
 * 在后序遍历得到的序列中， 最后一个数字是树的根结点的值。数组中前面的数字可以分为两部分： 
 * 第一部分是左子树结点的值，它们都比根结点的值小;
 * 第二部分是右子树结点的值，它们都比根结点的值大。
 * 递归比较即可。
 */
public class VerifySquenceOfBST {
	 public boolean VerifySquence(int [] sequence) {
	        if(sequence==null||sequence.length<1) return false;
	        return VerifyBST(sequence,0,sequence.length-1);
	 }
	 
	 public boolean VerifyBST(int [] sequence,int s ,int e) {
		 if(s>=e){
			 return true;//没有要处理的节点，则返回true；
		 }
		 int root = sequence[e];//取得根节点
		 int index = s;
		 while(sequence[index]< root && index<e-1) {//找分界点
			 index++;
		 }
		 int temp = index;
		 while(sequence[index]> root && index<e-1) {//找分界点
			 index++;
		 }
		 if (index != e - 1) {//如果还有剩余说明不是后序遍历
	            return false;
	     }
		 index = temp;
		 return VerifyBST(sequence, s,index-1) && VerifyBST(sequence,index,e-1);
	 }
	 
}
