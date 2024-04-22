import java.util.HashMap;

public class Special_CharactersII {
    public int Solution(String word){
        int ans=0;
        HashMap<Character,Integer> hm=new HashMap<>();
        hm.put(word.charAt(0),0);
        for(int i=1;i<word.length();i++){
            char c=word.charAt(i);
            if(c>='a' && c<='z'){
                int t=c-32;
                if(hm.get((char)t)>i ){
                    ans++;
                }
                hm.put(c,i);
            }
            else{
                    int t=c+32;
                    if(hm.get((char)t)<i ){
                        ans++;
                    }
                    hm.put(c,i);
            }
        }

        return ans;

    }
    public static void main(String[] args) {
        String word="AbBCab";
        Special_CharactersI ob=new Special_CharactersI();
        System.out.println(ob.Solution(word));
    }
}
