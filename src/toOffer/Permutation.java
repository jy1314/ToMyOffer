/** 
 * projectName: ToMyOffer 
 * fileName: Permutation.java 
 * packageName: toOffer 
 * date: 2019年4月16日下午10:49:41 
 * copyright(c) 2018-2020 bupt
 */


package toOffer;

import java.util.ArrayList;

/**
 * @title:Permutation.java
 * @package:toOffer
 * @description:TODO
 * @author:JerryG
 * @date:2019年4月16日下午10:49:41
 * @version:V1.0
 * 
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。字符只包括大小写字母。
 * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 * 
 * 思路：
 * 一个字符串看成由两部分组成：第一部分为它的第一个字符，第二部分是后面的所有字符。显然可以递归
 * 
 */
public class Permutation {
	ArrayList<String> result;
	public ArrayList<String> PermutationStr(String str) {
		result = new ArrayList<String>();//初始化结果集
		if(str==null||str.length()==0){
            return result;
        }
		permutation(str.toCharArray(), 0);
		return result;
	}
	public void permutation(char []str, int begin) {
		if(str.length - 1 == begin) result.add(new String(str));//只剩一个元素，则结束
		else {
			char tmp;
            // 对当前还未处理的字符串进行处理，每个字符都可以作为当前处理位置的元素
            for (int i = begin; i < str.length; i++) {
                // 下面是交换元素的位置
                tmp = str[begin];
                str[begin] = str[i];
                str[i] = tmp;
                // 处理下一个位置
                permutation(str, begin + 1);
            }
		}
	}
}
