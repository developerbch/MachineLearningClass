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
		System.out.println("�Է��ϼ���");
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
//		Practice pt = new Practice(); //  Practice�� ��ü�����ߴµ� �� �Ϲ��� pt��.
//		Scanner sc = new Scanner(System.in);
//		System.out.println("���� �Է��ϼ���.");
//		pt.setB(sc.nextInt());
//		System.out.println(pt.getB());
	
	



//	
//	//�ʵ� : ����� ������ �̸��� Ÿ���� ���Ѵ�.
//	protected int a;
//	
//	//������ -> ���� : �ʱ�ȭ
//	Practice(){
//		a=0;
//	}
//	
//	//�޼ҵ� : ���� ����
//	public void abc() {
//		System.out.println(a);
//	}
//	
//	//�޼ҵ� : Ŭ������ �������� �� �ڵ����� ����
	
}
