import java.io.*;
import java.util.*;

public class Solution {
    public static int count(int n){
        int c=0;
        while(n!=0){
            c++;
            n = n/10;
        }
        return c;
    }
    public static int power(int n,int c){
        int sum=0;
        while(n!=0){
            int last = n%10;
            int exp = (int) Math.pow(last,c);
            sum = sum+exp;
            n = n/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int c =count(n);
        int pow = power(n,c);
        if(n == pow){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        
    }
}
