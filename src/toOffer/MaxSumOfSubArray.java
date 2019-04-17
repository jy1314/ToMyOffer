/** 
 * projectName: ToMyOffer 
 * fileName: MaxSumOfSubArray.java 
 * packageName: toOffer 
 * date: 2019年4月17日下午2:10:44 
 * copyright(c) 2018-2020 bupt
 */


package toOffer;

/**
 * @title:MaxSumOfSubArray.java
 * @package:toOffer
 * @description:TODO
 * @author:JerryG
 * @date:2019年4月17日下午2:10:44
 * @version:V1.0
 * 
 * 输入一个整型数组，数组里有正数也有负数。数组中一个或连续的多个整数组成一个子数组。求所有子数组的和的最大值。要求时间复杂度为O(n)。
 */
public class MaxSumOfSubArray {
	public static int findGreatestSumOfSubArray(int[] arr) {
		if(arr == null || arr.length < 1) {
			return -1;
		}
		int sum =arr[0]; //用于维护数组和
		int max =arr[0]; //维护最大值
		for(int i =1;i<arr.length;i++) {
			sum += arr[i];
			if(sum > max) max = sum;
			if(sum < 0) {
				sum = 0;
			}
		}
		return max;
	}
}
