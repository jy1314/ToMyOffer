/** 
 * projectName: ToMyOffer 
 * fileName: UglyNumber.java 
 * packageName: toOffer 
 * date: 2019年4月19日上午11:56:06 
 * copyright(c) 2018-2020 bupt
 */


package toOffer;

import java.util.ArrayList;

/**
 * @title:UglyNumber.java
 * @package:toOffer
 * @description:TODO
 * @author:JerryG
 * @date:2019年4月19日上午11:56:06
 * @version:V1.0
 * 把只包含质因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，因为它包含质因子7。 
 * 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 * 
 * 思路：
 * 第一种：逐个判断每个数字是不是丑数的解法，直观但不够高效。
 * 第二种：由于1是最小的丑数，那么从1开始，把2*1，3*1，5*1，进行比较，得出最小的就是1的下一个丑数，也就是2*1，
 * 这个时候再比较，2*2，3*1，5*1，如此循环下去
 */
public class UglyNumber {
	public int GetUglyNumber_Solution(int index) {
        if(index <= 0) return 0;
        if(index == 1) return 1;
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        //三个下标用于记录丑数的位置
        int i2=0,i3=0,i5=0;
        while(list.size()<index){
            //三个数都是可能的丑数，取最小的放进丑数数组里面
            int n2=list.get(i2)*2;
            int n3=list.get(i3)*3;
            int n5=list.get(i5)*5;
            int min = Math.min(n2,Math.min(n3,n5));
            list.add(min);
            if(min==n2)
                i2++;
            if(min==n3)
                i3++;
            if(min==n5)
                i5++;
        }
        return list.get(list.size()-1);
    }
}
