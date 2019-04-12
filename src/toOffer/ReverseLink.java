/** 
 * projectName: ToMyOffer 
 * fileName: ReverseLink.java 
 * packageName: toOffer 
 * date: 2019年4月12日下午3:46:57 
 * copyright(c) 2018-2020 bupt
 */


package toOffer;

import util.ListNode;

/**
 * @title:ReverseLink.java
 * @package:toOffer
 * @description:TODO
 * @author:JerryG
 * @date:2019年4月12日下午3:46:57
 * @version:V1.0
 * 反转链表
 * 
 * 思路：
 * 1、遍历。将指向下一个节点的指针指向上一个节点。
 * 2、递归。先让指向下一个节点的指针为空，然后递归调用，最后再将指向下一个节点的指针指向上一个节点。
 */
public class ReverseLink {
	//遍历
	public ListNode ReverseList(ListNode head) {
		if(head == null || head.next ==null) return head;
		ListNode after = null;
		ListNode before = null;
		
		while(head.next != null) {
			after = head.next;
			head.next = before;
			before = head;
			head = after;
		}
		head.next =before;
		
		return head;
    }
	
	//递归
	public ListNode ReverseList2(ListNode head) {
		if(head == null || head.next ==null) return head;
		ListNode after = head.next;//保存下一个节点
		head.next = null;//将指向下一个节点的指针设为null
		ListNode newhead = ReverseList2(after);//递归，最终结果是尾节点
		after.next = head;//下一个节点的指针指到前一个节点
		return newhead;//尾节点即为新的头节点
	}
}
