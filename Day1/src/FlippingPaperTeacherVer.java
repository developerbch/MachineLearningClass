
public class FlippingPaperTeacherVer {
	public static void main(String[] args) {
		
		int count = 0;
		int rect = 1;
		
		for(count=0;rect<500;count++) {
			rect<<=1; //비트이동으로 시켜버림.. 컴퓨터는 2진수니까 한칸좌측으로 밀어서 *2시킨거다. //rect *=2; //rect=rect*2;
		}
		System.out.print("접은 횟수 = "); //ln을 떼면 줄바꿈을 안한다.
		System.out.println(count);
		
		System.out.println("사각형갯수 = " + rect); // 타입을 다르게 쓸 때 +를 갖고 붙이면 자동으로 문자인식을 해준다.
	}
}
