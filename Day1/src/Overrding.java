
public class Overrding {

	private int age;
	
	public Overrding(char a) {
		System.out.println("����Ʈ�������Լ�");
	}
	
	public Overrding(int a) {
		age = a;
		System.out.println("����Ʈ�������Լ�");
	}
	
	public void setAge(int a) {
		age = a;
	}
	public void setAge(char a) {
		age = a;
	}
	
	public int getAge() {
		return age;
	}
	public char getAge() { //����Ÿ���� �����ε��� �Ұ����ϴ�.
		return 'a';
	}
	
	 public static void main(String[] args) {
		 
		 Overrding over = new Overrding();//�������Լ�ȣ��
		 
		 Overrding over1 = new Overrding(25);//�������Լ�ȣ��
	 }
}
