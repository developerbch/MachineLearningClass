/*
 * 인터페이스
 * 1. 상수 + 추상메소드로 구성됨 (상수하면 final이 생각나야한다.)
 * 인터페이스는 extends로 상속을 받을 수 있다.
 * 즉, 같은 것끼리는 extends를 쓴다고 생각해라. (클래스에서 인퍼테이스를 받을 때는 implements, 클래스에서 클래스는 extends, 인퍼테이스에서 인터페이스는 extends)
 * 인터페이스는 다중사옥을 허용한다. 왜냐하면 내용이 없으니까 복잡할 일이 없잖아! (클래스는 다중상속을 못받으나인터페이스는 받을 수 있음)
 * 인터페이스도 동적 바인딩이 가능하다. 
 * 
 * 쓰레드 : 플로세스 안에 있는 작은 프로세스
 * 
 * 
 * 
 */
public interface Area {

	final static int MAX = 100; // final 붙이면 static도 같이 쓰라고 했다. 인터페이스에서는 final 이랑 static은 안써도 자동으로 붙는다.
	
	public abstract void disp(); //abstract를 안써도 자동적으로 추상메소드라고 인식한다.

	void disp1();
}
