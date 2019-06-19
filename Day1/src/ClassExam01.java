/* <class�������>
 * field(�������)
 * : ��ü������ ����ؼ� ���Ǿ����� ����
 * : �ַ� private���� ���� (private�� ���� �� �� ���� , default�� ���� ��Ű����, protected�� ������Ű��+�������)
 * : �ܺΰ�ü���� ���������� ������ �� ���� ó��
 * : �޼ҵ带 ���� ����� �� �ְ� ����
 * 
 *
 * constructor(�������Լ�)
 * : ��ü ���� ��(new�� ��)�ڵ�ȣ��Ǿ����� �޼ҵ�
 * : ����Ÿ���� ����.
 * : �޼ҵ���� Ŭ������� �����ϴ�.
 * : �������Լ��� �ӽ������� �������� ���� ��� ����Ʈ�������Լ��� �����Ѵ�.
 * : �ָ���
 *		1. ����Ʈ���� - ��ü��� (������ ȣ���� �ȵǸ� ����� ��ü�� ��������� �ʴ´�.)
 * 		2. ����ڿ��� - ��ü������ �ʵ� �ʱ�ȭ
 * : Overroding ���� (�Ȱ��� �Լ� �̸��� ������ �� �� �ִ�.
 * 
 * 
 * 
 * method(�Լ�)
 * : �ܺο� ���θ� ���� (�ܺ�=�ܺΰ�ü, ����=���ڽ�)
 * : instance method : ��ü �����Ŀ� ��뵵�� �޼ҵ� (��ü�� �ϳ��ִ� ����)
 * : static method : ��ü �����ϰ� ���Ǵ� �޼ҵ� (���� Ÿ�Կ��� �� �ϳ��� �����ϴ� ����)
 * : �����ε��� ����
 */
public class ClassExam01 {
	//field������.
	private String name;
	private int age;
	
	ClassExam01(){
		//name = "super";
		//age = 12;
		//sex = "men";
	}; // default constructor method
	
	
	//method
	public void setName(String n) {
		name = n;
	}
	public void setAge(int a) {
		age = a;
	} 
	
	//getter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public static void main(String[] args) {
		ClassExam01 cex = new ClassExam01(); //��ü����
		cex.setName("Superman");
		cex.setAge(1000);

		
		System.out.println(cex.getName());
		System.out.println(cex.getAge());
	}
}
