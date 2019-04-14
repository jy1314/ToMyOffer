/** 
 * projectName: ToMyOffer 
 * fileName: CloneList.java 
 * packageName: toOffer 
 * date: 2019年4月14日下午2:02:02 
 * copyright(c) 2018-2020 bupt
 */


package toOffer;

import util.RandomListNode;

/**
 * @title:CloneList.java
 * @package:toOffer
 * @description:TODO
 * @author:JerryG
 * @date:2019年4月14日下午2:02:02
 * @version:V1.0
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），
 * 返回结果为复制后复杂链表的head。（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）.
 * 
 * 思路：
 * 在不用辅助空间的情况下实现O(n)的时间效率.
 * 第一步：仍然是根据原始链表的每个结点N 创建对应的N’。把N’链接在N的后面.
 * 第二步：设置复制出来的结点的random。假设原始链表上的N的random指向结点S，
 * 		那么其对应复制出来的N’是N的next指向的结点，同样S’也是S的next指向的结点。
 * 第三步：把这个长链表拆分成两个链表。把奇数位置的结点用next . 
 * 		链接起来就是原始链表，把偶数位置的结点用next 链接起来就是复制 出来的链表。
 */
public class CloneList {
	public RandomListNode Clone(RandomListNode pHead){
		if(pHead == null) return null;
		CloneNodes(pHead);//复制节点
		CloneRandom(pHead);//复制随机指针
		
		return ReconnectNodes(pHead);
		
    }
	//复制节点
	public void CloneNodes(RandomListNode head) {
		while (head != null) {
            // 创建一个新的结点,将被复制结点的值传给复制结点
			RandomListNode tmp = new RandomListNode(head.label);
            // 复制结点的next指向下一个要被复制的结点
            tmp.next = head.next;
            // 被复制结点的next指向复制结点
            head.next = tmp;
            // 到些处就已经完成了一个结点的复制并且插入到被复制结点的后面
            // head指向下一个被复制结点的位置
            head = tmp.next;
        }
	}
	//复制随机指针
	public void CloneRandom(RandomListNode head) {
		while (head != null) {
			if (head.random != null) {
                // 复制结点的random指向被复制结点的random字段的下一个结点
                // head.next：表求复制结点，
                // head.random：表示被复制结点的random所指向的结点，
                // 它的下一个结点就是它的复制结点
                head.next.random = head.random.next;
            }
            // 指向下一个要处理的复制结点,跳过复制的节点
            head = head.next.next;
		}
	}
	//拆分两个链表，并返回新链表
	public RandomListNode ReconnectNodes(RandomListNode head) {
		 // 用于保存复制链表的头结点
		RandomListNode newHead = head.next;
        // 用于记录当前处理的复制结点
		RandomListNode pointer = newHead;
        //原结点的next指向下一个原结点
        head.next = newHead.next;
        // 指向新的原结点
        head = head.next;

        while (head != null) {
            // pointer指向复制结点
            pointer.next = head.next;
            pointer = pointer.next;
            // head的下一个指向复制结点的下一个结点，即原来链表的结点
            head.next = pointer.next;
            // head指向下一个原来链表上的结点
            head = pointer.next;
        }

        // 返回复制链表的头结点
        return newHead;
	}
	
	
	
}
