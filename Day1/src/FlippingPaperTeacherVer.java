
public class FlippingPaperTeacherVer {
	public static void main(String[] args) {
		
		int count = 0;
		int rect = 1;
		
		for(count=0;rect<500;count++) {
			rect<<=1; //��Ʈ�̵����� ���ѹ���.. ��ǻ�ʹ� 2�����ϱ� ��ĭ�������� �о *2��Ų�Ŵ�. //rect *=2; //rect=rect*2;
		}
		System.out.print("���� Ƚ�� = "); //ln�� ���� �ٹٲ��� ���Ѵ�.
		System.out.println(count);
		
		System.out.println("�簢������ = " + rect); // Ÿ���� �ٸ��� �� �� +�� ���� ���̸� �ڵ����� �����ν��� ���ش�.
	}
}
