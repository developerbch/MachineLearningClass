
public class MyQueue extends Memory {// 큐

	 private int queueIndex;  // 선입선출을 위한 변수
	 
	 public MyQueue() {
	  queueIndex = 0;
	 }

	 public int pop() {
	  int val = arr[queueIndex];// 큐인덱스를 사용하여 pop할 값을 변수에 저
	  arr[queueIndex++] = 0;// pop한 요소 0으로 초기화 후 큐인덱스 1증가
	  return val;       // pop
	}
}


//
//private int front;
//
//public MyQueue() {
//	front = 0;
//}
//
//public int pop() {
//	return arr[front++];