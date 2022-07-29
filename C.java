import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int n[] = new int[size];

        for(int i =0;i<n.length;i++){
            n[i] = sc.nextInt();
            
        }
        for(int i =0;i<n.length;i++){
            System.out.print(n[i]+"\t");
        }
        sc.close();
    }
    
}
