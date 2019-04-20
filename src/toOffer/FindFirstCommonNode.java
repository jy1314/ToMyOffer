/** 
 * projectName: ToMyOffer 
 * fileName: FindFirstCommonNode.java 
 * packageName: toOffer 
 * date: 2019年4月20日下午9:54:58 
 * copyright(c) 2018-2020 bupt
 */


package toOffer;

import util.ListNode;

/**
 * @title:FindFirstCommonNode.java
 * @package:toOffer
 * @description:TODO
 * @author:JerryG
 * @date:2019年4月20日下午9:54:58
 * @version:V1.0
 * 输入两个链表，找出它们的第一个公共结点。
 * 
 * 思路：
 * 扫描两遍，第一遍获取差值，第二遍长的先走，同步后同时走，直到找到公共节点。
 * 
 */
public class FindFirstCommonNode {
	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		if(pHead1 == null || pHead2 == null) return null;
		ListNode p1 = pHead1;
		ListNode p2 = pHead2;
		if(p1 == p2) return p1;
		int count = 0;
		while(p1.next != null && p2.next != null) {//找出两个链表的差值
			p1 = p1.next;
			p2 = p2.next;
		}
		if(p1.next == null) {//p1比p2短
			while(p2.next!=null) {
				count++;
				p2 = p2.next;
			}
			p1 = pHead1;
			p2 = pHead2;
			while(count!=0) {
				count --;
				p2 = p2.next;
			}
		}else {
			while(p1.next!=null) {
				count++;
				p1 = p1.next;
			}
			p1 = pHead1;
			p2 = pHead2;
			while(count!=0) {
				count --;
				p1 = p1.next;
			}
		}
		while(p1!=null && p2!= null) {
			if(p1 == p2) return p1;
			p1 = p1.next;
			p2 = p2.next;
		}
		
		return null;
	}
}
