import java.util.Scanner;

public class J03006_SODEP1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            boolean check=true;
            for(int i=0; i<s.length(); i++){
                if((s.charAt(i)-'0')%2!=0||s.charAt(i)!=s.charAt(s.length()-i-1)){
                    check=false;
                    break;
                }
            }
            if(check) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
