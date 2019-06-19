
public class TimesTable {
	public static void main(String[] args) {
		int i;
		int j;

		for(i=1;i<10;i++) {
			
			for(j=2;j<10;j++) {
				int k = i*j;
				System.out.print(j + "*" + i + "=" + k + '\t');
			}
			System.out.println();
		}
	}
}
//결과값을 보고 요소를 결정해라