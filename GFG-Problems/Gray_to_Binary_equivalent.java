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
    public int Method2(int n){
        String s = Integer.toBinaryString(n);
        String ans = s.charAt(0)+"";
        
        for(int i=1; i<s.length(); i++){
            char ch1 = s.charAt(i);
            char ch2 = ans.charAt(i-1);
            if(ch2!=ch1){
                ans = ans+"1";
            }else{
                ans = ans+"0";
            }
        }
        return Integer.parseInt(ans,2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Gray_to_Binary_equivalent solution=new Gray_to_Binary_equivalent();
        // System.out.println("Method 1: "+solution.Method1(n));
        System.out.println("Method 2: "+solution.Method2(n));
    }    
}
