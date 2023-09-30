public class exam4{

    public static void main(String[] args) {
        Display dis = new Display();
        dis.Display("10", "krishna");

    }
}

class Display {
    String roll;
    String name;

    void Display(String roll, String name) {
        this.roll = roll;
        this.name = name;
        System.out.print("Roll no. = " + roll);
        System.out.println();
        System.out.print("Name = " + name);
    }
}