//try-catch는 웬만하면 안쓰는 것이 좋다. 가독성이 떨어지기 때문이다.


public class TryOutEx {

	public static void main(String[] args) {

		int []arr = new int[3];

		try {

//			int a =3/0;
			for(int i = 0; i<4; i++) {
				
//				Thread.sleep(5000);;
				System.out.println(arr[i]);
			}

			System.out.println("Bye");

		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println(("야.. 배열 넘었어.."));
			System.exit (-1);
		}catch(Exception e) {
			System.out.println("0으로 나누지 말라고...");
		}finally {
			System.out.println("끝이야...");
		}
	}
}
