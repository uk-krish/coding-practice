public class Maximum_Prime_Difference {
    public boolean isPrime(int x) {
        if (x <= 1) return false;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) return false;
        }
        return true;
    }
    public int Solution(int nums[]){
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(isPrime(nums[i])){
                if(i<min) min=i;
                if(i>max){
                    System.out.println(nums[i]);
                    max=i;
                }
            }
        }
        System.out.println(min +" "+max);
        return max-min;
    }
    public static void main(String[] args) {
        Maximum_Prime_Difference ob=new Maximum_Prime_Difference();
        int nums[]={1,7};
        System.out.println(ob.Solution(nums));
    }
}
