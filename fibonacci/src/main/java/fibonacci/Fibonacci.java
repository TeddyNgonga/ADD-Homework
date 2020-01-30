package fibonacci;

public class Fibonacci {
	public static long calc(long i) {

		if (i < 2)
			return i;

		long a = 0;
		long b = 1;
		long fib = 1;

		for (long x = 2; x <= i; x++) {
			fib = a + b;
			a = b;
			b = fib;
		}

		return fib;

		/*
		 * // Recursive if (i < 2) return i; else return calc(i - 1) + calc(i - 2);
		 * 
		 * // Binet's formula double sqrt5 = Math.sqrt(5.0); return
		 * Math.round((Math.pow(1 + sqrt5, i) - Math.pow(1 - sqrt5, i)) / (Math.pow(2,
		 * i) * sqrt5));
		 */
	}

}
