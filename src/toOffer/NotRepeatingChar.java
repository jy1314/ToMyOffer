/** 
 * projectName: ToMyOffer 
 * fileName: NotRepeatingChar.java 
 * packageName: toOffer 
 * date: 2019年4月19日下午8:42:41 
 * copyright(c) 2018-2020 bupt
 */


package toOffer;

/**
 * @title:NotRepeatingChar.java
 * @package:toOffer
 * @description:TODO
 * @author:JerryG
 * @date:2019年4月19日下午8:42:41
 * @version:V1.0
 * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置, 如果没有则返回 -1（需要区分大小写）.
 * 
 * 思路：
 * 1、遍历比较，复杂度O(n^2);
 * 2、哈希算法
 */
public class NotRepeatingChar {
	public int FirstNotRepeatingChar(String str) {
        int s[] = new int[128];
        for(int i = 0; i<str.length();i++) {
            s[str.charAt(i)]++;
        }
        for(int i = 0 ;i<str.length();i++) {
             if(s[str.charAt(i)]==1) return i;
        }
         
        return -1;
    }
}
