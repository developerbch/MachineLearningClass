
public abstract class Memory {

	protected int []arr; // �޸� ����		//private�����ϸ� ��ӹ��� ����Ŭ�������� ������ ����//������� �� ���� �θ� ���������ϱ� �� �����ִ�. ������ ��Ȯ�ϰ� ���ϸ� �ƴϴ�..
	protected int index; // ���� �Էµ� ��ġ�� ���� ����

	public Memory() { // ������(�ʱ�ȭ)
		arr = new int[5];
		index = 0;
	}

	public abstract int pop();// �ڽ�Ŭ���� ���� �ٸ� ����� �ϱ� ���� �߻�޼���� ���� �� �������̵�

	public void push(int num) { // �迭�� �� �Է�
		arr[index++] = num;  // �� �Է��� ��ġ ����Ű�� index���� ++
	}
}
	//	protected int []arr; //private�����ϸ� ��ӹ��� ����Ŭ�������� ������ ����//������� �� ���� �θ� ���������ϱ� �� �����ִ�. ������ ��Ȯ�ϰ� ���ϸ� �ƴϴ�..
	//	protected int index;
	//	
	//	public Memory() {
	//		arr=new int[5];
	//		index = 0;
	//	}
	//	public Memory(int count) {
	//		arr = new int[count];
	//	}
	//	
	//	public final void push(int i) { //�޼ҵ��� final�� �������̵��� �����Ѵ�. �׷���. �θ𸻸� ����Ͷ�
	//		arr[index++] = i;
	//	}
	//	
	//	public abstract int pop(); //�߻�ȭ�� �Ҷ�� �տ� abstract�� ���δ�. -> �ڽ��� �������̵� �ʼ�!, �ʰŰ� �ϰ������� ���������
	//	

