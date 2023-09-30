import java.util.Scanner;

public class exam5 {
    public static void main(String[] args) {

        Triangle v = new Triangle();
        v.Calculate();

    }

}

class Ractangle {

    Scanner scanner = new Scanner(System.in);
    double lenght;
    double width;

    public void Calculate() {

        System.out.print("Enter  lenght = ");
        lenght = scanner.nextDouble();
        System.out.print("Enter width = ");
        width = scanner.nextDouble();

        System.out.println("enter Area of Ractangle = " + (lenght * width));
        System.out.println();

    }

}

class Triangle extends Ractangle {

    double base;
    double hight;

    public void Calculate() {
        super.Calculate();

        System.out.print("Enter  base = ");
        base = scanner.nextDouble();
        System.out.print("Enter  hight  = ");
        hight = scanner.nextDouble();

        System.out.println("enter traingale number = " + (base * hight / 2));
    }

}