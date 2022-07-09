package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		int n = 17;
	for (int i=2; i<=n; i ++) {
		if (n%i == 1)
		{
			System.out.println("It is a prime number");
			break;
		}
			else if(n%2 ==0)
			{
				System.out.println("It is not a prime number");
			break;
			}
	}

	}
	

}
