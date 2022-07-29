import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        int n = 0;
        for (String x : args) {
            n = Integer.parseInt(x);
            break;
        }
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int k = sc.nextInt();
            sum += k;
        }
        System.out.println(sum);
        sc.close();
    }

}
