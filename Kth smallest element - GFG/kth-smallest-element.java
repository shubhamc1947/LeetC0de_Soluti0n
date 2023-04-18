//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    
		    int arr[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		    
		    int k=sc.nextInt();
		    Solution ob = new Solution();
		    out.println(ob.kthSmallest(arr, 0, n-1, k));
		}
		out.flush();
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    public static int kthSmallest(int[] arr, int si, int ei, int k) 
    {   
        int idx=partition(arr,si,ei);
        if(idx+1==k){
            return arr[idx];
        }else if(idx+1>k){
          return  kthSmallest(arr,si,idx-1,k);
        }else{
           return kthSmallest(arr,idx+1,ei,k);
        }
       
    } 
    public static int partition(int arr[], int low, int high)
    {
         int j=low,i=low;
        while(i<=high){
            if(arr[i]<=arr[high]){
              if(i!=j){
                int t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
              }
              i++;
              j++;
            }else{
                i++;
            }
        }
        return j-1;
    } 
    
    
}
