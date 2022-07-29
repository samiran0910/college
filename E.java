import java.util.*;

public class E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Bin b = new Bin();
        b.bin(n);
        sc.close();

    }

}

class Bin{
    int n;
    Bin(){}

  void bin(int n){ ArrayList<Integer> bin = new ArrayList<Integer>();
        while (n > 0) {

            int s = n % 2;
            bin.add(s);
            n /= 2;
        }
        Collections.reverse(bin);
        for (int x : bin) {
            System.out.print(x+"\t");
        }
    }

}