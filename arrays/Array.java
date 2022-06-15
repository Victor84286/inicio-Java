package arrays;

public class Array {
	public static void main(String[] args) {
		int[] v1 = {1, 2, 3, 4, 5, 6, 7, 8, 9}, v2 = {11, 12, 13, 14, 15, 16, 17 ,18, 19};
		
		for(int i  =0; i< v1.length; i++) {
			System.out.println(v1[i]);
		}
		for(int i  =0; i< v2.length; i++) {
			System.out.println(v2[i]);
		}
		System.arraycopy(v1, 2, v2, 4, 5);
		
		for(int i  =0; i< v2.length; i++) {
			System.out.println(v2[i]);
		}
		
	}
}
