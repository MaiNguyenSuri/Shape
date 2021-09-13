import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Shape> lstShape = new ArrayList<Shape>();
        System.out.println("Bạn muốn nhập bao nhiêu mảnh đất");

        Scanner scanner = new Scanner(System.in);
        int numberShape = scanner.nextInt();

        for (int i = 1; i <= numberShape; i++) {
            System.out.println("Bạn muốn nhập mảnh đất thứ " + i + " là:");
            int type = scanner.nextInt();
            Shape shape;
            switch (type) {
                case 1: {
                    shape = new Rectangle();
                    break;
                }
                case 2: {
                    shape = new Square();
                    break;
                }
                case 3: {
                    shape = new Circle();
                    break;
                }
                default: {
                    shape = new Triangle();
                    break;
                }
            }
            lstShape.add(shape);
            shape.fromConsole();
        }

        for(Shape shape: lstShape)
        {
            shape.print();
        }

        System.out.println("Nhập thông tin giá đất: ");
        long price = scanner.nextLong();
        long total = 0;

        for(Shape shape: lstShape)
        {
            total += price*shape.calculateArea();
        }
        System.out.println("Tổng tiền cần là: " + total);
    }


}
