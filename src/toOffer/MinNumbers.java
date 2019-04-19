/** 
 * projectName: ToMyOffer 
 * fileName: MinNumbers.java 
 * packageName: toOffer 
 * date: 2019年4月19日上午11:27:50 
 * copyright(c) 2018-2020 bupt
 */


package toOffer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @title:MinNumbers.java
 * @package:toOffer
 * @description:TODO
 * @author:JerryG
 * @date:2019年4月19日上午11:27:50
 * @version:V1.0
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 * 例子说明：
 * 例如输入数组{3， 32, 321}，则扫描输出这3 个数字能排成的最小数字321323。
 * 
 * 思路：
 * 根据题目的要求，两个数字m 和n能拼接成数字m和m。如果mn < nm，也就是m 应该排在n 的前面，我们定义此时m 小于n；
 * 反之，如果nm < mn，我们定义n小于m。
 */
public class MinNumbers {
	public String PrintMinNumber(int [] numbers) {
		if(numbers == null || numbers.length< 1 )
			return null;
		int len = numbers.length;
        StringBuffer str = new StringBuffer();
        ArrayList<Integer> list= new ArrayList<Integer>();
  	  	for(int i=0;i<len;i++){
  	  		list.add(numbers[i]);
  	  	}
  	  	Collections.sort(list, new Comparator<Integer>() {//用比较器进行排序
  	  		public int compare(Integer str1,Integer str2){
  	  			String s1=str1+""+str2;
  	  			String s2=str2+""+str1;
  	  	        return s1.compareTo(s2);//比较两个
  	  		}
		});
  	  	for(int j:list){//按顺序拼接成字符串
  	  		str.append(j);
  		}
		return str.toString();
	}
}
