import java.util.Scanner;

public class stardiamond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    sc.close();
    for(int i=1;i<=n+1/2;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=2*i-1;j++){
            System.out.print("*");
        }
        for( i=n/2;i>=1;i--){
            for(int j=i;j<=n-i+1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        // }
    }
}
    }
}


    

