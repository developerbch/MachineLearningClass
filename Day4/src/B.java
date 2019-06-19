/*
 * Overriding
 * 
 * 1. super class�� sub class�� �Ȱ��� ������ ����� ������ �ִ°�.
 * 2. �θ� ���� ������ �ȵ� ������ �ϰ���� �� ��� but ������� �ٲ������� ������ �ٲ�� �ȴ�..
 * 3. final�� �ϸ� Overriding�� �� �� ����.
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
   
   public B() {	//super(); //thisȣ���� �������� ������ �ҷ����°Ű� superȣ���� �θ��� �����ڸ� ȣ���ϴ°Ŵ�.
      super(); 
      // �ڽ��� �θ��� �����ڸ� ȣ���ϴ� ��.
      // �ڽ� �������� ù��° ���ο��� �׻� ȣ��ǰ� ���ִ�.
      // ���� ��������� ����� default�� ��������.
      System.out.println(("B ������"));
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
