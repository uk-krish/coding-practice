import java.util.Scanner;

public class Reverse_bits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        Solution ob = new Solution(); 
        System.out.println(ob.reversedBits(n));
    }
}

class Solution {
    static Long reversedBits(Long x) {
        // code here
        int bits[]=new int[32];
        for(int i=0;i<32;i++){
            long bconvert=x>>i;
            bits[i]=(bconvert&1)> 0 ? 1:0;
        }
        long ans=0,p=0;
        for(int i=31;i>=0;i--){
            if(bits[i]==1)
                ans+=Math.pow(2,p);
            p++;
        }
        return ans;
    }
};