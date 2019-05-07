/** 
 * projectName: ToMyOffer 
 * fileName: MergeSort.java 
 * packageName: sort 
 * date: 2019年5月6日下午5:48:50 
 * copyright(c) 2018-2020 bupt
 */


package sort;

import java.util.LinkedList;

/**
 * @title:MergeSort.java
 * @package:sort
 * @description:TODO
 * @author:JerryG
 * @date:2019年5月6日下午5:48:50
 * @version:V1.0
 * 归并排序
 * 归并（Merge）排序法是将两个（或两个以上）有序表合并成一个新的有序表，
 * 即把待排序序列分为若干个子序列，每个子序列是有序的。然后再把有序子序列合并为整体有序序列。
 */
public class MergeSort {
	public static void mergeSort(int []a) {
		if(a == null || a.length <0) return ;
		merge(a,0,a.length-1);
	}
	private static void merge(int []a,int start, int end) {
		int mid = (start + end) / 2;
		if (start < end) {
	        // 左边
	        merge(a, start, mid);
	        // 右边
	        merge(a, mid + 1, end);
	        // 左右归并
	        sort(a, start, mid, end);
	    }
	}
	private static void sort(int []a, int low,int mid,int high) {
		int[] temp = new int[high - low + 1];
		int i = low;// 左指针
	    int j = mid + 1;// 右指针
	    int k = 0;
	    // 把较小的数先移到新数组中
	    while (i <= mid && j <= high) {
	    	if (a[i] < a[j]) {
	            temp[k++] = a[i++];
	        } else {
	            temp[k++] = a[j++];
	        }
	    }
	    // 把左边剩余的数移入数组
	    while (i <= mid) {
	        temp[k++] = a[i++];
	    }
	    // 把右边边剩余的数移入数组
	    while (j <= high) {
	        temp[k++] = a[j++];
	    }
	    // 把新数组中的数覆盖nums数组
	    for (int k2 = 0; k2 < temp.length; k2++) {
	        a[k2 + low] = temp[k2];
	    }
	    
	}
}
