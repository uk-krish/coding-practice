import java.util.Scanner;

public class Latest_Time_100256 {
    public String Solution(String s){
        char check[]=s.toCharArray();
       if(check[0]=='?'){
            if((check[1]=='?') || (check[1]>='0' && check[1]<='1')) check[0]='1';
            else check[0]='0';
       }
       if(check[1]=='?'){
        if(check[0]=='1') check[1]='1';
        else check[1]='9';
       }
       if(check[3]=='?'){
        check[3]='5';
       }
       if(check[4]=='?'){
        check[4]='9';
       }
        return  String.valueOf(check);
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Latest_Time_100256 ob=new Latest_Time_100256();
        String s="04:??";
        System.out.println(ob.Solution(s));
    }
}
