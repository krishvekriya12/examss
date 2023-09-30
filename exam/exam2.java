import java.util.Scanner;

public class exam2 {

    public static void main(String arg[]) {

        int numebr;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the number = ");
        numebr = sc.nextInt();

        int nutral = numebr;

        if (nutral > 0) {
            System.out.println(nutral + "enetr numebr is possitive");
        }
        if (nutral == 0) {
            System.out.println(nutral + "enetr numebr is zero");
        } else {
            System.out.println(nutral + "enetr numebr is nagative");
        }
    }
}