import java.util.Scanner;

public class Calc {
	
	private double num1;		//ù ��° ����	//�ʵ�� ���ȼ��� �־���Ѵ�. �׷��� ���� �ʵ带 ������ �� �տ� private�� �ִ´�.
	private double num2;		//�� ��° ����
	private String cal;		//������
	private String re;		//�簡������
	
	
	public void setNum1(int a) { 		//Num1�� ���� set�� �����Ѵ�.
		num1 = a;
	} 
	public double getNum1() {				//Num1�� ���� get�� �����Ѵ�.
		return num1;
	}
	
	
	public void setNum2(int a) {		//Num2�� ���� set�� �����Ѵ�.
		num2 = a;
	} 
	public double getNum2() {				//Num2�� ���� get�� �����Ѵ�.
		return num2;
	}
	
	
	public void setCal(String a) {		//cal�� ���� set�� �����Ѵ�.
		cal = a;
	} 
	public String getCal() {			//cal�� ���� get�� �����Ѵ�.
		return cal;
	}
	
	
	public void setRe(String a) {		//re�� ���� set�� �����Ѵ�.
		re = a;
	} 
	public String getRe() {				//re�� ���� get�� �����Ѵ�.
		return re;
	}
	
	
	
	
	public static void main(String[] args) {
		Calc ca = new Calc();
		Scanner sc = new Scanner(System.in); //Scanner ����
		
		do {
			System.out.println("ù ��° ���ڸ� �Է����ּ���");
			ca.setNum1(sc.nextInt());
			System.out.println("�����ڸ� �Է��ϼ���");
			ca.setCal(sc.next());
			System.out.println("�� ��° ���ڸ� �Է����ּ���");
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
				default : System.out.println("�߸��� �������Դϴ�. �ٽ� �Է��ϼ���.");
					continue;	//default�� ��쿡(�߸��� �����ڸ� �Է����� ���)do�� �ٽõ��ư�
			}
			System.out.println("�ٽ� ����Ͻðڽ��ϱ�? Y or N");
			ca.setRe(sc.next());
		}while(ca.getRe().equals("Y")); 
	}
}
