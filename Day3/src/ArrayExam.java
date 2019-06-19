
public class ArrayExam {

	public static void main(String[] args) {
	
//		final int MAX = 5;
//		int []arr;
//		arr = new int [MAX];
//		
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = i+1;
//		}
//		
////		for(int i=0;i<arr.length;i++) {
////			System.out.println(arr[i]);
////		}
//		for(int i:arr) {
//			System.out.println(i); //
//			
//		}
		
		
		int [][]arr = new int[2][];
		
		arr[0] = new int[3];
		arr[1] = new int[4];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=i+j;
			}
		}
		
		for(int i=0;i<arr.length;i++) {			 //행
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
//		for(int =0; i<arr[0].length;)
		
	}
	
}
//i+j 행+열로해서 값을 넣고 출력해봐라
