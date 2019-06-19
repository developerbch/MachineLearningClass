import java.util.Scanner;

public class Practice2 {
private int[] a;
	
	Practice2(int size){
		a = new int[size];
	}
	
	
	public void setA(int i, int j) {
	a[i] = j;
	}
	
	public int getA(int i) {
	return	a[i];
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Practice2 pt = new Practice2(3);
		System.out.println("1번칸, 2번칸, 3번칸에 들어갈 숫자를 입력하세용");
		for(int i=0;i<3;i++) {
		pt.setA(sc.nextInt(), sc.nextInt());
		}
		System.out.println("몇번째 칸을 알고 싶나요 ");
		
		System.out.println(pt.getA(sc.nextInt()));
	}
}
