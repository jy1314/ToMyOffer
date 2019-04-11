/** 
 * projectName: ToMyOffer 
 * fileName: CountOne.java 
 * packageName: toOffer 
 * date: 2019年4月11日下午6:21:53 
 * copyright(c) 2018-2020 bupt
 */


package toOffer;

/**
 * @title:CountOne.java
 * @package:toOffer
 * @description:TODO
 * @author:JerryG
 * @date:2019年4月11日下午6:21:53
 * @version:V1.0
 * 请实现一个函数，输入一个整数，输出该数二进制表示中1的个数。例如把9表示成二进制1001，有2位1。因此如果输入9，该函数输出2。
 * 
 * 思路：
 * 常规：
 * 对每一个位置与1进行求与操作，再累加就可以求出当前数字的表示是多少位1  
 * 
 * 其他：
 * 循环让(n - 1) & n。如果n的二进制表示中有k个1，那么这个方法只需要循环k次即可。其原理是不断清除n的二进制表示中最右边的1，
 * 同时累加计数器，直至n为0。因为从二进制的角度讲，n相当于在n - 1的最低位加上1。
 * eg：8（1000）= 7（0111）+ 1（0001），所以8 & 7 = （1000）&（0111）= 0（0000），
 * 清除了8最右边的1（其实就是最高位的1，因为8的二进制中只有一个1）。
 * 再比如7（0111）= 6（0110）+ 1（0001），所以7 & 6 = （0111）&（0110）= 6（0110），
 * 清除了7的二进制表示中最右边的1（也就是最低位的1）。
 */
public class CountOne {
	public int numberOfOne1(int n) {
        int result = 0;  
        // JAVA语言规范中，int整形占四个字节，总计32位  
        // 对每一个位置与1进行求与操作，再累加就可以求出当前数字的表示是多少位1  
        for (int i = 0; i < 32; i++) {  
            result += (n & 1);  //末位为1则result+1，否则不变
            n >>>= 1;  
        }  
        // 返回求得的结果  
        return result;  
	}
	public static int numberOfOne2(int n) {
        int result = 0;  
        // 数字的二进制表示中有多少个1就进行多少次操作  
        while (n != 0) {  
            result++;  
            // 从最右边的1开始，每一次操作都使n的最右的一个1变成了0，  
            // 即使是符号位也会进行操作。  
            n = (n - 1) & n;  
        }  

        // 返回求得的结果  
        return result;  
    }    
}
