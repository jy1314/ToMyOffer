/** 
 * projectName: ToMyOffer 
 * fileName: PrintMatrix.java 
 * packageName: toOffer 
 * date: 2019年4月14日下午2:46:32 
 * copyright(c) 2018-2020 bupt
 */


package toOffer;

import java.util.ArrayList;

/**
 * @title:PrintMatrix.java
 * @package:toOffer
 * @description:TODO
 * @author:JerryG
 * @date:2019年4月14日下午2:46:32
 * @version:V1.0
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次扫印出每一个数字。
 * 
 * 思路：
 * 把打印一圈分为四步：第一步从左到右打印一行，第二步从上到下打印一列，第三步从右到左打印一行，第四步从下到上打印一列。
 * 先算出需要打印多少圈，(n - 1) / 2 + 1圈，n为行列数最小值
 * 
 */
public class PrintMatrix {
	 public ArrayList<Integer> printMatrix(int [][] matrix) {
		 ArrayList<Integer> arrayList = new ArrayList<>();
		 if(matrix == null || matrix.length<1 || matrix[0].length<1) return arrayList;
		 int n = matrix.length;//行数
		 int m = matrix[0].length;//列数
		 int layers = (Math.min(n, m) - 1) / 2 + 1;  //求圈数
		 for (int i = 0; i < layers; i++) {
	            //打印每周
	        	int flag = 0;
	            for (int k = i; k < m - i; k++) {//每圈肯定要有从左到右
	            	arrayList.add(matrix[i][k]);  
	            }
	            for (int j = i + 1; j < n - i; j++) {//从右上到右下
	            	arrayList.add(matrix[j][m - i - 1]);  
	            }
	            for (int k = m - i - 2; (k >= i) && (n - i - 1 != i); k--) {
	            	arrayList.add(matrix[n - i - 1][k]);   //从右到左
	                flag = 1;//如果有从右到左，则必定大于1行，肯定有从左下到左上，否则没有
	            }
	            for (int j = n - i - 2; flag == 1 && (j > i) && (m - i - 1 != i); j--) {
	            	arrayList.add(matrix[j][i]);  //从左下到左上
	            }
	     }
		 return arrayList;
	 }
}
