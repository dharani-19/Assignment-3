package week2.day2;

public class PrintDuplicate {
	public static void main(String[] args) {
		
		int[] num={1,2,3,4,5,6,1,2,3,4,9,4};

		for (int i = 0; i < num.length; i++) {
		
			for (int j = i+1; j < num.length; j++) {
				
				if(num[i]==num[j]) {
					
					System.out.println(num[i]);
				}
			}
		}
		
		
}
}
