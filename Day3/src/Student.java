
public class Student {

	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int total;
	private float avg;
	
	public Student() {
		name = null;
		kor = 0;
		eng = 0;
		mat = 0;
	}
	
	public Student(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		
		getTotal();
		getAvg();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getTotal() {
		return total=kor+eng+mat ;
	}
	public float getAvg() {
		return avg=total/3.f;
	}
	
	public String toString() {
		return name+ "\t" + kor + "\t" + eng + "\t" + mat + "\t" + getTotal() + "\t" + getAvg();
	}
}
