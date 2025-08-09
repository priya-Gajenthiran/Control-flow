import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        if(n<0){
            n=n*-1;
        }
        int x=n%10;
        while(n>=10){
            n=n/10;
        }
        System.out.println(x+n);
    }
}
