package first;

import java.util.Arrays;

public class sorting {

	public static void main(String[] args) {
				
		int[] num= new int[] {-123456,777,412,-321,-516,617,778,779,1218,1111};
		
		Arrays.sort(num);
		
		for(int a : num){
			System.out.println(a);
		}
	
	}

}
