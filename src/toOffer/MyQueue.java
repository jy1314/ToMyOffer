/** 
 * projectName: ToMyOffer 
 * fileName: MyList.java 
 * packageName: ToOffer 
 * date: 2019年4月11日下午5:22:35 
 * copyright(c) 2018-2020 bupt
 */


package toOffer;

import java.util.Stack;

/**
 * @title:MyList.java
 * @package:ToOffer
 * @description:TODO
 * @author:JerryG
 * @date:2019年4月11日下午5:22:35
 * @version:V1.0
 * 用两个栈实现一个队列。
 * 队列的声明如下，请实现它的两个函数add 和delete，分别完成在队列尾部插入结点和在队列头部删除结点的功能。
 * 
 * 思路：把数据1、2、3分别入栈一，然后从栈一中出来（3、2、1），放到栈二中，
 * 		那么，从栈二中出来的数据（1、2、3）就符合队列的规律了
 */
public class MyQueue {
	Stack<Object> stack1 = new Stack<>();
	Stack<Object> stack2 = new Stack<>();
	public void add(Object a) {
		while(!stack2.isEmpty()) {
			stack1.push(stack2.pop());
		}
		stack1.push(a);
		while(!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}
	}
	
	public void delete() {
		stack2.pop();
	}
	
}
