import java.util.Scanner;

public class Square extends Shape{
    private Point topLeft;
    private int width;

    public Square() {
        topLeft = new Point(0,0);
        width = 0;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return this.width * this.width;
    }

    @Override
    public void fromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("NHẬP HÌNH VUÔNG");

        System.out.println("Nhập điểm trái trên");

        System.out.println("Nhập x: ");
        int x = scanner.nextInt();

        System.out.println("Nhập y: ");
        int y = scanner.nextInt();

        this.topLeft.setX(x);
        this.topLeft.setY(y);

        System.out.println("Nhập cạnh: ");
        this.width = scanner.nextInt();

    }

    @Override
    public void print() {
        System.out.println("Hình vuông là");
        System.out.println("Điểm trái trên là: " + "(" + this.topLeft.getX() + "," + this.topLeft.getY() + ")");
        System.out.println("Cạnh là: " + this.width);

    }
}
