//{ Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();//total testcases
        while (T-- > 0) {
            Hanoi obj = new Hanoi();
            int N;
            
            //taking input N
            N = sc.nextInt();

            //calling toh() method 
            System.out.println(obj.toh(N, 1, 3, 2));
        }
    }
}






// } Driver Code Ends


// User function Template for Java


// avoid space at the starting of the string in "move disk....."
class Hanoi {

//N -> n
//from-> Source -> a
//to-> destination -> b
//helper -> c
    public long toh(int n, int a, int b, int c) {
        if(n==0){
            return 0;//disk zero to nothings happen
        }
        // Your code here
        long left=toh(n-1,a,c,b);
        System.out.println("move disk "+n+" from rod "+a+" to rod "+b);
        long right=toh(n-1,c,b,a);
        return left+right+1;
    }
}
