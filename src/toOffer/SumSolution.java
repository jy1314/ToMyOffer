/** 
 * projectName: ToMyOffer 
 * fileName: SumSolution.java 
 * packageName: toOffer 
 * date: 2019年5月5日下午11:24:31 
 * copyright(c) 2018-2020 bupt
 */


package toOffer;

/**
 * @title:SumSolution.java
 * @package:toOffer
 * @description:TODO
 * @author:JerryG
 * @date:2019年5月5日下午11:24:31
 * @version:V1.0
 * 求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 */
public class SumSolution {

	public int Sum_Solution(int n) {
		int sum = n;
        boolean ans = (n>0)&&((sum+=Sum_Solution(n-1))>0);
        return sum;
    }
}
