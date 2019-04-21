/** 
 * projectName: ToMyOffer 
 * fileName: NumAppearOnce.java 
 * packageName: toOffer 
 * date: 2019年4月21日下午10:19:28 
 * copyright(c) 2018-2020 bupt
 */


package toOffer;

/**
 * @title:NumAppearOnce.java
 * @package:toOffer
 * @description:TODO
 * @author:JerryG
 * @date:2019年4月21日下午10:19:28
 * @version:V1.0
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字
 */
public class NumAppearOnce {
	public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
		if (array == null || array.length < 2) {//边界条件
            return;
        }
		int sum = 0;
        for (int i : array) {//所有数字异或，相同的都被抵消掉，只剩两个不同的和
            sum ^= i;
        }
        int index = 0;
        while ((sum & 1) == 0 && index < 32) {//找到第一位不是0的位
        	sum >>>= 1;
            index++;
        }
        for (int i : array) {//根据index位是否为0将数字分成两组，每组中只有一个数字出现一次
        	int j = i;
        	j >>>= index;
            if((j & 1) == 1) {
            	num1[0] ^= i;
            }else {
            	num2[0] ^= i;
            }
        }
	}
}
