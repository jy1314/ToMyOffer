/** 
 * projectName: ToMyOffer 
 * fileName: NumberOf1Between1AndN.java 
 * packageName: toOffer 
 * date: 2019年4月17日下午2:21:46 
 * copyright(c) 2018-2020 bupt
 */


package toOffer;

/**
 * @title:NumberOf1Between1AndN.java
 * @package:toOffer
 * @description:TODO
 * @author:JerryG
 * @date:2019年4月17日下午2:21:46
 * @version:V1.0
 * 输入一个整数n，求从1 到n这n个整数的十进制表示中1 出现的次数。
 * 
 * 思路：
 * 从个位开始看起，0～9中1会出现1次，那么每隔10个位上的1会出现一次，即n/10*1次，不足10的部分如果>1则会出现一次1，否则不会出现,即（n%10>1 ? 1 : 0）
 * 因此个位上1出现的个数为：n/10 * 1+(n%10 > 1 ? 1 : 0)
 * 同理，看十位。十位上10～19中会出现10次1，20～99中10位上没有1。即每隔100有10个1，共有(n / 100) * 10个。
 * 不足100的部分如果<10则没有1，>19则有10个1，在10～19之间，有（n % 100）-9个1.
 * 十位上1出现的个数为(n / 100) * 10 + (if(n % 100 > 19) 10 else if(n % 100 < 10) 0 else n % 100 - 10 + 1)
 * 同理归纳百位千位，最终可得通用公式：
 * 关于d位有：n/(10^d)*(10^(d-1)) +Min( Max{ n%(10^d)-10^(d-1), 0}, 10^(d-1) )
 * 化简得第i位的1的数量为：diviver = i * 10;count += (n / diviver) * i + Math.min(Math.max(n % diviver - i + 1, 0), i);
 */
public class NumberOf1Between1AndN {
	public static int numberOf1Between1AndN(int n) {
        if (n <= 0) {
            return 0;
        }
        int count = 0;
        for(long i = 1; i <= n; i *= 10){
            long diviver = i * 10;
            count += (n / diviver) * i + Math.min(Math.max(n % diviver - i + 1, 0), i);
        }
        return count;
	}
}
