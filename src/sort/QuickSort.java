/** 
 * projectName: ToMyOffer 
 * fileName: QuickSort.java 
 * packageName: sort 
 * date: 2019年5月6日下午3:33:15 
 * copyright(c) 2018-2020 bupt
 */


package sort;

/**
 * @title:QuickSort.java
 * @package:sort
 * @description:TODO
 * @author:JerryG
 * @date:2019年5月6日下午3:33:15
 * @version:V1.0
 * 快速排序
 * 
 * 思想：通过一趟排序将待排记录分隔成独立的两部分，其中一部分记录的关键字均比另一部分的关键字小，则可分别对这两部分记录继续进行排序，以达到整个序列有序。
 */
public class QuickSort {
	public static void quicksort(int []a) {
		if(a.length <= 0) {
			return ;
		}
		quickSort(a, 0, a.length-1);
	}
	private static void quickSort(int []a, int start, int end) {
		if(start>=end) return;
		int mid = getMid(a, start, end);//将数组进行一分为二
		quickSort(a, start, mid-1);
		quickSort(a, mid+1, end);
		
		
	}
	private static int getMid(int a[],int start ,int end) {
		int temp = a[start];
		while(start<end) {
			while(start<end && a[end] > temp) {
				end--;
			}
			a[start] = a[end];
			while(start<end && a[start] <temp) {
				start++;
			}
			a[end] = a[start];
		}
		a[start] = temp;
		return start;
		
	}

}
