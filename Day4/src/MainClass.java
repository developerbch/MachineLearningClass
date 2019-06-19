import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  Memory mem;// 부모 레퍼런스
		  MyStack ms = new MyStack();// 스택 객체 생성
		  MyQueue mq = new MyQueue();// 큐 객체 생성
		  
		  do {
		   System.out.println("1. Stack\t2. Queue");// 스택 큐 선택
		   int w = sc.nextInt();
		   if(w == 1) mem = ms;// 선택에 따라 부모 레퍼런스로 접근
		   else mem = mq;
		   
		   while(true) {
		    System.out.println("1. push\t2. pop\t3. break");// 처리할 동작 선택
		    w = sc.nextInt();
		    if(w == 1) {
		    	mem.push(sc.nextInt());
		    	}// 동작에 따른 처리
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



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
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


