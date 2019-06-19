//ver.2

import java.util.Scanner;


public class ScoreProgramVer02 {

	//field
	private String name; 		//private���� �̸� �ʵ�
	private double score[];		//������ �迭�� ����
	private double avg;			//���
	
	//constructor //�ʵ带 �ʱ�ȭ
	public ScoreProgramVer02() {
		name = null;
		score = new double[4];
		avg = 0.d;
	}

	
	//setter�� getter�� ����
	public void setName(String name) {
		this.name = name;
	}
	public void setKorean(double korean) {
		score[0] = korean;
	}
	public void setEng(double eng) {
		score[1] = eng;
	}
	public void setMath(double math) {
		score[2] = math;
	}
	
	public String getName() {
		return name;
	}
	public double getKorean() {
		return score[0];
	}
	public double getEng() {
		return score[1];
	}
	public double getMath() {
		return score[2];
	}
	double getTotal() {
		return score[3] = score[0] + score[1] + score[2];
	}
	double getAvg() {
		return avg=score[3]/3.d;
	}
	
	
	public static void main(String[] args) {
		
		
		ScoreProgram sp = new ScoreProgram();
		Scanner sc = new Scanner(System.in); 
		

		
		System.out.println("�̸��� �Է��ϼ��� :");
		sp.setName(sc.next());
		System.out.println("���� ������ �Է��ϼ��� :");
		sp.setKorean(sc.nextDouble());
		System.out.println("���� ������ �Է��ϼ��� :");
		sp.setEng(sc.nextDouble());
		System.out.println("���� ������ �Է��ϼ��� :");
		sp.setMath(sc.nextDouble());
		
		System.out.println("���� : " + sp.getName());
		System.out.println("���� ���� : " + sp.getKorean());
		System.out.println("���� ���� : " + sp.getEng());
		System.out.println("���� ���� : " + sp.getMath());
		System.out.println("���� : " + sp.getTotal());
		System.out.println("��� : " + sp.getAvg());
		
		
	}
}
