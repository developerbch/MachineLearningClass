
public class FlippingPaper {
	public static void main(String[] args) {
		int n=0; // Á¢ÀºÈ½¼ö
		int y=1; // »ç°¢Çü °¹¼ö
		for(y=1;y<500;y*=2) {
			n+=1;
		}
		System.out.println("»ç°¢Çü °¹¼ö´Â " + y);
		System.out.println("Á¢Àº È½¼ö´Â" + n);
}
}