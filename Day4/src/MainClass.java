import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  Memory mem;// �θ� ���۷���
		  MyStack ms = new MyStack();// ���� ��ü ����
		  MyQueue mq = new MyQueue();// ť ��ü ����
		  
		  do {
		   System.out.println("1. Stack\t2. Queue");// ���� ť ����
		   int w = sc.nextInt();
		   if(w == 1) mem = ms;// ���ÿ� ���� �θ� ���۷����� ����
		   else mem = mq;
		   
		   while(true) {
		    System.out.println("1. push\t2. pop\t3. break");// ó���� ���� ����
		    w = sc.nextInt();
		    if(w == 1) {
		    	mem.push(sc.nextInt());
		    	}// ���ۿ� ���� ó��
		    if(w == 2) {
		    	System.out.println(mem.pop());
		    }if(w!=1 & w!=2) {
		    	break;
		    }
		   }// end while
		   System.out.println("'y' to continue");
		  } while(sc.next().equals("y"));
		 }
	}



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
//	public static void main(String[] args) {
//		
//		MyStack ms = new MyStack();
//		
//		ms.push(10);
//		ms.push(20);
//		ms.push(30);;
//		
//		System.out.println(ms.pop());
//		System.out.println(ms.pop());
//		System.out.println(ms.pop());
//
//		
//		
//		MyQueue mq = new MyQueue();
//		
//		mq.push(10);
//		mq.push(20);
//		mq.push(30);;
//		
//		System.out.println(mq.pop());
//		System.out.println(mq.pop());
//		System.out.println(mq.pop());


