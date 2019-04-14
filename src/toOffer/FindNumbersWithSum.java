/** 
 * projectName: ToMyOffer 
 * fileName: FindNumbersWithSum.java 
 * packageName: toOffer 
 * date: 2019年4月14日上午12:19:47 
 * copyright(c) 2018-2020 bupt
 */


package toOffer;

import java.util.ArrayList;

/**
 * @title:FindNumbersWithSum.java
 * @package:toOffer
 * @description:TODO
 * @author:JerryG
 * @date:2019年4月14日上午12:19:47
 * @version:V1.0
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
 * 
 * 思路：
 * 乘积最小，即差值最大，那么从两端开始搜索，大的话最大值减小，小的话最小值增大，搜到大小相等或小>大则结束
 */
public class FindNumbersWithSum {
	public ArrayList<Integer> findNumbersWithSum(int [] array,int sum) {
		ArrayList<Integer> result = new ArrayList<>();
		if(array == null || array.length<2) return result;
		int i =0,j = array.length-1;
		while(i<=j) {
			int sums = array[i]+array[j];
			System.out.println(sums);
			if(sum == sums) {
				result.add(array[i++]);
				result.add(array[j--]);
				break;//找到结果直接输出
			}else if(sum > sums) {
				i++;
			}else {
				j--;
			}
			
		}
		return result;
    }
}
