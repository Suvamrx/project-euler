//By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
//What is the 10 001st prime number?

public class q7{
public static boolean prime(long n){
int count =0;
long sqrt=(long)Math.sqrt(n);
for (long i = 1; i <= sqrt; i++) {
			if (n % i ==0) 
				count++;
				if (count > 1)
					return false;
			}
		return true;
}
 public static long prime1(long r){
  long count=1;
  long result=0;
for(long i=2;count<=r;i++){
   if(prime(i)){
   result=i;
   count++;
  }
}
 return result;
 }

public static void main(String[]args){
System.out.println(prime1( 10001));
}
}

//output :104743