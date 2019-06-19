
public class Overrding {

	private int age;
	
	public Overrding(char a) {
		System.out.println("디폴트생성자함수");
	}
	
	public Overrding(int a) {
		age = a;
		System.out.println("디폴트생성자함수");
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
	public char getAge() { //리턴타입은 오버로딩이 불가능하다.
		return 'a';
	}
	
	 public static void main(String[] args) {
		 
		 Overrding over = new Overrding();//생성자함수호출
		 
		 Overrding over1 = new Overrding(25);//생성자함수호출
	 }
}
