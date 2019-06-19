/*
 * Overriding
 * 
 * 1. super class와 sub class가 똑같은 형태의 멤버를 가지고 있는것.
 * 2. 부모 것이 마음에 안들어서 수정을 하고싶을 때 사용 but 껍데기는 바꾸지말고 내용을 바꿔야 된다..
 * 3. final을 하면 Overriding을 할 수 없다.
 */

public class B extends A{

   private int age;
   
   public void setAge(int age) {
      this.age = age;
   }
   
   public int getAge() {
      return age;
   }
   
   public String toString() {
      return super.toString() +"\t"+ getName() + "\t" + getAge(); 
   }
   
   public B() {	//super(); //this호출은 내꺼에서 내꺼를 불러오는거고 super호출은 부모의 생성자를 호출하는거다.
      super(); 
      // 자식이 부모의 생성자를 호출하는 것.
      // 자식 생성자의 첫번째 라인에서 항상 호출되게 되있다.
      // 내가 명시적으로 만들면 default가 없어진다.
      System.out.println(("B 생성자"));
   }
   public B(String name,int age) {
      super(name);
      this.age = age;
   }
   
   public static void main(String[] args) {
      
      B bb = new B("superman",1000);
      
      System.out.println(bb);
//      System.out.println(bb.getName());
//      System.out.println(bb.getAge());
	}
}
