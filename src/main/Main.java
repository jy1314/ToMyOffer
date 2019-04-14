/** 
 * projectName: ToMyOffer 
 * fileName: Main.java 
 * packageName: main 
 * date: 2019年4月11日上午11:56:24 
 * copyright(c) 2018-2020 bupt
 */


package main;

import java.util.ArrayList;
import java.util.Arrays;

import toOffer.Fibonacci;
import toOffer.FindContinuousSequence;
import toOffer.FindNumbersWithSum;
import toOffer.IsPopOrder;
import toOffer.JumpFloor;
import toOffer.ReorderArray;
import toOffer.ReplaceSpace;
import toOffer.VerifySquenceOfBST;

/**
 * @title:Main.java
 * @package:main
 * @description:刷题测试类
 * @author:JerryG
 * @date:2019年4月11日上午11:56:24
 * @version:V1.0
 */
public class Main {

	/**
	 * @title: main 
	 * @description: TODO
	 * @author: JerryG
	 * @date: 2019年4月11日 上午11:56:24
	 * @param args
	 * @throws: 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VerifySquenceOfBST vb = new VerifySquenceOfBST();
		int a[] = {4,8,6,12,16,14,10};
		System.out.println(vb.VerifySquence(a));
	}

}
