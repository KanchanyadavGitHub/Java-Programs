import java.util.Scanner;

public class fibonacii {
    public static void main(String[] args) {
        int a = 0, b = 1, c;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i < n; i++) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
    }
}
