import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Check_For_consecutive {
    public String Solution(int n, List<Integer> a){
        Set<Integer> a1=new HashSet<>();
        StringBuilder ans=new StringBuilder();
        for(int i:a){
            a1.add(i);
        }
        for(int i=0;i<n;i++)
        {
                if(a1.contains(a.get(i)+1) ||a1.contains(a.get(i)-1) )
                    ans.append('1');
                    else 
                    ans.append('0');
}
        return ans.toString();
    }
    public static void main(String[] args) {
        List<Integer> a = List.of(3, 2, 7);
        Check_For_consecutive ob=new Check_For_consecutive();
        System.out.println(ob.Solution(a.size(), a));
    }
}