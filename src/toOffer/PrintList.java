/** 
 * projectName: ToMyOffer 
 * fileName: PrintList.java 
 * packageName: ToOffer 
 * date: 2019年4月11日下午4:41:57 
 * copyright(c) 2018-2020 bupt
 */


package toOffer;

import java.util.ArrayList;
import java.util.Stack;

import util.ListNode;

/**
 * @title:PrintList.java
 * @package:ToOffer
 * @description:TODO
 * @author:JerryG
 * @date:2019年4月11日下午4:41:57
 * @version:V1.0
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 */
public class PrintList {
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		Stack<Integer> stack = new Stack<>();
		ArrayList<Integer> result = new ArrayList<>();
		if(listNode == null) return result;
		while(listNode!=null) {
			stack.push(listNode.val);
			listNode = listNode.next;
		}
		while(!stack.isEmpty()) {
			result.add(stack.pop());
		}
		return result;
	}
}
