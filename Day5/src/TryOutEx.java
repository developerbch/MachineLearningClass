//try-catch�� �����ϸ� �Ⱦ��� ���� ����. �������� �������� �����̴�.


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
			System.out.println(("��.. �迭 �Ѿ���.."));
			System.exit (-1);
		}catch(Exception e) {
			System.out.println("0���� ������ �����...");
		}finally {
			System.out.println("���̾�...");
		}
	}
}
