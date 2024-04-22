import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Two_Repeated_Elements {
    public int[] twoRepeated(int arr[], int n)
    {
        Map<Integer,Integer> hm=new HashMap<>();
        int l=0;

        int ans[]=new int[2]; 
        for(int i:arr){
            if(hm.containsKey(i)){
                hm.put(i,hm.get(i)+1);
                if(hm.get(i)==2){
                    ans[l]=i;
                    l++;
                }
                if(l==2) break;
            }
            else{
                hm.put(i,1);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1, 2, 2, 1};
        int n=arr.length;
        Two_Repeated_Elements ob=new Two_Repeated_Elements();
        int ar[]=ob.twoRepeated(arr,n);
        for(int i:ar){
            System.out.print(i+" ");
        }
    }
    
}