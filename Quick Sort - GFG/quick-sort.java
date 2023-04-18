//{ Driver Code Starts
import java.util.*;
class Sorting
{
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    
    // Driver program
    public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

			
			new Solution().quickSort(arr,0,n-1);
			printArray(arr);
		    T--;
		}
} }
// } Driver Code Ends


class Solution
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        if(low>=high){
            return;
        }
        int rightidx=partition(arr,low,high);
        quickSort(arr,low, rightidx-1);
        quickSort(arr, rightidx+1,high);
        // code here
    }
    static int partition(int arr[], int low, int high)
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
