import java.util.*;

public class List_Array {

	
	private int i=0;




	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List_Array la = new List_Array();
		Listlist ll=new Listlist();
		
		System.out.println("실행하실 항목을 선택하세요.");
		System.out.println("1. 추가\t2. 검색\t3. 수정\t4. 삭제\t5. 전체출력\t6. 종료");
		switch(sc.nextInt()){
		case 1:
			System.out.println("무엇을 추가하실건가요?\n1. 이름\t2.국어\t3.영어\t4.수학");
			switch(sc.nextInt()) {
			case 1 : list.add();
			}
		
		}
	}

}//end class List_Array



class StudentDB{
	
	//field
	String name;
	int kor;
	int eng;
	int math;
	
	//constructor
	
	public StudentDB(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng=eng;
		this.math=math;
		
	}
	
	//method
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getKor() {
		return kor;
	}
	
	public void setkor(int kor) {
		this.kor =kor;
	}
	
	public int getEng() {
		return eng;
	}
	
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public int getMath() {
		return math;
	}
	
	public void setMath(int math) {
		this.math = math;
	}
}//end class StudentDB



class Listlist{

	ArrayList<StudentDB> list = new ArrayList<StudentDB>(); //arraylist를 Student 클래스 타입으로 가져옴
	
	static int checkIndex(ArrayList<StudentDB>st, String name) {
		int index=0;
		
	}
	
	
	
}
