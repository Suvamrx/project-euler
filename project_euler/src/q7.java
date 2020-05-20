//By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
//What is the 10 001st prime number?

public class q7{
	
		private static boolean isPrime(long n)
		{
			
			if ((n % 2 == 0)&&(n != 2))
				return false;		
			for (long i = 3; i <= (Math.sqrt(n)+1); i += 2)	
			{
				if (n % i == 0)
					return false;	
			}
			return true;
		}

		public static void main(String[] args)
		{
			
			int NumPrimes = 1;
			long i = 2;
			while(NumPrimes <= 10001)
			{
				if (isPrime(i))
				{
					i++;
					NumPrimes++;
				}
				else i++;
			}
			
			System.out.println(i-1);
			
		}	
	}
	       //output :104743