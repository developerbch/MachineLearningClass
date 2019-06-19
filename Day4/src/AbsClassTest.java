/*
 * 추상클래스
 * 1. 오직 상속을 목적으로만 사용할 수 없다.
 * 2. 객체를 만들 수 없다.
 * 3. 추상메소드를 하나 이상 가지고 있는 클래스
 * 4. 추상메소드는 바디가 없는 메소드 // public void intput(){}
 * 5. 추상메소드는 강제성을 부여하고, 상속개념적으로 부모가 가지고 있어야 하는데 정의를 할 수 없을 경우 사용한다.
 * 6. 서브클래스는 추삼메소드를 꼭 어비라이드를 해야한다.
 * 		하지 않을 경우 추상클래스화 되서 객체를 생성할 수 없다. 
 */
public abstract class AbsClassTest {

	
	public abstract void disp();
	
		
		
		
		
	
	
	public static void main(String[] args) {
		
	}
}
