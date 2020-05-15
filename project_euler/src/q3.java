//The prime factors of 13195 are 5, 7, 13 and 29.
//What is the largest prime factor of the number 600851475143 ?

public class q3{
public static void main(String[]args){
long out = 0;
        long m = 600851475143L;
        for (long n = 3; n < m; n += 2) {
            while (m % n == 0) {
                out = n;
                m = m / n;
            }
        }
        System.out.println("" + ((m == 1)?out:m));
    }
}
    //output :6857