/** 
 * projectName: ToMyOffer 
 * fileName: FindInTwoArrays.java 
 * packageName: ToOffer 
 * date: 2019年4月11日上午11:57:42 
 * copyright(c) 2018-2020 bupt
 */


package toOffer;

/**
 * @title:FindInTwoArrays.java
 * @package:ToOffer
 * @description:TODO
 * @author:JerryG
 * @date:2019年4月11日上午11:57:42
 * @version:V1.0
 * 
 * 题目：在一个二维数组中，每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，
 * 输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * 思路：从左上搜索到右下
 */
public class FindInTwoArrays {
	public boolean Find(int target, int [][] array) {
		if(array==null || array.length<1 ||array[0].length<1) return false;
		for(int i = 0,j=array[0].length-1;i<array.length&&j>=0;) {
			if(array[i][j] == target) return true;
			else if(array[i][j] > target) {
				j--;
			}else {
				i++;
			}
		}
		return false;
    }
}
