import java.util.Scanner;

/*별 표를 모양에 따라 출력한다.*/

public class Homework_2 {

 public static void main(String[] args) {
  Star s = new Star();
  Scanner inp = new Scanner(System.in);
  String respone;
  while(true) {
   System.out.println("보고싶은 별표의 번호를 입력해 주세요.\n(1,2,3,4,5)");
   s.view(inp.nextInt(),inp);
   
   System.out.println("계속하시겠습니까?(Yes : Y,y)");
   respone = inp.next();
   if( !(respone.equals("Y")||respone.equals("y")) )break;
  }
 }// end main method

}//end Homework_2 class

class Star{
 private void star_01() {
  /*
   * 필요한 *의 개수만큼 반복을 하며 반복횟수가 4의 배수이면 줄바꿈을 한다.
   * */
  for(int i = 0; i <16; i++) {
   System.out.print("*");
   if(i%4 == 3) System.out.println(""); // 줄바꿈
  }
 }//end method star_01
 
 private void star_02() {
  /*
   * 출력을 하는 갯수(공간의 크기)만큼 반복
   * i를 몫과 나머지로 구분
   * 나머지가 2(반복횟수가 3의 배수)이면 줄을 바꾼다.
   * 몫은 한 줄당 공통으로 적용된다.
   * 몫이 나머지보다 같거나 크면 *를 출력 
   * ex)몫이 1인 행 
   *    - 나머지 0 : "*"을 출력
   *    - 나머지 1 : "*"을 출력
   *    - 나머지 2 : " "을 출력
   * */
  int a, b;
  for(int i = 0; i < 9; i++) {
   a = i/3; // 몫
   b = i%3; // 나머지
   if(a >= b) { // 몫이 나머지와 같거나 크면 "*"을 실행
    System.out.print("*");
   }else {
    System.out.print(" ");
   }
   
   if(b == 2)System.out.println(""); // 반복이 3회이면 줄바꿈
  }
 }//end method star_02
 
 private void star_03() {
  /*
   * i를 공간의 크기(9)만큼 반복
   * 2에서 몫을 뺀값과 나머지를 비교하여 나머지가 더 크거나 같으면 "*"출력
   * ex) 몫 0 -> 2
   *   - 나머지 0 : " "출력
   *   - 나머지 1 : " "출력
   *   - 나머지 2 : "*"출력
   * 반복횟수가 3의 배수이면 줄바꿈
   */
  int a,b;
  for(int i = 0; i < 9; i++) {
   a = i/3; //몫
   b = i%3; //나머지
   
   if(2-a <= b) { // 2-몫이 나머지보다 작거나 같으면 "*"을 출력
    System.out.print("*");
   }else {
    System.out.print(" ");
   }
   
   if(b == 2)System.out.println(""); // 반복횟수가 3의 배수이면 줄바꿈
  }
 }// end method star_03
 
 private void star_04() {
  /*
   * 공간의 크기(15)만큼 반복
   * 2-+몫과 나머지를 비교하여 나머지가 작거나 크면 " "을 출력
   * (star_03()의 생각을 반대로 사용)
   * 5회 반볶시 줄바꿈
   */
  int a, b;
  for(int i = 0; i < 15; i++) {
   a = i/5;// 몫
   b = i%5;//나머지
   if(b < 2-a || 2+a < b) { // 2-몫이 나머지 보다 크거나 2+몫이 나머지보다 작으면 " "을 출력
    System.out.print(" ");
   }else {
    System.out.print("*");
   }
   
   if(b == 4)System.out.println(""); // 줄바꿈
  }
 }// end method star_04
 
 private void star_05() {
  /*
   * 방법은 star_04()와 동일
   * 대신 몫을 크기의 가운데(2)를 기준으로 대칭으로 값을 가지도록 설정
   * ex) 0, 1, 2, 1, 0 순서로 값을 지정
   */
  
  int a, b;
  for(int i = 0; i < 25; i++) {
   b = i%5; // 나머지값
   
   if(i/5 <= 2) { // 크기(5)의 가운데 값(2)를 기준으로 대칭으로 값을 입력받는다.
    a = i/5;
   }else {
    a = 4 - i/5;
   } // 2를 기준으로 대칭
   
   if(2-a > b || 2+a <b) {// star_04()와 동일
    System.out.print(" ");
   }else {
    System.out.print("*");
   }
   
   if(b == 4)System.out.println(""); // 줄바꿈
  }
 }// end method star_05
 
 private void star_06(Scanner sc) {
  /*
   * star_05()와 방법은 동일
   * Scanner를 매개변수로 받아 크기를 따로 입력받는다.
   * star_04()의 5를 size로 바꾸고 2(가운데값)을 (size-1)/2로 바꾸어 계산
   */
  int size,a,b; // size는 크기변수
  System.out.print("다이아몬드의 크기를 입력해주세요(홀수만)\n입력 : ");
  size = sc.nextInt();// size값을 입력받음
  
  for(int i = 0; i < size*size; i++) {
   b = i%size; // 나머지값
   
   if(i/size <= (size-1)/2) { // size의 중앙값을 기준으로 대칭
    a = i/size;
   }else {
    a = size -1 - i/size;
   }
   
   if((size-1)/2-a > b || (size-1)/2+a <b) { // star_04()와 동일
    System.out.print(" ");
   }else {
    System.out.print("*");
   }
   
   if(b == size - 1)System.out.println(""); // 줄바꿈
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
  default : System.out.println("잘못 입력하였습니다.");
  }
 }//end method view
 
}// end class Star