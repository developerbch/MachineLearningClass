
public class MyQueue extends Memory {// ť

	 private int queueIndex;  // ���Լ����� ���� ����
	 
	 public MyQueue() {
	  queueIndex = 0;
	 }

	 public int pop() {
	  int val = arr[queueIndex];// ť�ε����� ����Ͽ� pop�� ���� ������ ��
	  arr[queueIndex++] = 0;// pop�� ��� 0���� �ʱ�ȭ �� ť�ε��� 1����
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