/** 
 * projectName: ToMyOffer 
 * fileName: MinStack.java 
 * packageName: toOffer 
 * date: 2019年4月14日下午3:42:32 
 * copyright(c) 2018-2020 bupt
 */


package toOffer;

import java.util.Stack;

/**
 * @title:MinStack.java
 * @package:toOffer
 * @description:TODO
 * @author:JerryG
 * @date:2019年4月14日下午3:42:32
 * @version:V1.0
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 * 
 * 思路：
 * 把每次的最小元素（之前的最小元素和新压入战的元素两者的较小值）都保存起来放到另外一个辅助栈里。如果每次都把最小元素压入辅助栈，
 * 那么就能保证辅助栈的栈顶一直都是最小元素．当最小元素从数据栈内被弹出之后，同时弹出辅助栈的栈顶元素，
 * 此时辅助栈的新栈顶元素就是下一个最小值。
 */
public class MinStack {
	Stack<Integer> stack = new Stack<>();//存放数据
	Stack<Integer> minStack = new Stack<>();//存放最小值
	 public void push(int node) {
	        if(stack.isEmpty()) {
	        	stack.push(node);
	        	minStack.push(node);
	        }else {
	        	stack.push(node);
	        	int min = minStack.peek();
	        	minStack.push(node < min ? node : min);
	        }
	 }
	    
	 public void pop() {
	       stack.pop();
	       minStack.pop();
	 }
	    
	 public int top() {
		 return stack.peek();
	 }
	    
	 public int min() {
	    return minStack.peek();
	 }
}
