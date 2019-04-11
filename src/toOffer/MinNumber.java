/** 
 * projectName: ToMyOffer 
 * fileName: MinNumber.java 
 * packageName: toOffer 
 * date: 2019年4月11日下午5:41:26 
 * copyright(c) 2018-2020 bupt
 */


package toOffer;

/**
 * @title:MinNumber.java
 * @package:toOffer
 * @description:TODO
 * @author:JerryG
 * @date:2019年4月11日下午5:41:26
 * @version:V1.0
 * 把一个数组最开始的若干个元素搬到数组的末尾， 我们称之数组的旋转。输入一个递增排序的数组的一个旋转，
 *  输出旋转数组的最小元素。例如数组{3,4,5,1,2 ｝为｛ 1,2,3,4,5}的一个旋转，该数组的最小值为1。
 *  
 *  思路：最简单的当然是遍历，不过没啥用，可以比较相邻两个，前比后大即找到最小元素，但还是不是最优
 *  	 最优的思路是二分法查找。
 */
public class MinNumber {
	//比较前后两个元素
	public int minNumberInRotateArray1(int [] array,int start ,int end) {
        if(array.length<1) return 0;
        for(int i = start; i<end; i++){
            if(array[i]>array[i+1]){
                return array[i+1];
            }
        }
        return 0;
    }
	//二分法
	public int minNumberInRotateArray2(int [] array) {
		if (array == null || array.length == 0) {  
            return 0;
        } 
		int before = 0;//首
		int after = array.length-1;//尾
		int mid = 0 ;//中间
		//保证前大于后，即before和after在不同区域
		while(array[before]>=array[after]) {
			mid = before+(after-before)/2;//更新中点
			if(before == after - 1) {//如果相差为1，则array[after]即为最小值
				return array[after];
			}
			if(array[before]==array[after] &&array[before] ==array[mid]) 
				return minNumberInRotateArray1(array,before,after);
			if(array[mid] >= array[before]) {//如果中点大于等于前点，则说明中点在前半区
				before = mid;//更新前点
			}
			if(array[mid] <= array[after]) {//如果中点小于等于后点，则说明中点在后半区
				after = mid;//更新后点
			}
			
		}
		return array[mid];
    }
}
