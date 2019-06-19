
public class TimesTableWhile {
	public static void main(String[] args) {
		int i=1;
		

		while(i<10) {
			
			int j=2;
			while(j<10) {
				int k = i*j;
				System.out.print(j + "*" + i + "=" + k + '\t');
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
//결과값을 보고 요소를 결정해라