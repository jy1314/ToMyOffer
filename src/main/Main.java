/** 
 * projectName: ToMyOffer 
 * fileName: Main.java 
 * packageName: main 
 * date: 2019年4月11日上午11:56:24 
 * copyright(c) 2018-2020 bupt
 */


package main;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import sort.HeapSort;
import sort.MergeSort;
import sort.QuickSort;
import toOffer.Fibonacci;
import toOffer.FindContinuousSequence;
import toOffer.FindNumbersWithSum;
import toOffer.GetLeastNumbers;
import toOffer.InversePairs;
import toOffer.IsContinuous;
import toOffer.IsPopOrder;
import toOffer.JumpFloor;
import toOffer.LastRemaining;
import toOffer.LeftRotateString;
import toOffer.MaxSumOfSubArray;
import toOffer.MinNumbers;
import toOffer.MoreThanHalfNum;
import toOffer.NumberOf1Between1AndN;
import toOffer.Permutation;
import toOffer.ReorderArray;
import toOffer.ReplaceSpace;
import toOffer.ReverseSentence;
import toOffer.VerifySquenceOfBST;
import util.MaxHeap;
import util.MinHeap;

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
	 * 1100100
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,4,3,5,2,8,6,9,7,0,0};
		printnums(a);
		MergeSort.mergeSort(a);
		printnums(a);
		
	}
	public static void printnums(int []nums) {
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println("");
	}
	
	
}
