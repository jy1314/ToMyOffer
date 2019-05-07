/** 
 * projectName: ToMyOffer 
 * fileName: HeapSort.java 
 * packageName: sort 
 * date: 2019年5月6日下午4:20:17 
 * copyright(c) 2018-2020 bupt
 */


package sort;

/**
 * @title:HeapSort.java
 * @package:sort
 * @description:TODO
 * @author:JerryG
 * @date:2019年5月6日下午4:20:17
 * @version:V1.0
 * 堆排序
 */
public class HeapSort {
	public static void heapSort(int [] a) {
		int length = a.length;
		for(int i = 0; i < length - 1; i++) {
			//建堆
			buildHeap(a,length-1-i);
			// 交换堆顶和最后一个元素
			swap(a, 0, length - 1 - i);
		}
	}
	private static void buildHeap(int []a, int lastIndex) {
		for(int i = (lastIndex-1)/2; i >= 0; i--) {
			int k = i;
			while(k*2 + 1 <= lastIndex) {
				int biggerIndex = k*2 + 1;
				// 如果biggerIndex小于lastIndex，即biggerIndex+1代表的k节点的右子节点存在
	            if (biggerIndex < lastIndex) {
	            	// 如果右子节点的值较大
	                if (a[biggerIndex] < a[biggerIndex + 1]) {
	                    // biggerIndex总是记录较大子节点的索引
	                    biggerIndex++;
	                }
	            }
	            // 如果k节点的值小于其较大的子节点的值
	            if (a[k] < a[biggerIndex]) {
	                // 交换他们
	                swap(a, k, biggerIndex);
	                // 将biggerIndex赋予k，开始while循环的下一次循环，重新保证k节点的值大于其左右子节点的值
	                k = biggerIndex;
	            } else {
	                break;
	            }
			}
		}
	}
	// 交换i和j节点
	private static void swap(int[] data, int i, int j) {
	    int tmp = data[i];
	    data[i] = data[j];
	    data[j] = tmp;
	}
}
