import java.util.Scanner;
import java.util.Stack;

class Remove_K_digits{
    public String Solution(String nums,int k){
        Stack<Integer> st=new Stack<>();
        int ans=0,mult=1;
        for(char num:nums.toCharArray()){
            while (!st.isEmpty() && num-'0'<st.peek() && k>0 ) {
                st.pop();
                k--;
            }
            st.push(num-'0');
        }
        while (!st.isEmpty()) {
            ans+=st.pop()*mult;
            mult*=10;
        }
        return ""+ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String nums=sc.next();
        // sc.next();
        int k=sc.nextInt();
        Remove_K_digits solution=new Remove_K_digits();
        System.err.println(solution.Solution(nums, k));
    }
}