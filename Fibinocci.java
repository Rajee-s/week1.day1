package week1.day1;

public class Fibinocci {
	
	public static void main(String[] args) {
		
		int n = 11;
		int firstNum = 0, secNum = 1, sum = 0;
		System.out.println(firstNum);
		System.out.println(secNum);
		 for (int i=3; i<=n; i++)
		 {
			 sum = firstNum + secNum;
			 
			 firstNum = secNum;
			 secNum = sum;
			 System.out.println(sum);
			 
		 }
		 
			 
	}

}
