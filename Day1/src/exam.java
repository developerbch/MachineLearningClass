public class exam  {
   
   void starOne(char ch) {
      
      for(int i=1; i<=12; i++) {
         System.out.print(ch);
         if(i%4 == 0) {
            System.out.println();
         }
      }
   }

   public static void main(String[] args) {
      //method call
      //starOne('#');
      
      //reference call
      //객체 선언
      IfExam ifexam; //reference 선언
      ifexam = new IfExam(); // 동적 메모리 할당
      ifexam.starOne('2'); //레퍼런스를 통해 함수 호출
    }

}

//call by name
//인스턴스 메서드는 객체를 만들어야 쓸 수 있다.