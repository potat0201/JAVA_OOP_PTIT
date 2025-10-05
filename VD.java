import java.util.*;

public class VD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String[] s=sc.nextLine().trim().toLowerCase().split("\\s+");
            StringBuilder sb=new StringBuilder();
            for(String i:s){
                sb.append(Character.toUpperCase(i.charAt(0)));
                sb.append(i.substring(1));
                sb.append(" ");
            }
            System.out.println(sb.toString().trim());
        }
    }
}
