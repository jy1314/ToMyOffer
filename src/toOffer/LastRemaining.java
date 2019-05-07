/** 
 * projectName: ToMyOffer 
 * fileName: LastRemaining.java 
 * packageName: toOffer 
 * date: 2019年5月5日下午10:53:27 
 * copyright(c) 2018-2020 bupt
 */


package toOffer;

import java.util.LinkedList;
import java.util.List;

/**
 * @title:LastRemaining.java
 * @package:toOffer
 * @description:TODO
 * @author:JerryG
 * @date:2019年5月5日下午10:53:27
 * @version:V1.0
 * 0, 1, … , n-1 这n个数字排成一个圈圈，从数字0开始每次从圆圏里删除第m个数字。求出这个圈圈里剩下的最后一个数字。
 * 
 * 思路：创建一个总共有n 个结点的环形链表，然后每次在这个链表中删除第m 个结点。
 */
public class LastRemaining {

	public int lastRemaining(int n, int m) {
		if (n < 1 || m < 1) {
	        return -1;
	    }
		List<Integer> list = new LinkedList<>();
		for(int i = 0;i < n ;i++) {
			list.add(i);
		}
		int idx = 0;
		while(list.size() > 1 ) {
			 // 只要移动m-1次就可以移动到下一个要删除的元素上
	        for (int i = 1; i < m; i++) {
	            //idx = (idx + 1) % list.size();
	        	idx++;
	        	if(idx>=list.size()){
	        		idx = 0;
	        	}
	        	
	        }
	        list.remove(idx);
		}
		return list.get(0);
		
	}
}
