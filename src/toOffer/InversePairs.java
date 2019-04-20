/** 
 * projectName: ToMyOffer 
 * fileName: InversePairs.java 
 * packageName: toOffer 
 * date: 2019年4月19日下午8:45:19 
 * copyright(c) 2018-2020 bupt
 */


package toOffer;

/**
 * @title:InversePairs.java
 * @package:toOffer
 * @description:TODO
 * @author:JerryG
 * @date:2019年4月19日下午8:45:19
 * @version:V1.0
 * 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
 * 输入一个数组,求出这个数组中的逆序对的总数P。并将P对1000000007取模的结果输出。 即输出P%1000000007
 * 
 * 思路：
 * 归并排序
 */
public class InversePairs {
	public int InversePairs(int [] array) {
        int len = array.length;
        if(array== null || len <= 0){
            return 0;
        }
        return mergeSort(array, 0, len-1);
    }
	
	
	public int mergeSort(int [] array, int start, int end){
        if(start == end)
            return 0;
        int mid = (start + end) / 2;
        int left_count = mergeSort(array, start, mid);
        int right_count = mergeSort(array, mid + 1, end);//把数据分成前后两个数组(递归分到每个数组仅有一个数据项)
        int i = mid;//前一个数组的最后一个下标
        int j = end;//后一个数组的下标
        int [] copy = new int[end - start + 1];//拷贝数组
        int copy_index = end - start;//拷贝数组长度
        int count = 0;//记录逆序对数量
        while(i >= start && j >= mid + 1){
            if(array[i] > array[j]){//前面的数组值array[i]大于后面数组值array[j]时；
            	//则前面数组array[i]~array[mid]都是大于array[j]的，count += mid+1 - i
                copy[copy_index--] = array[i--];
                //count += j - mid;
                count ++;
                if(count > 1000000007){
                    count %= 1000000007;
                }
            }else{
                copy[copy_index--] = array[j--];
            }
        }
        while(i >= start){
            copy[copy_index--] = array[i--];
        }
        while(j >= mid + 1){
            copy[copy_index--] = array[j--];
        }
        i = 0;
        while(start <= end) {
            array[start++] = copy[i++];
        }
        return (left_count+right_count+count)%1000000007;
    }
}
