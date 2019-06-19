import java.util.Scanner;

public class Practice {
	
	private int[] a;
	
	Practice(int size){
		a = new int[size];
	}
	
	
	public void setA(int i, int j) {
	a[i] = j;
	}
	
	public int getA(int index) {
	return	a[index];
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Practice pt = new Practice(3);
		System.out.println("입력하세용");
		pt.setA(sc.nextInt(), sc.nextInt());
		
	}
	
}
//	//field
//	private int b;
//	private String c;
//	
//	
//	
//	//constructor
//	Practice(){
//		b=0;
//		c=null;
//	}
//	
//	public void setB(int j) {
//		b=j;
//	}
//	
//	public int getB() {
//		return b;
//	}
//	
//	
//	public static void main(String[] args) {
//		Practice pt = new Practice(); //  Practice의 객체생성했는데 그 일므이 pt다.
//		Scanner sc = new Scanner(System.in);
//		System.out.println("값을 입력하세요.");
//		pt.setB(sc.nextInt());
//		System.out.println(pt.getB());
	
	



//	
//	//필드 : 사용할 변수의 이름과 타입을 정한다.
//	protected int a;
//	
//	//생성자 -> 목적 : 초기화
//	Practice(){
//		a=0;
//	}
//	
//	//메소드 : 실제 동작
//	public void abc() {
//		System.out.println(a);
//	}
//	
//	//메소드 : 클래스를 가져왔을 때 자동으로 실행
	
}
