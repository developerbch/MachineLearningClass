
public abstract class Memory {

	protected int []arr; // 메모리 변수		//private으로하면 상속받은 서브클래스에서 접근을 못함//상속했을 때 내가 부모꺼 물려받으니까 다 쓸수있다. 하지만 정확하게 말하면 아니다..
	protected int index; // 값을 입력될 위치를 가진 변수

	public Memory() { // 생성자(초기화)
		arr = new int[5];
		index = 0;
	}

	public abstract int pop();// 자식클래스 별로 다른 기능을 하기 위해 추상메서드로 생성 후 오버라이딩

	public void push(int num) { // 배열에 값 입력
		arr[index++] = num;  // 값 입력후 위치 가르키는 index변수 ++
	}
}
	//	protected int []arr; //private으로하면 상속받은 서브클래스에서 접근을 못함//상속했을 때 내가 부모꺼 물려받으니까 다 쓸수있다. 하지만 정확하게 말하면 아니다..
	//	protected int index;
	//	
	//	public Memory() {
	//		arr=new int[5];
	//		index = 0;
	//	}
	//	public Memory(int count) {
	//		arr = new int[count];
	//	}
	//	
	//	public final void push(int i) { //메소드의 final은 오버라이딩을 금지한다. 그래서. 부모말만 따라와라
	//		arr[index++] = i;
	//	}
	//	
	//	public abstract int pop(); //추상화를 할라면 앞에 abstract를 붙인다. -> 자식은 오버라이딩 필수!, 너거가 하고싶은대로 만들어들어써라
	//	

