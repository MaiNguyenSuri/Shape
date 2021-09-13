import java.util.Scanner;

public class Rectangle extends Shape{
    private Point topLeft;
    private int width;
    private int height;

    public Rectangle() {
        topLeft = new Point(0,0);
        width = 0;
        height = 0;
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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {

        return this.width * this.height;
    }

    @Override
    public void fromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("NHẬP HÌNH CHỮ NHẬT");

        System.out.println("Nhập điểm trái trên");

        System.out.println("Nhập x: ");
        int x = scanner.nextInt();

        System.out.println("Nhập y: ");
        int y = scanner.nextInt();

        this.topLeft.setX(x);
        this.topLeft.setY(y);

        System.out.println("Nhập chiều dài: ");
        this.width = scanner.nextInt();

        System.out.println("Nhập chiều rộng: ");
        this.height = scanner.nextInt();
    }

    @Override
    public void print() {
        System.out.println("Hình chữ nhật là");
        System.out.println("Điểm trái trên là: " + "(" + this.topLeft.getX() + "," + this.topLeft.getY() + ")");
        System.out.println("Chiều dài là: " + this.width);
        System.out.println("Chiều rộng là: " + this.height);

    }

}
