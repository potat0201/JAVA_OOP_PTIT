import java.util.Scanner;

public class J01016_CHUSO4VACHUSO7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        String n = sc.nextLine();
        for(char c : n.toCharArray()){
            if(c == '4'|| c == '7'){
                cnt++;
            }
        }
        String kq = (cnt == 4 || cnt == 7) ? "YES" : "NO";
        System.out.println(kq);
    }
}
