//The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
//Find the sum of all the primes below two million.

public class q10{
public static void main(String[]args){
boolean[] n = new boolean[2000000];
    long sum = 0;

    for (int i = 0; i < n.length; ++i)
        n[i] = true;

    for (int i = 2; i < n.length; ++i)
        if (!n[i])
            continue;
        else {
            int j = i + i;
            while (j < 2000000) {                   
                n[j] = false;
                j += i;
            }           
        }

    for (int i = 2; i < 2000000; ++i)
        sum += n[i] ? i : 0;

    System.out.println(sum);
}
}

  //output :142913828922