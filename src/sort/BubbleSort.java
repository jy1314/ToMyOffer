/** 
 * projectName: ToMyOffer 
 * fileName: BubbleSort.java 
 * packageName: sort 
 * date: 2019年5月6日下午4:08:11 
 * copyright(c) 2018-2020 bupt
 */


package sort;

/**
 * @title:BubbleSort.java
 * @package:sort
 * @description:TODO
 * @author:JerryG
 * @date:2019年5月6日下午4:08:11
 * @version:V1.0
 * 冒泡排序
 */
public class BubbleSort {
	public static void bubbleSort(int []a) {
		if (a == null || a.length <= 0) {
			return;
		}
	    int size = a.length;
	    boolean flag = true;
		for(int i=0;i<size - 1 && flag;i++) {
			flag = false;
			for(int j = 0 ;j < size - 1 -i; j++) {
				if (a[j] > a[j+1]) // 交换两数位置
	            {
	                int temp = a[j];
	                a[j] = a[j + 1];
	                a[j + 1] = temp;
	                flag = true;//有交换则继续，没有说明已经排序完毕，可以结束
	            }
			}
		}
		
	}

}
