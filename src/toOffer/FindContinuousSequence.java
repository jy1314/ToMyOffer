/** 
 * projectName: ToMyOffer 
 * fileName: FindContinuousSequence.java 
 * packageName: toOffer 
 * date: 2019年4月14日上午12:00:44 
 * copyright(c) 2018-2020 bupt
 */


package toOffer;

import java.util.ArrayList;

/**
 * @title:FindContinuousSequence.java
 * @package:toOffer
 * @description:TODO
 * @author:JerryG
 * @date:2019年4月14日上午12:00:44
 * @version:V1.0
 * 输入一个正数s，打印出所有和为s 的连续正数序列（至少两个数）。
 * 例如输入15，由于1+2+3+4+5=4＋5+6＝7+8=15，所以结果打出3 个连续序列1～5、4～6 和7～8。
 * 
 * 思路：
 * small 和big 分别表示序列的最小值和最大值。首先把small 初始化为1, big 初始化为2。如果从small到big的序列的和大于s，
 * 我们可以从序列中去掉较小的值，也就是增大small的值。如果从small到big的序列的和小于s，我们可以增大big，让这个序列包含更多的数字。
 * 如果最小值大于一半的话，那肯定没有序列了，循环终止。
 */
public class FindContinuousSequence {
	public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
	    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
	    if(sum<3) return result;//和小于3则没有序列
	    int small = 1;
	    int big = 2;
	    int middle = (1 + sum) / 2;
	    int curSum = small + big;
	    while (small < middle) {//最小值大于一半的话，那肯定没有序列了
	    	if (curSum == sum) { //如果和相等，即为所求序列
	            ArrayList<Integer> list = new ArrayList<>();
	            for (int i = small; i <= big; i++) {//从小到大加入序列
	                list.add(i);
	            }
	            result.add(list);
	            big++;
	            curSum += big;
	        }else if(curSum < sum) {//和比目标小，则需要更多的数，最大值+1
	        	big++;
	        	curSum += big;//更新和
	        }else{//和比目标大，则小数删除，最小值+1
	        	curSum -= small++;
	        }
	    }
		return result;
    }
}
