/*
 * final
 * 1. field : 상수화, 이름을 전부 대문자로표현, 읽기전용
 * 			: 선언과 동시에 초기화
 * 
 * 2. class : 상속금지, Has ~ A 관계로 씀
 * 3. method : 오버라이딩(부모와 자식이 똑같은 상태로 있는것)을 금지
 * 
 * 
 * has ~ a : 객체가 객체를 가지고 있다.
 * Data class ; 항상 독립적으로 만든다.
 * Data Management class : 독립적으로 존재할 수 없다.
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
	
	public final static int MAX=10; //파이널변수는 선언과 동시에 초기화시켜야한다. //static은 메모리를 절약하는 방법 중 하나다.

	
	public static void main(String[] args) {
		
		FinalExam fe = new FinalExam("superman",10);
		fe.setA(10);	
		System.out.println(fe.getA());
		System.out.println(fe.getName());
	}
}
