/** 
 * projectName: ToMyOffer 
 * fileName: RandomListNode.java 
 * packageName: util 
 * date: 2019年4月14日下午2:02:52 
 * copyright(c) 2018-2020 bupt
 */


package util;

/**
 * @title:RandomListNode.java
 * @package:util
 * @description:带有随机指针的链表
 * @author:JerryG
 * @date:2019年4月14日下午2:02:52
 * @version:V1.0
 */
public class RandomListNode {
	 	public int label;
	 	public RandomListNode next = null;
	 	public RandomListNode random = null;

	 	public RandomListNode(int label) {
	        this.label = label;
	    }
}
