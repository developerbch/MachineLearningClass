import java.util.Scanner;

public class Calculator {
	/*
	 * ��Ģ���� ����
	 * �ݺ����� �Է� ����
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
			num1 = sc.nextInt();					//ù ��° ���� �Է¹���
			System.out.println("�����ڸ� �Է����ּ���");
			operator = sc.next();					//������ �Է� ����
			System.out.println("num2=");
			num2 = sc.nextInt();					//�� ��° ���� �Է¹���
		
			
			
			switch(operator) {
				case "+": System.out.println(num1+num2);
					break;
				case "-": System.out.println(num1-num2);
					break;
				case "*": System.out.println(num1*num2);
					break;
				case "/": System.out.println(num1/num2);
					break;
				default : System.out.println("�߸��Է��ϼ̽��ϴ�.");
				
			}
			System.out.println("�� �Ͻðڽ��ϱ�? �� �Ͻ÷��� y�� Y�� �Է����ּ���. �ƴ϶�� �ƹ� Ű�� �����ּ���.");
			re = sc.next();
		}
		while(re.equals("Y")||re.equals("y"));
		
	}
}
