
public class MyStack extends Memory {// ���� Ŭ����

	// ���������̹Ƿ� ������ �ε��� ���� �޸𸮿� ����Ǿ��ִ� �Է� �ε��� �״�� ���

	public int pop() {
		int val = arr[--index];// �ε����� ���� �Էµ� ��ġ�� ����Ű�� �ֱ� ������ 1���� �� pop�� ���� ������ ����
		//arr[index] = 0;// pop�� ��Ҹ� 0���� �ʱ� 
		return val;       // pop
	}
}