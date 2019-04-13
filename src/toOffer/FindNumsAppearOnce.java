/** 
 * projectName: ToMyOffer 
 * fileName: FindNumsAppearOnce.java 
 * packageName: toOffer 
 * date: 2019年4月13日下午11:46:15 
 * copyright(c) 2018-2020 bupt
 */


package toOffer;

/**
 * @title:FindNumsAppearOnce.java
 * @package:toOffer
 * @description:TODO
 * @author:JerryG
 * @date:2019年4月13日下午11:46:15
 * @version:V1.0
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字.
 * 
 * 思路：
 * 按位异或，则相同的都被抵消掉，只剩两个不同的和，由于这两个数字肯定不一样，那么异或的结果肯定不为0，
 * 也就是说在这个结果数字的二进制表示中至少就有一位为1 。我们在结果数字中找到第一个为1的位的位置，
 * 记为第n位。现在我们以第n位是不是１为标准把原数组中的数字分成两个子数组，则两个数组中必然各包含一个不同的数字，
 * 再次按位异或即可得结果。
 */
public class FindNumsAppearOnce {
	public void findNumsAppearOnce(int [] array,int num1[] , int num2[]) {
		if (array == null || array.length < 2) {//边界条件
            return;
        }
        int sum = 0;
        for (int i : array) {//所有数字异或，相同的都被抵消掉，只剩两个不同的和
            sum ^= i;
        }
        int index = 0;
        while ((sum & 1) == 0 && index < 32) {//找到第一个不为0的位，记录在index中
        	sum >>>= 1;
            index++;
        }
        for (int i : array) {//根据第index位是否为0分别进行异或，得到两个结果
        	int j = i;
        	j >>>= index;
            if((j & 1) == 1) {
            	num1[0] ^= i;
            }else {
            	num2[0] ^= i;
            }
        }

        
        
	}
	
	public static int find1From2(int[] a){
        int len = a.length, res = 0;
        for(int i = 0; i < len; i++){
            res = res ^ a[i];
        }
        return res;
    }
}
