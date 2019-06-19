/* <class구성요소>
 * field(멤버변수)
 * : 객체생성시 계속해서 사용되어지는 변수
 * : 주로 private으로 지정 (private은 나만 쓸 수 있음 , default는 같은 패키지만, protected는 같은패키지+서브까지)
 * : 외부객체에서 직접적으로 접근할 수 없게 처리
 * : 메소드를 통해 사용할 수 있게 제공
 * 
 *
 * constructor(생성자함수)
 * : 객체 생성 시(new할 시)자동호출되어지는 메소드
 * : 리턴타입이 없다.
 * : 메소드명이 클래스명과 동일하다.
 * : 생산자함수를 임시적으로 제공하지 않을 경우 디폴트생성자함수를 제공한다.
 * : 주목적
 *		1. 디폴트역할 - 객체등록 (생성자 호출이 안되면 절대로 객체가 만들어지지 않는다.)
 * 		2. 사용자역할 - 객체생성시 필드 초기화
 * : Overroding 가능 (똑같은 함수 이름을 여러개 쓸 수 있다.
 * 
 * 
 * 
 * method(함수)
 * : 외부와 내부를 연결 (외부=외부객체, 내부=나자신)
 * : instance method : 객체 생성후에 사용도는 메소드 (객체당 하나넣는 개념)
 * : static method : 객체 무관하게 사용되는 메소드 (같은 타입에서 다 하나로 공유하는 개념)
 * : 오버로딩이 가능
 */
public class ClassExam01 {
	//field변수다.
	private String name;
	private int age;
	
	ClassExam01(){
		//name = "super";
		//age = 12;
		//sex = "men";
	}; // default constructor method
	
	
	//method
	public void setName(String n) {
		name = n;
	}
	public void setAge(int a) {
		age = a;
	} 
	
	//getter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public static void main(String[] args) {
		ClassExam01 cex = new ClassExam01(); //객체생성
		cex.setName("Superman");
		cex.setAge(1000);

		
		System.out.println(cex.getName());
		System.out.println(cex.getAge());
	}
}
