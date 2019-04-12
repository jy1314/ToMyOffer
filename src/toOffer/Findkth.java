/** 
 * projectName: ToMyOffer 
 * fileName: Findkth.java 
 * packageName: toOffer 
 * date: 2019年4月12日下午12:12:17 
 * copyright(c) 2018-2020 bupt
 */


package toOffer;

import util.ListNode;

/**
 * @title:Findkth.java
 * @package:toOffer
 * @description:TODO
 * @author:JerryG
 * @date:2019年4月12日下午12:12:17
 * @version:V1.0
 * 输入一个链表，输出该链表中倒数第k个结点。
 * 
 * 思路：
 * 双指针，第一先走k-1步第二个再走。两个指针的距离保持在k-1 ， 当第一个（走在前面的）指针到达尾部时，第二个指针正好是倒数第k个结点。
 */
public class Findkth {
	public ListNode FindKthToTail(ListNode head,int k) {
		ListNode l1 = head,l2=head;
		for(int i = 1;i<k;i++) {//
			if(l1.next == null) return null;
			l1 = l1.next;
		}
		while(l1.next!=null) {
			l1 = l1.next;
			l2 = l2.next;
		}
		return l2;
	}
}
