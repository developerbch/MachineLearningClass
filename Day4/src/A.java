
public class A extends Object{
	private String name;

	
	public A() {
		this("");
	}
	public A(String name) {
		this.name=name;
		System.out.println("A ������");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
