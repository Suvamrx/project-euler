//The prime factors of 13195 are 5, 7, 13 and 29.
//What is the largest prime factor of the number 600851475143 ?

public class q3{
public static void main(String[]args){
	long x = 600851475143L; 

    long z;
 for (z = 2; z<x; z++) {
   
      if (x%z == 0 ) {
        x=x/z;
       }
   }
        System.out.println(z);                
}

}
//Output: 6857