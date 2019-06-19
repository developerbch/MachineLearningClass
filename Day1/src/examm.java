import java.util.Scanner;

public class examm {

	public static void main(String[] args) {
		
		Scanner sc;
		sc = new Scanner(System.in);
			
		int num = 0;
		
		System.out.println("num 입력 :");
		num = sc.nextInt();
		
		System.out.println("이름입력 :");
		String name = sc.next();
		
		System.out.println("num ="+num);
		System.out.println("name =" +name);
	}
}
