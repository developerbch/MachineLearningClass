/*
 * this, this() // 디스와 디스호출
 * 1. this는 자기자신을 접근할 수 있게 해주는 객체레퍼런스변수다.
 * 2. 인스턴스메소드의 첫 번째 매개변수로 항상 존재하고 있다.
 * 	     즉, 만들 수는 없고 사용만 가능 
 * 
 * 
 * this()
 * 1. 자기자신 생성자에서 또다른 자기자신 생성자를 호출
 */
public class ThisExam {
	private int age;
	
//	void setAge(int age) {	 // void setAge(ThisExam this, int a)
//		this.age = age; 		//이름이 똑같은 경우 지역변수를 먼저 쓰기때문에 this. 을 붙여줌으로써 필드변수로 지정해주는거임 / 안붙이면 인식 못함
//	}
//	int getAge() {			 	// int getAge(ThisExam this)
//		return age; 			//this.age를 해줘도 되는데 굳이 안붙여도 된다.
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
		return this;				//static메소드에는 this가 없다. 항상 instance메소드에서만 this를 쓸 수 있다.
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