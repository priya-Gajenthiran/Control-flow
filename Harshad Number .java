import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        while(n!=0){
            sum= sum+(n%10);
            n=n/10;
        }
        if(temp%sum==0)
            System.out.println("Harshad Number");
        else
            System.out.println("Not Harshad Number");
        
    }
}
