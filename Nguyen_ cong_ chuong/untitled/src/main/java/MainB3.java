import java.util.Scanner;

public class MainB3 {
    public static void main(String[] args) {
        vanban v =new vanban();
        Scanner in = new Scanner(System.in);
        System.out.println(" nhap van ban: ");
        v.setSt(in.nextLine());
        System.out.println(v.toString());
    }
}
