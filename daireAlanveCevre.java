import java.util.Scanner;
public class daireAlanveCevre {
    public static void main(String[] args) {
        int r;
        double pi = 3.14;

        Scanner inp = new Scanner(System.in);
        System.out.print("dairenin yarıcapını giriniz : ");
        r = inp.nextInt();

        double alan = pi * r * r;
        double cevre = 2 * pi * r;

        System.out.println(" darienin alanı " + alan + "\n dairenin cevresi : " + cevre);

    }
}
