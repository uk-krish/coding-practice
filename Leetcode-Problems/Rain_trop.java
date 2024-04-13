import java.util.Scanner;

public class Rain_trop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Solution ob=new Solution();
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i:arr) arr[i]=sc.nextInt();
        System.out.println(ob.trap(arr));
    }
}

class Solution {
    public int trap(int[] arr) {
        int n=arr.length;
        int ml=0,mr=0,r=n-1,l=0;
        int ans=0;
        while(l<=r)
        {
            if(arr[l]<=arr[r])
            {
                if(arr[l]>=ml) ml=arr[l];
                else ans+=ml-arr[l];
                l++;
            }
            else
            {
                if(arr[r]>mr) mr=arr[r];
                else ans+=mr-arr[r];
                r--;
            }
        }
        return ans;
    }
}