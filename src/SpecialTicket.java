
public class SpecialTicket {

	static boolean isPerfectSquare(int x) // este método es para validar el código especial por medio de un cuadrado
											// perfecto
	{
		int s = (int) Math.sqrt(x);
		return (s * s == x);
	}

	static boolean isFibonacci(int n) // este método es para validar el código especial
	{
		return isPerfectSquare(5 * n * n + 4) ||
				isPerfectSquare(5 * n * n - 4); // si el número es un cuadrado perfecto, entonces es válido y retorna
												// true
	}

}
