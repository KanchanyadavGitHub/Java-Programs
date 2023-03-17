import java.util.Scanner;

public class numberchar {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        int n=o.nextInt();
        o.close();
        for(int i=0;i<n;i++){
            for(int j=i;j>=0;j--){ 
                
                System.out.print(n-j);
            }
            System.out.println();
        }
    }
}
