import java.util.*;

public class List_Array {

	
	private int i=0;




	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List_Array la = new List_Array();
		Listlist ll=new Listlist();
		
		System.out.println("�����Ͻ� �׸��� �����ϼ���.");
		System.out.println("1. �߰�\t2. �˻�\t3. ����\t4. ����\t5. ��ü���\t6. ����");
		switch(sc.nextInt()){
		case 1:
			System.out.println("������ �߰��Ͻǰǰ���?\n1. �̸�\t2.����\t3.����\t4.����");
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

	ArrayList<StudentDB> list = new ArrayList<StudentDB>(); //arraylist�� Student Ŭ���� Ÿ������ ������
	
	static int checkIndex(ArrayList<StudentDB>st, String name) {
		int index=0;
		
	}
	
	
	
}
