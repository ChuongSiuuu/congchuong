public class MainCircle {
    public static void main(String[] args) {
        System.out.println(" truong hop nhap dung gia tri ");
        Circle c = new Circle(5);
        System.out.println(c.toString());

        System.out.println("\n\n truong hop nhap sai gia tri");
        Circle c1 = new Circle(-4);
        System.out.println(c1.toString());


    }
}
