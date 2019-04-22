/** 
 * projectName: ToMyOffer 
 * fileName: ReverseSentence.java 
 * packageName: toOffer 
 * date: 2019年4月22日下午8:16:26 
 * copyright(c) 2018-2020 bupt
 */


package toOffer;

import java.util.Stack;

/**
 * @title:ReverseSentence.java
 * @package:toOffer
 * @description:TODO
 * @author:JerryG
 * @date:2019年4月22日下午8:16:26
 * @version:V1.0
 * 输入一个英文句子，翻转句子中单词的顺序，但单词内字的顺序不变。为简单起见，标点符号和普通字母一样处理。
 * 例如输入字符串”I am a student. ”，则输出”student. a am I”。
 * 
 * 思路：
 * 可以用栈。用String的split方法分割，顺序入栈，出栈即为所求。
 * 
 */
public class ReverseSentence {
	public String reverseSentence(String str) {
		if(str == null || str.trim().equals("")) return str;
        StringBuilder result = new StringBuilder();
        Stack<String> strstack = new Stack<>();
        for(String temp :str.split(" ")) {
        	strstack.push(temp);
        	strstack.push(" ");
        }
        strstack.pop();
        while(!strstack.isEmpty()) {
        	result.append(strstack.pop());
        }
		return result.toString();
    }
	  
	
	
}
