/** 
 * projectName: ToMyOffer 
 * fileName: Merge.java 
 * packageName: toOffer 
 * date: 2019年4月12日下午4:03:43 
 * copyright(c) 2018-2020 bupt
 */


package toOffer;

import util.ListNode;

/**
 * @title:Merge.java
 * @package:toOffer
 * @description:TODO
 * @author:JerryG
 * @date:2019年4月12日下午4:03:43
 * @version:V1.0
 * 输入两个递增排序的链表，合并这两个链表并使新链表中的结点仍然是按照递增排序的。
 * 
 * 思路：
 * 循环or递归
 */
public class Merge {
	//循环
	public ListNode MergeList(ListNode list1,ListNode list2) {
		if(list1==null) return list2;
        if(list2==null) return list1;
        ListNode head = null;
        if(list1.val<list2.val) {
        	head = list1;
        	list1 = list1.next;
        }else {
        	head = list2;
        	list2 = list2.next;
        }
        ListNode result = head;
        while(list1 != null && list2 != null) {
        	if(list1.val<list2.val) {
        		head.next = list1;
        		list1 = list1.next;
        	}else {
        		head.next = list2;
        		list2 = list2.next;
			}
        	head = head.next;
        }
        if(list1 == null) {
        	head.next = list2;
        }else {
        	head.next = list1;
        }
		return result;
	}
	
	
	//递归
	public ListNode MergeList2(ListNode list1,ListNode list2) {
		if(list1==null) return list2;
        if(list2==null) return list1;
        ListNode temp = null;//用于记录两个链表中比较小的节点
        if(list1.val<list2.val) {//如果list1小于list2，则节点赋值为list1，反之为list2
        	temp = list1;
        	temp.next = MergeList2(list1.next, list2);//下一个节点在list1.next和list2之间
        }else {
        	temp = list2;
        	temp.next = MergeList2(list1, list2.next);
        }
        return temp;
		
	}

}
