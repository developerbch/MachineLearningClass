import java.util.Scanner;

public class Calc {
	
	private double num1;		//첫 번째 숫자	//필드는 보안성이 있어야한다. 그래서 보통 필드를 생성할 때 앞에 private을 넣는다.
	private double num2;		//두 번째 숫자
	private String cal;		//연산자
	private String re;		//재가동여부
	
	
	public void setNum1(int a) { 		//Num1에 대한 set을 지정한다.
		num1 = a;
	} 
	public double getNum1() {				//Num1에 대한 get을 지정한다.
		return num1;
	}
	
	
	public void setNum2(int a) {		//Num2에 대한 set을 지정한다.
		num2 = a;
	} 
	public double getNum2() {				//Num2에 대한 get을 지정한다.
		return num2;
	}
	
	
	public void setCal(String a) {		//cal에 대한 set을 지정한다.
		cal = a;
	} 
	public String getCal() {			//cal에 대한 get을 지정한다.
		return cal;
	}
	
	
	public void setRe(String a) {		//re에 대한 set을 지정한다.
		re = a;
	} 
	public String getRe() {				//re에 대한 get을 지정한다.
		return re;
	}
	
	
	
	
	public static void main(String[] args) {
		Calc ca = new Calc();
		Scanner sc = new Scanner(System.in); //Scanner 생성
		
		do {
			System.out.println("첫 번째 숫자를 입력해주세요");
			ca.setNum1(sc.nextInt());
			System.out.println("연산자를 입력하세요");
			ca.setCal(sc.next());
			System.out.println("두 번째 숫자를 입력해주세요");
			ca.setNum2(sc.nextInt());
			
			switch(ca.getCal()) {
				case "+" : 
					System.out.println(ca.getNum1()+ca.getNum2());
					break;
				case "-" : 
					System.out.println(ca.getNum1()-ca.getNum2());
					break;
				case "*" : 
					System.out.println(ca.getNum1()*ca.getNum2());
					break;
				case "/" : 
					System.out.println(ca.getNum1()/ca.getNum2());
					break;
				default : System.out.println("잘못된 연산자입니다. 다시 입력하세요.");
					continue;	//default일 경우에(잘못된 연산자를 입력했을 경우)do로 다시돌아감
			}
			System.out.println("다시 계산하시겠습니까? Y or N");
			ca.setRe(sc.next());
		}while(ca.getRe().equals("Y")); 
	}
}
