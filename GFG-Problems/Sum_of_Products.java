import java.util.Scanner;

public class Sum_of_Products {
    public int Solution(int n,long arr[]){
        int sum=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++)
                sum+=arr[i]&arr[j];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // long arr[]=new long[n];
        int n =4;
        long arr[]={10, 20, 30, 40};
        // for(int i=0;i<n;i++) 
        //     arr[i]=sc.nextInt();
        Sum_of_Products solution=new Sum_of_Products();
        System.out.println(solution.Solution(n, arr));
    }
}
