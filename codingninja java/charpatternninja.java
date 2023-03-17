import java.util.Scanner;

public class charpatternninja {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++){
            int start =i;
            for(int j=1;j<=i;j++){
                System.out.print((char)('A'+start-1));
                start--;
            }
            System.out.println();
        }
    }
    }

