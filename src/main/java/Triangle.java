import java.util.Scanner;

public class Triangle extends Shape{
    private Point p1;
    private Point p2;
    private Point p3;

    public Triangle() {
        p1 = new Point(0,0);
        p2 = new Point(0,0);
        p3 = new Point(0,0);
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public Point getP3() {
        return p3;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }

    @Override
    public double calculateArea() {
        return 1 ;
    }

    @Override
    public void fromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("NHẬP HÌNH TAM GIÁC");

        System.out.println("Nhập điểm thứ nhất");

        System.out.println("Nhập x: ");
        int x1 = scanner.nextInt();

        System.out.println("Nhập y: ");
        int y1 = scanner.nextInt();

        this.p1.setX(x1);
        this.p1.setY(y1);

        System.out.println("Nhập điểm thứ hai");
        System.out.println("Nhập x: ");
        int x2 = scanner.nextInt();

        System.out.println("Nhập y: ");
        int y2 = scanner.nextInt();

        this.p2.setX(x2);
        this.p2.setY(y2);

        System.out.println("Nhập điểm thứ ba");
        System.out.println("Nhập x: ");
        int x3 = scanner.nextInt();

        System.out.println("Nhập y: ");
        int y3 = scanner.nextInt();

        this.p3.setX(x3);
        this.p3.setY(y3);
    }

    @Override
    public void print() {
        System.out.println("Hình tam giác là");
        System.out.println("Điểm thứ nhất là: " + "(" + this.p1.getX() + "," + this.p1.getY() + ")");
        System.out.println("Điểm thứ hai là: " + "(" + this.p2.getX() + "," + this.p2.getY() + ")");
        System.out.println("Điểm thứ ba là: " + "(" + this.p3.getX() + "," + this.p3.getY() + ")");
    }
}
