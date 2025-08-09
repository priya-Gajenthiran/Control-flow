import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int sq = n*n;
        int sum =0;
        while(sq!=0){
            sum = sum+sq%10;
            sq = sq/10;
        }
        if(n==sum){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
