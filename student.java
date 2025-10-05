import java.util.*;

class Student {
    public String code;
    public String name;
    public int birthYear;
    public String address;

    public Student(String code, String name, int birthYear, String address) {
        this.code = code;
        this.name = name;
        this.birthYear = birthYear;
        this.address = address;
    }

    public void display() {
        System.out.println(code);
        System.out.println(name);
        System.out.println(birthYear);
        System.out.println(address);
    }
}

public class student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student a = new Student(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextLine() );
        a.display();
    }
}
