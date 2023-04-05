//{ Driver Code Starts
import java.util.Scanner;
import java.util.Stack;
class SortedStack{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			Stack<Integer> s=new Stack<>();
			int n=sc.nextInt();
			while(n-->0)
			s.push(sc.nextInt());
			GfG g=new GfG();
			Stack<Integer> a=g.sort(s);
			while(!a.empty()){
				System.out.print(a.peek()+" ");
				a.pop();
			}
			System.out.println();
		}
	}
}
// } Driver Code Ends


/*Complete the function below*/
class GfG{
	public Stack<Integer> sort(Stack<Integer> s)
	{
		//add code here.
		sortStack(s);
		return s;
	}
	public static void sortStack(Stack<Integer> st) {
        if (st.size() == 0) {
            return;
        }
        int ele = st.pop();
        sortStack(st);
        insert(st, ele);
    }

    public static void insert(Stack<Integer> st, int ele) {
    Stack<Integer> temp = new Stack<>();
    while (st.size() > 0) {
    if (ele < st.peek()) {
    // > for top to bottom decending order
    // < for top to bottom assending order
    temp.push(st.pop());
    } else
    break;
    }
    st.push(ele);
    while (temp.size() > 0) {
    int tmp = temp.pop();
    st.push(tmp);
    }
    }
    

}