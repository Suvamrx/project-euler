/*The sum of the squares of the first ten natural numbers is,
*12+22+...+102=385
*The square of the sum of the first ten natural numbers is,
*(1+2+...+10)2=552=3025
*Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025-385=2640.
*Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
*/
 //#updated
public class q6{
  static int sosq(int n){
       if (n==0){
           return 0;
        }
    else
       return(n*n)+sosq(n-1);
   }
 static int sosu(int n){
     return (n*(n+1)/2)*(n*(n+1)/2);
  }
public static void main(String []args){
     System.out.println(sosu(100)-sosq(100));
  }
}
  //Output: 25164150