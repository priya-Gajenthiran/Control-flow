import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(n<0){
            n=n*-1;
        }
        int d=n;
        int m=n;
        int y=0;
        int x;
        for(int i=n;n>0;n=n/10){
            x=n%10;
            if(x>y){
                y=x;
            }
        }
        int a;
        int b=10;
        a=m%10;
        for(int i=m;m>0;m=m/10){
            b=m%10;
            if(b==0){
                break;
            }
            else if(a<b){
                b=a;
            }
        }
        if(d==0){
            System.out.println("0 0");
        }
        else{
            System.out.print(y+" ");
            System.out.println(b);
        }
    
        }
        
    }
