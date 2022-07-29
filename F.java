import java.util.Scanner;

public class F {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag = 0;

        if (n == 0 || n == 1) {
            System.out.println("non prime");

        } else {

            for (int i = 2; i <= n / 2; i++) {

                if (n % i == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("prime");
            } else {
                System.out.println("non prime");
            }
        }

        sc.close();
    }

}
