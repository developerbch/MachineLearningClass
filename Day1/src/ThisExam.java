/*
 * this, this() // �𽺿� ��ȣ��
 * 1. this�� �ڱ��ڽ��� ������ �� �ְ� ���ִ� ��ü���۷���������.
 * 2. �ν��Ͻ��޼ҵ��� ù ��° �Ű������� �׻� �����ϰ� �ִ�.
 * 	     ��, ���� ���� ���� ��븸 ���� 
 * 
 * 
 * this()
 * 1. �ڱ��ڽ� �����ڿ��� �Ǵٸ� �ڱ��ڽ� �����ڸ� ȣ��
 */
public class ThisExam {
	private int age;
	
//	void setAge(int age) {	 // void setAge(ThisExam this, int a)
//		this.age = age; 		//�̸��� �Ȱ��� ��� ���������� ���� ���⶧���� this. �� �ٿ������ν� �ʵ庯���� �������ִ°��� / �Ⱥ��̸� �ν� ����
//	}
//	int getAge() {			 	// int getAge(ThisExam this)
//		return age; 			//this.age�� ���൵ �Ǵµ� ���� �Ⱥٿ��� �ȴ�.
//	}
//	
	
	public static void main(String[] args) {
		ThisExam te = new ThisExam();
		
		te.setAge(10);		 				//te.setAge(te,10)
		System.out.println(te.getAge());	 // te.getAge(te)
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	public ThisExam getObject() {
		return this;				//static�޼ҵ忡�� this�� ����. �׻� instance�޼ҵ忡���� this�� �� �� �ִ�.
	}
}




public class ThisExam{
	private int a;
	private int b;
	
	public static void main(String[] args) {
		ThisExam te1 = new ThisExam(); //0,0
		ThisExam te2 = new ThisExam(10); //10,0
		ThisExam te3 = new ThisExam(20,30); //20,30
		
		syso
	}
}