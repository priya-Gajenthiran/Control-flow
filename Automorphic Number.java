import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int m= (int)Math.pow(n,2);
        int count=0;
        while(n!=0){
            count++;
            n=n/10;
        }
        int val=(int)Math.pow(10,count);
        if(m%val == temp){
            System.out.println("Automorphic");
        }
        else{
             System.out.println("Not Automorphic");
        }
    }
}
