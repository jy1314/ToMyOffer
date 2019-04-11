/** 
 * projectName: ToMyOffer 
 * fileName: ReplaceSpace.java 
 * packageName: ToOffer 
 * date: 2019年4月11日下午12:04:07 
 * copyright(c) 2018-2020 bupt
 */


package toOffer;

/**
 * @title:ReplaceSpace.java
 * @package:ToOffer
 * @description:TODO
 * @author:JerryG
 * @date:2019年4月11日下午12:04:07
 * @version:V1.0
 * 
 * 题目：请实现一个函数，把字符串中的每个空格替换成"%20"，例如“We are happy.”，则输出“We%20are%20happy.”。
 */
public class ReplaceSpace {
	public String replaceSpace(String str) {
		StringBuffer stringBuffer = new StringBuffer();
		for(int i =0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				stringBuffer.append("%20");
			}else {
				stringBuffer.append(str.charAt(i));
			}
		}
    	return stringBuffer.toString();
    }

}
