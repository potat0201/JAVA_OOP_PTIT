import java.util.*;

class svthuctap{
    public String madn, ten;
    public int soluong;

    public svthuctap(String mdn, String ten, int soluong){
        this.madn = madn;
        this.ten = ten;
        this.soluong = soluong;
    }

    public String getMadn() {
        return madn;
    }

    public void setMadn(String madn) {
        this.madn = madn;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    @Override
    public String toString(){
        return madn + " " + ten + " " + soluong;
    }
}

public class J05028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<svthuctap> arr = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            String madn = sc.nextLine();
            String ten = sc.nextLine();
            int soluong = Integer.parseInt(sc.nextLine());
            arr.add(new svthuctap(madn, ten, soluong));
        }
        arr.sort(new Comparator<svthuctap>() {
            @Override
            public int compare(svthuctap o1, svthuctap o2) {
                if(o1.getSoluong() != (o2.getSoluong())){
                    return Integer.compare(o2.getSoluong(), o1.getSoluong());
                }
                else{
                    return o1.getMadn().compareTo(o2.getMadn());
                }
            }
        });
        for(svthuctap a : arr){
            System.out.println(a);
        }

    }
}
