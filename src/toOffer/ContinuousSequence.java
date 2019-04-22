/** 
 * projectName: ToMyOffer 
 * fileName: ContinuousSequence.java 
 * packageName: toOffer 
 * date: 2019年4月22日下午8:08:11 
 * copyright(c) 2018-2020 bupt
 */


package toOffer;

import java.util.ArrayList;

/**
 * @title:ContinuousSequence.java
 * @package:toOffer
 * @description:TODO
 * @author:JerryG
 * @date:2019年4月22日下午8:08:11
 * @version:V1.0
 * 输入一个正数s，打印出所有和为s 的连续正数序列（至少两个数）。
 * 
 * 思路：
 * 用两个数small 和big 分别表示序列的最小值和最大值。首先把small 初始化为1, big 初始化为2。如果从small 到big 的序列的和大于s，
 * 我们可以从序列中去掉较小的值，也就是增大small的值。如果从small 到big 的序列的和小于s，我们可以增大big，让这个序列包含更多的数字
 */
public class ContinuousSequence {
	public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
	       ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		    if(sum<3) return result;//和小于3则没有序列
		    int small = 1;
		    int big = 2;
		    int middle = (1 + sum) / 2;//目标数的一半（不小于一半）
		    int curSum = small + big;//目前的和
		    while (small <= middle) {//最小值大于等于middle的话，那肯定没有序列了
		    	if (curSum == sum) { //如果和相等，即为所求序列
		            ArrayList<Integer> list = new ArrayList<>();
		            for (int i = small; i <= big; i++) {//从小到大加入序列
		                list.add(i);
		            }
		            result.add(list);//序列加入结果列
		            big++;//增大最大值（其实增大最小值也可以）
		            curSum += big;//更新和
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
