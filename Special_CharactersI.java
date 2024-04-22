import java.util.HashSet;

public class Special_CharactersI {
    public int Solution(String word){
        int ans=0;
       HashSet<Character> hs=new HashSet<>();
       hs.add(word.charAt(0));
       for(char c:word.toCharArray()){
        if(c==word.charAt(0) || hs.contains(c)) continue;
        if(c>='a' && c<='z') {
            int t=c-32;
            if(hs.contains((char)t)){
                ans++;
            }
            hs.add(c);
        }
        else{
            int t=c+32;
            if(hs.contains((char)t)){
                ans++;
            }
            hs.add(c);
        }
       }
        return ans;

    }
    public static void main(String[] args) {
        String word="abBCab";
        Special_CharactersI ob=new Special_CharactersI();
        System.out.println(ob.Solution(word));
    }
}
