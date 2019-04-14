/** 
 * projectName: ToMyOffer 
 * fileName: IsPopOrder.java 
 * packageName: toOffer 
 * date: 2019年4月14日下午3:50:34 
 * copyright(c) 2018-2020 bupt
 */


package toOffer;

import java.util.Stack;

/**
 * @title:IsPopOrder.java
 * @package:toOffer
 * @description:TODO
 * @author:JerryG
 * @date:2019年4月14日下午3:50:34
 * @version:V1.0
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。假设压入栈的所有数字均不相等。
 * 例如序列1,2,3,4,5是某栈的压入顺序，序列4,5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。
 * （注意：这两个序列的长度是相等的）
 * 
 * 思路：
 * 解决这个问题很直观的想法就是建立一个辅助栈，把输入的第一个序列中的数字依次压入该辅助栈，并按照第二个序列的顺序依次从该栈中弹出数字。
 * 判断一个序列是不是栈的弹出序列的规律：如果下一个弹出的数字刚好是栈顶数字，那么直接弹出。
 * 如果下一个弹出的数字不在栈顶，我们把压栈序列中还没有入栈的数字压入辅助栈，直到把下一个需要弹出的数字压入栈顶为止。
 * 如果所有的数字都压入栈了仍然没有找到下一个弹出的数字，那么该序列不可能是一个弹出序列。
 */
public class IsPopOrder {
	public boolean IsPopOrder(int [] pushA,int [] popA) {
		boolean result = false;
		if(popA == null || pushA == null || popA.length<1 || popA.length != pushA.length) return result;
		int n = pushA.length;//元素数量
		Stack<Integer> stack = new Stack<>();
		for(int i = 0 ,j = 0;i<n;i++) {
			stack.push(pushA[i]);//元素入栈
			while(!stack.isEmpty() && stack.peek() == popA[j]) {
				//判断栈顶元素是否与出栈元素相同，相同则出栈，直到有不同元素出现或栈为空
				stack.pop();
				j++;
			}
			
		}
		if(stack.isEmpty()) result =true;//如果栈不为空，则说明序列不符
		return result;
	}

}
