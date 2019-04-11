/** 
 * projectName: ToMyOffer 
 * fileName: Fibonacci.java 
 * packageName: toOffer 
 * date: 2019年4月11日下午6:13:33 
 * copyright(c) 2018-2020 bupt
 */


package toOffer;

/**
 * @title:Fibonacci.java
 * @package:toOffer
 * @description:TODO
 * @author:JerryG
 * @date:2019年4月11日下午6:13:33
 * @version:V1.0
 * 斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 * eg:1、1、2、3、5、8、13、21、34
 */
public class Fibonacci {
	public int fibonacci(int n) {
		if(n == 0) return 0;
		if(n <= 2) return 1;
		int first = 1;
		int second = 1;
		int result = 2;
		for(int i = 0;i<n-2;i++) {
			result = first + second;
			first = second;
			second = result;
		}
		return result;
	}
}
