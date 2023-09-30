public class exam6 {
    public static void main(String[] args) {
        InnerArray ia = new InnerArray();
        ia.getter();
    }
}

class InnerArray {
    int ary[] = {1,2,3,4,5,6,7,8,9,0};
    int max = ary[0];
    int min = ary[0];
    int i;

    void getter() {
        for (int i = 1; i < ary.length; i++) {
            if (ary[i] > max) {
                max = ary[i];
            }

            if (ary[i] < min) {
                min = ary[i];
            }
        }
        System.out.println("Maximun Value is : " + max);
        System.out.println("Minimum Value Is : " + min);
    }
}