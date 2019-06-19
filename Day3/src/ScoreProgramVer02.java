//ver.2

import java.util.Scanner;


public class ScoreProgramVer02 {

	//field
	private String name; 		//private으로 이름 필드
	private double score[];		//점수를 배열로 생성
	private double avg;			//평균
	
	//constructor //필드를 초기화
	public ScoreProgramVer02() {
		name = null;
		score = new double[4];
		avg = 0.d;
	}

	
	//setter와 getter를 만듦
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
		

		
		System.out.println("이름을 입력하세요 :");
		sp.setName(sc.next());
		System.out.println("국어 점수를 입력하세요 :");
		sp.setKorean(sc.nextDouble());
		System.out.println("영어 점수를 입력하세요 :");
		sp.setEng(sc.nextDouble());
		System.out.println("수학 점수를 입력하세요 :");
		sp.setMath(sc.nextDouble());
		
		System.out.println("성명 : " + sp.getName());
		System.out.println("국어 점수 : " + sp.getKorean());
		System.out.println("영어 점수 : " + sp.getEng());
		System.out.println("수학 점수 : " + sp.getMath());
		System.out.println("총점 : " + sp.getTotal());
		System.out.println("평균 : " + sp.getAvg());
		
		
	}
}
