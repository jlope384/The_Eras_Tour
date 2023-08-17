

public class SpecialTicket {
	
	static boolean isPerfectSquare(int x)
	{
		int s = (int) Math.sqrt(x);
		return (s*s == x);
	}
	
	static boolean isFibonacci(int n)
	{
		return isPerfectSquare(5*n*n + 4) ||
			isPerfectSquare(5*n*n - 4);
	}

}

