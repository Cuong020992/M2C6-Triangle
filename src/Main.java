import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin tam giác");
        System.out.print("nhập màu sắc hình: ");
        String color = sc.nextLine();
        System.out.print("Nhập độ dài cạnh thứ nhất: ");
        double side1 = sc.nextDouble();
        System.out.print("Nhập độ dài cạnh thứ hai: ");
        double side2 = sc.nextDouble();
        System.out.print("Nhập độ dài cạnh thứ ba: ");
        double side3 = sc.nextDouble();
        Triangle triangle = new Triangle(color,side1,side2,side3);

        System.out.println(triangle.toString());
    }
}
