/** 
 * projectName: ToMyOffer 
 * fileName: LeftRotateString.java 
 * packageName: toOffer 
 * date: 2019年5月5日下午9:03:07 
 * copyright(c) 2018-2020 bupt
 */


package toOffer;

/**
 * @title:LeftRotateString.java
 * @package:toOffer
 * @description:TODO
 * @author:JerryG
 * @date:2019年5月5日下午9:03:07
 * @version:V1.0
 * 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。例如：
 * 输入字符串”abcdefg”和数字2，该函数将返回左旋转2 位得到的结”cdefgab”。
 * 
 * 思路：将原字符串分成两部分，分别反转，之后再整体反转。
 * 
 */
public class LeftRotateString {
	/**   
	 * @title: LeftRotateString   
	 * @description: TODO  
	 * @param:   
	 * @throws:   
	 */
	public LeftRotateString() {
		// TODO Auto-generated constructor stub
	}
	public String leftRotateString(String str,int n) {
        if (str == null || n < 0 || n > str.length()) {
            return str;
        }
        char []arr = str.toCharArray();
        rotateString(arr, 0, n-1);
        rotateString(arr, n, str.length()-1);
        rotateString(arr, 0, str.length()-1);
        return new String(arr);
    }
	public void rotateString(char []data,int start,int end) {
		if (data == null || data.length < 1 || start < 0 || end > data.length || start > end) {
	        return;
	    }
	    while (start < end) {
	        char tmp = data[start];
	        data[start] = data[end];
	        data[end] = tmp;

	        start++;
	        end--;
	    }
	}
	
}
