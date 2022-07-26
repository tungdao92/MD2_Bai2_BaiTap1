import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 1;
        do {
            System.out.println("1. In ra hình chữ nhật");
            System.out.println("2 . In ra tam giác vuông");
            System.out.println("3 . In ra tam giác cân");
            System.out.println("4. Exit");
            number = sc.nextInt();
            switch (number){
                case 1:
                int dai, rong;
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
                break;
                case 2:
                    System.out.println("Bạn muốn vẽ loại tam giác nào: top-left, top-right, bottom-left, bottom-right");
                    String type = sc.next();
                    if (type.equals("top-left")){
                        int canh;
                        System.out.println("Nhập cạnh");
                        canh = sc.nextInt();
                        for (int i = 0; i < canh ; i++) {
                            for (int j = 8; j > i; j--) {
                                System.out.print("*");
                            }
                            System.out.println("*");
                        }
                    }
                    if (type.equals("top-right")){
                        int canh;
                        System.out.println("Nhập cạnh");
                        canh = sc.nextInt();
                        for (int i = 1; i <= canh; i++) {
                            for (int j = 0; j < i; j++) {
                                System.out.print(" ");
                            }
                            for (int k = canh; k > i; k--) {
                                System.out.print("*");
                            }
                            System.out.println(" ");
                        }
                    }
                    if (type.equals("bottom-right")){
                        int canh;
                        System.out.println("Nhập cạnh ");
                        canh = sc.nextInt();
                        for (int i = canh; i >= 0; i--) {
                            for (int j = 0; j <= i; j++) {
                                System.out.print(" ");
                            }
                            for (int k = canh; k > i; k--) {
                                System.out.print("*");
                            }
                            System.out.println("");
                        }
                    }
                    if (type.equals("bottom-left")){
                        int canh;
                        System.out.println("Nhập cạnh");
                        canh = sc.nextInt();
                        for (int i = 1; i <= canh; i++) {
                            for (int j = 1; j < i; j++) {
                                System.out.print("*");
                            }
                            System.out.println(" ");
                        }
                    }
                case 3:
                    int canh;
                    System.out.println("Nhập cạnh");
                    canh = sc.nextInt();
                    int star = 1;
                    for (int i = 1; i < canh; i++) {
                        for (int j = canh - i; j > 0 ; j--) {
                            System.out.print(" ");
                        }
                        for (int k = 0; k < star; k++) {
                            System.out.print("*");
                        }
                        star +=2;
                        System.out.println("");

                    }
            }
        }

        while (number != 4);

    }
}
