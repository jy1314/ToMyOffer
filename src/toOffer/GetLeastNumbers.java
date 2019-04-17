/** 
 * projectName: ToMyOffer 
 * fileName: GetLeastNumbers.java 
 * packageName: toOffer 
 * date: 2019年4月16日下午10:54:30 
 * copyright(c) 2018-2020 bupt
 */


package toOffer;

import java.util.ArrayList;

import util.MaxHeap;
import util.MinHeap;

/**
 * @title:GetLeastNumbers.java
 * @package:toOffer
 * @description:TODO
 * @author:JerryG
 * @date:2019年4月16日下午10:54:30
 * @version:V1.0
 * 
 * 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 * 
 * 思路:
 * 用最大堆保存这k个数，每次只和堆顶比，如果比堆顶小，删除堆顶，新数入堆
 */
public class GetLeastNumbers {
	//思路一
	public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList result = new ArrayList<Integer>();
        if (input.length < k || k == 0) {
            return result;
        }
        //TODO
        
        MaxHeap mHeap = new MaxHeap(k);
        int i = 0;
        for(;i<k;i++) {
        	mHeap.insert(input[i]);
        }
        for(;i<input.length;i++) {
        	if(mHeap.getMax() > input[i]) {
        		mHeap.deleteMax();
        		mHeap.insert(input[i]);
        	}
        }
        while(!mHeap.isEmpty()) {
        	result.add(mHeap.deleteMax());
        }
        
        return result;
	}
	
	
}
