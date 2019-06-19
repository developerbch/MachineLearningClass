
public class AA implements Area3 {

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		
	} //implements => 구현

	@Override
	public void disp1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disp3() {
		// TODO Auto-generated method stub
		
	}

	
	public static void main(String[] args) {
		Area a = new AA(); //인터페이스도 동적 바인딩이 가능하다. 
	}
}
