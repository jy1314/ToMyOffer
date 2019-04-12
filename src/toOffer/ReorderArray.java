/** 
 * projectName: ToMyOffer 
 * fileName: ReorderArray.java 
 * packageName: toOffer 
 * date: 2019年4月11日下午11:13:49 
 * copyright(c) 2018-2020 bupt
 */


package toOffer;

/**
 * @title:ReorderArray.java
 * @package:toOffer
 * @description:TODO
 * @author:JerryG
 * @date:2019年4月11日下午11:13:49
 * @version:V1.0
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位予数组的后半部分。
 * 思路：
 * 我们在扫描这个数组的时候， 如果发现有偶数出现在奇数的前面，我们可以交换它们的顺序，交换之后就符合要求了。
 * 因此我们可以维护两个指针，第一个指针初始化时指向数组的第一个数字，它只向后移动：第二个指针初始化时指向数组的最后一个数字,
 * 它只向前移动。在两个指针相遇之前，第一个指针总是位于第二个指针的前面。如果第一个指针指向的数字是偶数，
 * 并且第二个指针指向的数字是奇数，我们就交换这两个数字。
 */
public class ReorderArray {
	//相对位置会变
	public void reOrderArray(int [] array) {
		if(array == null || array.length <1) return;
		int start = 0;
		int end = array.length-1;
		while(start<end) {
			if(array[start]%2==0) {//前面是偶数
				if(array[end]%2!=0) {//后面是奇数
					int temp = array[start];
					array[start++] = array[end];
					array[end--] = temp;
				}else {
					end--;
				}
			}else {
				start++;
			}
		}
	}
	//相对位置不变
	public void reOrderArray2(int [] array) {
		for(int i=0,k=0;i<array.length-k;i++){
        	if(array[i]%2==0) {//前面是偶数
        		for(int j = i;j<array.length-1;j++) {//冒泡到最后一位
        			int temp = array[j];
        			array[j]=  array[j+1];
        			 array[j+1] = temp;
        		}
        		k++;
                i--;
        	}
        }
	}
	
	
}
