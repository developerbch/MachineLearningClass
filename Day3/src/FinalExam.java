/*
 * final
 * 1. field : ���ȭ, �̸��� ���� �빮�ڷ�ǥ��, �б�����
 * 			: ����� ���ÿ� �ʱ�ȭ
 * 
 * 2. class : ��ӱ���, Has ~ A ����� ��
 * 3. method : �������̵�(�θ�� �ڽ��� �Ȱ��� ���·� �ִ°�)�� ����
 * 
 * 
 * has ~ a : ��ü�� ��ü�� ������ �ִ�.
 * Data class ; �׻� ���������� �����.
 * Data Management class : ���������� ������ �� ����.
 * 
 */


public class FinalExam {
	
	private String name;
	private A data; //has - a
	
	public FinalExam(String name, int data) {
		data = new A(data);
		System.out.println("B");
		this.name = name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setA(int a) {
		data.setA(a);
	
	}
	public int getA() {
		return data.getA();
	}
	
	public final static int MAX=10; //���̳κ����� ����� ���ÿ� �ʱ�ȭ���Ѿ��Ѵ�. //static�� �޸𸮸� �����ϴ� ��� �� �ϳ���.

	
	public static void main(String[] args) {
		
		FinalExam fe = new FinalExam("superman",10);
		fe.setA(10);	
		System.out.println(fe.getA());
		System.out.println(fe.getName());
	}
}
