
public class FlippingPaper {
	public static void main(String[] args) {
		int n=0; // ����Ƚ��
		int y=1; // �簢�� ����
		for(y=1;y<500;y*=2) {
			n+=1;
		}
		System.out.println("�簢�� ������ " + y);
		System.out.println("���� Ƚ����" + n);
}
}