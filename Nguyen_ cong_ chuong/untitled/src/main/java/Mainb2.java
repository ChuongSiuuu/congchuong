import java.util.Scanner;

public class Mainb2 {
    public static void main(String[] args) {
        KyThuat k = new KyThuat("1","cong chuong","03/05/2000","bac ninh","IT");
        System.out.println(k.toString());


        KyThuat k2 = new KyThuat();
        Scanner in = new Scanner(System.in);
        System.out.println("nhap ten :  ");
        k2.setName(in.nextLine());
        System.out.println("nhap ngay sinh :  ");
        k2.setDate(in.nextLine());
        System.out.println("nhap dia chi :  ");
        k2.setDress(in.nextLine());
        System.out.println("nhap chuyen nganh :  ");
        k2.setChuyenNganh(in.nextLine());
        System.out.println(k2.toString());
    }
}
