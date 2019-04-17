/** 
 * projectName: ToMyOffer 
 * fileName: MinHeap.java 
 * packageName: util 
 * date: 2019年4月17日下午1:07:23 
 * copyright(c) 2018-2020 bupt
 */


package util;

/**
 * @title:MinHeap.java
 * @package:util
 * @description:最小堆
 * @author:JerryG
 * @date:2019年4月17日下午1:07:23
 * @version:V1.0
 */
public class MinHeap {
	private int data[];     //存放堆数据的数组
    private int size;       //当前堆的大小
    private int capacity;   //堆的最大容量
	/**   
	 * @title: MinHeap   
	 * @description: 构造函数  
	 * @param: @param capacity  
	 * @throws:   
	 */
	public MinHeap(int capacity) {
		data = new int[capacity + 1];//数组索引为0的位置不放元素
		this.size = 0;
		this.capacity = capacity;
	}
	public boolean insert(int d){
		if(size == capacity) return false;
		size ++;
		data[size] = d;
		//插入在最后的元素上移方法
		shiftUp(size);
		return true;
	}
	//堆插入元素时的元素上移
    private void shiftUp(int i) {
        //数组可能越界问题始终不能忽视
        //当此元素比父元素小时，交换这两个元素位置
        while(i > 1 && data[i] < data[i/2]){
            int t = data[i];
            data[i] = data[i/2];
            data[i/2] = t;
            i /= 2;
        }
    }
    //删除堆顶最小元素
    public int deleteMin(){
        if(size == 0){
            return -1;
        }
        int t = data[1];
        //将最后一个元素放到第一个元素位置
        data[1] = data[size];
        size--;
        //然后将第一个元素下移到适当位置
        shiftDown(1);
        return t;
    }
  //堆删除元素时的元素下移
    private void shiftDown(int i) {
        // TODO Auto-generated method stub
        while(2*i <= size){
            // 将要将data[i]与data[j]交换
            int j = 2*i;
            // 让j指向他的孩子结点中的大的那一个
            if(j+1 <= size && data[j] > data[j+1]){
                j += 1;
            }
            if(data[i] < data[j])
                break;
            //元素下移
            int t = data[i];
            data[i] = data[j];
            data[j] = t;
            i = j;
        }
    }
    //取得堆顶最小元素
    public int getMin() {
		return data[1];
	}
    //判断是否为空
	public boolean isEmpty() {
		if(size == 0) return true;
		else return false;
	}
    
	
}
