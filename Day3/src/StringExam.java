
public class StringExam extends Object{

	public static void main(String[] args) {
	
		String str = new String("Superman");
		String str1 = new String("Superman");
		
		if(str == str1) {				 //��ġ��(equals�� �Ⱦ��� �����ͺ񱳰� �ƴϴ�. ��ġ�񱳴�.)
			System.out.println("Same");
		}else{
			System.out.println("Def");
		}
		
		
		if(str.equals(str1)) { 			//data �� //equals�� ���� �����ͺ񱳴�
			System.out.println("Same");
		}else{
			System.out.println("Def");
		}
		
		
		
//		String str = new String("Superman");
//		
//		System.out.println(str.toString());
//		System.out.println(str);
//		
////		StringExam se = new StringExam();
////		System.out.println(se.toString());//��ӹ����� ����ó�� �� �� �ִ�. //�������̵� : ������ -> �θ𲨾����ʰ� �������ڴ�.
//		
//		str = new String("Batman");
//		System.out.println(str);
//		
//		str = "Pororo"; // �̰Ŷ� �Ȱ��� -> new String("Pororo"); //���ڿ��� ����� �����͸� ������ �� ����.=String class�� �����͸� ������ �� ����.
//		System.out.println(str);
	
	}
	
}
