import java.util.Scanner;

/*�� ǥ�� ��翡 ���� ����Ѵ�.*/

public class Homework_2 {

 public static void main(String[] args) {
  Star s = new Star();
  Scanner inp = new Scanner(System.in);
  String respone;
  while(true) {
   System.out.println("������� ��ǥ�� ��ȣ�� �Է��� �ּ���.\n(1,2,3,4,5)");
   s.view(inp.nextInt(),inp);
   
   System.out.println("����Ͻðڽ��ϱ�?(Yes : Y,y)");
   respone = inp.next();
   if( !(respone.equals("Y")||respone.equals("y")) )break;
  }
 }// end main method

}//end Homework_2 class

class Star{
 private void star_01() {
  /*
   * �ʿ��� *�� ������ŭ �ݺ��� �ϸ� �ݺ�Ƚ���� 4�� ����̸� �ٹٲ��� �Ѵ�.
   * */
  for(int i = 0; i <16; i++) {
   System.out.print("*");
   if(i%4 == 3) System.out.println(""); // �ٹٲ�
  }
 }//end method star_01
 
 private void star_02() {
  /*
   * ����� �ϴ� ����(������ ũ��)��ŭ �ݺ�
   * i�� ��� �������� ����
   * �������� 2(�ݺ�Ƚ���� 3�� ���)�̸� ���� �ٲ۴�.
   * ���� �� �ٴ� �������� ����ȴ�.
   * ���� ���������� ���ų� ũ�� *�� ��� 
   * ex)���� 1�� �� 
   *    - ������ 0 : "*"�� ���
   *    - ������ 1 : "*"�� ���
   *    - ������ 2 : " "�� ���
   * */
  int a, b;
  for(int i = 0; i < 9; i++) {
   a = i/3; // ��
   b = i%3; // ������
   if(a >= b) { // ���� �������� ���ų� ũ�� "*"�� ����
    System.out.print("*");
   }else {
    System.out.print(" ");
   }
   
   if(b == 2)System.out.println(""); // �ݺ��� 3ȸ�̸� �ٹٲ�
  }
 }//end method star_02
 
 private void star_03() {
  /*
   * i�� ������ ũ��(9)��ŭ �ݺ�
   * 2���� ���� ������ �������� ���Ͽ� �������� �� ũ�ų� ������ "*"���
   * ex) �� 0 -> 2
   *   - ������ 0 : " "���
   *   - ������ 1 : " "���
   *   - ������ 2 : "*"���
   * �ݺ�Ƚ���� 3�� ����̸� �ٹٲ�
   */
  int a,b;
  for(int i = 0; i < 9; i++) {
   a = i/3; //��
   b = i%3; //������
   
   if(2-a <= b) { // 2-���� ���������� �۰ų� ������ "*"�� ���
    System.out.print("*");
   }else {
    System.out.print(" ");
   }
   
   if(b == 2)System.out.println(""); // �ݺ�Ƚ���� 3�� ����̸� �ٹٲ�
  }
 }// end method star_03
 
 private void star_04() {
  /*
   * ������ ũ��(15)��ŭ �ݺ�
   * 2-+��� �������� ���Ͽ� �������� �۰ų� ũ�� " "�� ���
   * (star_03()�� ������ �ݴ�� ���)
   * 5ȸ �ݺ��� �ٹٲ�
   */
  int a, b;
  for(int i = 0; i < 15; i++) {
   a = i/5;// ��
   b = i%5;//������
   if(b < 2-a || 2+a < b) { // 2-���� ������ ���� ũ�ų� 2+���� ���������� ������ " "�� ���
    System.out.print(" ");
   }else {
    System.out.print("*");
   }
   
   if(b == 4)System.out.println(""); // �ٹٲ�
  }
 }// end method star_04
 
 private void star_05() {
  /*
   * ����� star_04()�� ����
   * ��� ���� ũ���� ���(2)�� �������� ��Ī���� ���� �������� ����
   * ex) 0, 1, 2, 1, 0 ������ ���� ����
   */
  
  int a, b;
  for(int i = 0; i < 25; i++) {
   b = i%5; // ��������
   
   if(i/5 <= 2) { // ũ��(5)�� ��� ��(2)�� �������� ��Ī���� ���� �Է¹޴´�.
    a = i/5;
   }else {
    a = 4 - i/5;
   } // 2�� �������� ��Ī
   
   if(2-a > b || 2+a <b) {// star_04()�� ����
    System.out.print(" ");
   }else {
    System.out.print("*");
   }
   
   if(b == 4)System.out.println(""); // �ٹٲ�
  }
 }// end method star_05
 
 private void star_06(Scanner sc) {
  /*
   * star_05()�� ����� ����
   * Scanner�� �Ű������� �޾� ũ�⸦ ���� �Է¹޴´�.
   * star_04()�� 5�� size�� �ٲٰ� 2(�����)�� (size-1)/2�� �ٲپ� ���
   */
  int size,a,b; // size�� ũ�⺯��
  System.out.print("���̾Ƹ���� ũ�⸦ �Է����ּ���(Ȧ����)\n�Է� : ");
  size = sc.nextInt();// size���� �Է¹���
  
  for(int i = 0; i < size*size; i++) {
   b = i%size; // ��������
   
   if(i/size <= (size-1)/2) { // size�� �߾Ӱ��� �������� ��Ī
    a = i/size;
   }else {
    a = size -1 - i/size;
   }
   
   if((size-1)/2-a > b || (size-1)/2+a <b) { // star_04()�� ����
    System.out.print(" ");
   }else {
    System.out.print("*");
   }
   
   if(b == size - 1)System.out.println(""); // �ٹٲ�
  }
 }
 
 void view(int index, Scanner sc) {
  switch(index) {
  case 1 :
   star_01();
   break;
  case 2 :
   star_02();
   break;
  case 3 :
   star_03();
   break;
  case 4 :
   star_04();
   break;
  case 5 :
   star_05();
   break;
  case 6 :
   star_06(sc);
   break;
  default : System.out.println("�߸� �Է��Ͽ����ϴ�.");
  }
 }//end method view
 
}// end class Star