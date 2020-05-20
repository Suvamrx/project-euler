//2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

public  class q5{
	public static void main(String[] args) 
	{ 
		int[] a = { 2520,11,12,13,14,15,16,17,18,19,20 }; 
		System.out.println(lcm(a)); 
	} 

public static long lcm(int[] a) 
{ 
	int div = 2; 
	long lcm = 1; 
	while (true) 
	{ 
    int c = 0; 
		boolean divisible = false; 
		for (int i = 0; i < a.length; i++)
		{ 
        if (a[i] == 0) 
			{ 
				return 0; 
			} 
			else if (a[i] < 0) 
			{ 
				a[i] = a[i] * (-1); 
			} 
			if (a[i] == 1) 
			{ 
				c++; 
			} 
            if (a[i] % div == 0) 
			{ 
				divisible = true; 
				a[i] = a[i] / div; 
			} 
		} 

		
		if (divisible==true) 
		{ 
			lcm = lcm * div; 
		} 
		else 
		{ 
			div++; 
		} 


		if (c == a.length) 
		{ 
			return lcm; 
		} 
	} 
} 
}

   // Output: 232792560