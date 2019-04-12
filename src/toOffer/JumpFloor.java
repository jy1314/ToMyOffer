/** 
 * projectName: ToMyOffer 
 * fileName: JumpFloor.java 
 * packageName: toOffer 
 * date: 2019年4月11日下午10:58:33 
 * copyright(c) 2018-2020 bupt
 */


package toOffer;

/**
 * @title:JumpFloor.java
 * @package:toOffer
 * @description:TODO
 * @author:JerryG
 * @date:2019年4月11日下午10:58:33
 * @version:V1.0
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 * 
 * 思路：动态规划，最终发现是斐波那契数列。
 */
public class JumpFloor {
	public int jumpFloor(int target) {
        if(target<2) return target;
        int k1 = 0;
        int k2 = 1;
        int k = 0;
        while(target-->0) {
        	k = k2 + k1;
        	k1 = k2;
        	k2 = k;
        }
        return k;
    }
	//升级版
	//一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
	//思路：一个台阶有两种情况：被跳or不被跳，最后一个必定被跳，则有2^(n-1)种跳法
	public int jumpFloorII(int target) {
        return (int)Math.pow(2,target-1);
    }
}
