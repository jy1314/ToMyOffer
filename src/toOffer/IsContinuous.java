/** 
 * projectName: ToMyOffer 
 * fileName: IsContinuous.java 
 * packageName: toOffer 
 * date: 2019年5月5日下午9:37:04 
 * copyright(c) 2018-2020 bupt
 */


package toOffer;

import java.util.Arrays;

/**
 * @title:IsContinuous.java
 * @package:toOffer
 * @description:TODO
 * @author:JerryG
 * @date:2019年5月5日下午9:37:04
 * @version:V1.0
 * 从扑克牌中随机抽5张牌，判断是不是一个顺子， 即这5张牌是不是连续的。2～10为数字本身， A为1。 J为11、Q为12、 为13。大小王可以代替任何牌。
 * 扑克有54张，其中两张大王两张小王。
 */
public class IsContinuous {
	public boolean isContinuous(int [] numbers) {
		if(numbers == null || numbers.length != 5) return false;
		Arrays.sort(numbers);//先排序
		if(numbers[4] == 0) return false;//最多两张大王两张小王
		int i = 0;
		while(numbers[i] == 0) {//统计大小王数量
			i++;	
		}
		int count = i;
		while(i<4) {
			if(numbers[i + 1] == numbers[i]) return false;//有对子肯定不能成顺子
			count = count - (numbers[i + 1] - numbers[i] - 1);
			i++;
			if(count<0) return false;//超过大小王能补偿的数量，则肯定不能成顺子
			
		}
		return true;
	}
}
