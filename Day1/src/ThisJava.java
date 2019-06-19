
public class ThisJava {
	private int a;
	private int b;
	
	
	public ThisJava(){	
		//a=b=0;
		this(0,0);
	}
	
	ThisJava(int a){
//		this.a = a;
//		b=0;
		this(a,0);
	}
	
	ThisJava(int a, int b){
		this.a=a;
		this.b=b;
	}
	
	public void setA(int a) {
		this.a=a;
	}
	
	public void setB(int b) {
		this.b=b;
	}
	
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	
	public static void main(String[] args) {
		ThisJava te1 = new ThisJava(); //0,0
		ThisJava te2 = new ThisJava(10); //10,0
		ThisJava te3 = new ThisJava(20,30); //20,30
		
		System.out.println(te1.getA()+"\t"+te1.getB());
		System.out.println(te2.getA()+"\t"+te2.getB());
		System.out.println(te3.getA()+"\t"+te3.getB());
	}
}