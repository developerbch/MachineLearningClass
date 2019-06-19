import java.util.Scanner;

public class Calculator {
	/*
	 * 사칙연산 계산기
	 * 반복할지 입력 받음
	 * 
	 * */
	public static void main(String[] args) {
		
		Scanner sc; 
		sc = new Scanner(System.in); //
	
		String operator;
		int num1;
		int num2;
		String re;
		
		
		
		do {
			System.out.println("num1=");
			num1 = sc.nextInt();					//첫 번째 정수 입력받음
			System.out.println("연산자를 입력해주세요");
			operator = sc.next();					//연산자 입력 받음
			System.out.println("num2=");
			num2 = sc.nextInt();					//두 번째 정수 입력받음
		
			
			
			switch(operator) {
				case "+": System.out.println(num1+num2);
					break;
				case "-": System.out.println(num1-num2);
					break;
				case "*": System.out.println(num1*num2);
					break;
				case "/": System.out.println(num1/num2);
					break;
				default : System.out.println("잘못입력하셨습니다.");
				
			}
			System.out.println("더 하시겠습니까? 더 하시려면 y나 Y를 입력해주세요. 아니라면 아무 키나 눌러주세요.");
			re = sc.next();
		}
		while(re.equals("Y")||re.equals("y"));
		
	}
}
