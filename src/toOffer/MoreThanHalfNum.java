/** 
 * projectName: ToMyOffer 
 * fileName: MoreThanHalfNum.java 
 * packageName: toOffer 
 * date: 2019年4月16日下午10:52:49 
 * copyright(c) 2018-2020 bupt
 */


package toOffer;

/**
 * @title:MoreThanHalfNum.java
 * @package:toOffer
 * @description:TODO
 * @author:JerryG
 * @date:2019年4月16日下午10:52:49
 * @version:V1.0
 * 
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。如果不存在则输出0。
 * 
 * 思路：
 * 数组中有一个数字出现的次数超过数组长度的一半，也就是说它出现的次数比其他所有数字出现次数的和还要多。
 * 那么可以维护两个变量， 一个是数组中的一个数字， 一个是次数。
 * 当我们遍历到下一个数字的时候，如果下一个数字和我们之前保存的数字相同，则次数加1，如果下一个数字和我们之前保存的数字不同，则次数减1 。
 * 如果次数为零，我们需要保存下一个数字，并把次数设为1 。由于我们要找的数字出现的次数比其他所有数字出现的次数之和还要多，
 * 那么要找的数字肯定是最后一次把次数设为1 时对应的数字。
 */
public class MoreThanHalfNum {
	public int moreThanHalfNum(int [] array) {
		if(array==null) return 0;
		//TODO
		int num = array[0];
		int count = 1;
		for(int i =1;i<array.length;i++) {
			if(array[i]!=num) {
				count -- ;
			}else {
				count++;
			}
			if(count == 0) {
				num = array[i];
				count = 1;
			}
		}
		//判断是否超过一半
		count  = 0;
		for(int i =0;i<array.length;i++) {
			if(array[i]==num) {
				count++;
			}
			
		}
		if(count < (array.length-1)/2+1) num = 0;//没有超过一半就返回0
		
		return num;
	}
}
