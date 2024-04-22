import java.util.Scanner;

public class Score_of_a_String {
    public int scoreOfString(String s)
    {
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
            sum+=Math.abs((int)s.charAt(i)-(int)s.charAt(i+1));
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Score_of_a_String ob=new Score_of_a_String();
        String s=sc.nextLine();
        System.out.println(ob.scoreOfString(s));
    }
}
