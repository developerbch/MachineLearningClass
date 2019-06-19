
public class MyStack extends Memory {// 스택 클래스

	// 선입후출이므로 별도의 인덱스 없이 메모리에 선언되어있는 입력 인덱스 그대로 사용

	public int pop() {
		int val = arr[--index];// 인덱스가 다음 입력될 위치를 가리키고 있기 때문에 1감소 후 pop할 값을 변수에 저장
		//arr[index] = 0;// pop할 요소를 0으로 초기 
		return val;       // pop
	}
}