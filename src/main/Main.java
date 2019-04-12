/** 
 * projectName: ToMyOffer 
 * fileName: Main.java 
 * packageName: main 
 * date: 2019年4月11日上午11:56:24 
 * copyright(c) 2018-2020 bupt
 */


package main;

import java.util.Arrays;

import toOffer.Fibonacci;
import toOffer.JumpFloor;
import toOffer.ReorderArray;
import toOffer.ReplaceSpace;

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
		ReorderArray reorderArray = new ReorderArray();
		int [] array = {1,4,2,3,5};
		reorderArray.reOrderArray(array);
		System.out.println(Arrays.toString(array));
	}

}
