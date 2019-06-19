
public class StringExam extends Object{

	public static void main(String[] args) {
	
		String str = new String("Superman");
		String str1 = new String("Superman");
		
		if(str == str1) {				 //위치비교(equals를 안쓰면 데이터비교가 아니다. 위치비교다.)
			System.out.println("Same");
		}else{
			System.out.println("Def");
		}
		
		
		if(str.equals(str1)) { 			//data 비교 //equals를 쓰면 데이터비교다
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
////		System.out.println(se.toString());//상속받으면 내꺼처럼 쓸 수 있다. //오버라이딩 : 재정의 -> 부모꺼쓰지않고 내꺼쓰겠다.
//		
//		str = new String("Batman");
//		System.out.println(str);
//		
//		str = "Pororo"; // 이거랑 똑같다 -> new String("Pororo"); //문자열은 절대로 데이터를 수정할 수 없다.=String class는 데이터를 수정할 수 없다.
//		System.out.println(str);
	
	}
	
}
