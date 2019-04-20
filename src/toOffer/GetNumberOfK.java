/** 
 * projectName: ToMyOffer 
 * fileName: GetNumberOfK.java 
 * packageName: toOffer 
 * date: 2019年4月20日下午11:33:06 
 * copyright(c) 2018-2020 bupt
 */


package toOffer;

/**
 * @title:GetNumberOfK.java
 * @package:toOffer
 * @description:TODO
 * @author:JerryG
 * @date:2019年4月20日下午11:33:06
 * @version:V1.0
 * 统计一个数字：在排序数组中出现的次数。
 * 
 * 思路：
 * 利用改进的二分算法。
 * 由于全是整数，那么可以找k+0.5和k-0.5的位置，相减即为出现次数。
 */
public class GetNumberOfK {
	 public int GetNumberOfK(int [] array , int k) {
		 return searchk(array, k+0.5) - searchk(array, k-0.5);
	 }
	 public int searchk(int []array, double k) {//二分法差找k的位置
		 int start = 0;
		 int end = array.length -1;
		 int mid = 0;
		 while(start<=end) { 
			 mid = (end - start)/2 + start;
			 if(array[mid]>k) {
				 end = mid-1;
			 }else {
				 start = mid+1;
			 }
		 }
		 
		 return start;
	 }
}
