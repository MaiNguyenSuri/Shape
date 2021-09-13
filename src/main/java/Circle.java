import java.util.Scanner;

public class Circle extends Shape{
    private Point center;
    private int radius;

    public Circle() {
        center = new Point(0,0);
        radius = 0;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        double duongkinh = radius * 2;
        return Math.pow(duongkinh,2)/4* Math.PI;
    }

    @Override
    public void fromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("NHẬP HÌNH TRÒN");

        System.out.println("Nhập điểm giữa");

        System.out.println("Nhập x: ");
        int x = scanner.nextInt();

        System.out.println("Nhập y: ");
        int y = scanner.nextInt();

        this.center.setX(x);
        this.center.setY(y);

        System.out.println("Nhập bán kính: ");
        this.radius = scanner.nextInt();

    }

    @Override
    public void print() {
        System.out.println("Hình tròn là");
        System.out.println("Điểm trái giữa là: " + "(" + this.center.getX() + "," + this.center.getY() + ")");
        System.out.println("Bán kính là: " + this.radius);

    }
}
