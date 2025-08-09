import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int s=0;
        while(n!=0){
            s=s*10 + n%10;
            n=n/10;
        }
        if(temp<=0){
            System.out.println("false");
        }
        else if(temp==s){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
