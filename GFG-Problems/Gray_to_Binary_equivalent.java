import java.util.Scanner;

public class Gray_to_Binary_equivalent {
    public int Method1(int n){
        int ans=0;
        while(n>0){
            ans^=n;
            n>>=1;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Gray_to_Binary_equivalent solution=new Gray_to_Binary_equivalent();
        System.out.println("Method 1: "+solution.Method1(n));
    }    
}
