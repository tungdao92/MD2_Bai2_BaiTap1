import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dai, rong;
        String a = "";
        System.out.println("nhập chiều dài");
        dai = sc.nextInt();
        System.out.println("nhập chiều rộng");
        rong = sc.nextInt();
        for (int i = 0; i < rong; i++) {
            for (int j = 0; j < dai; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        for (int i = 0; i < rong ; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}
