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
      //��ü ����
      IfExam ifexam; //reference ����
      ifexam = new IfExam(); // ���� �޸� �Ҵ�
      ifexam.starOne('2'); //���۷����� ���� �Լ� ȣ��
    }

}

//call by name
//�ν��Ͻ� �޼���� ��ü�� ������ �� �� �ִ�.