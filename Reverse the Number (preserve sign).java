import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int r=0;
        if(n<0){
            System.out.print("-");
            n=n*(-1);
        }
        while(n!=0){
            r=(r*10)+(n%10);
            n/=10;
        }
        System.out.println(r);
    }
}
