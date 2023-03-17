import java.util.Scanner;

public class factorial {
    public static void factorialCalcu(int n){
        if(n<0){
            System.out.println("invalid input");
            return;
        }
        int fact=1;
       for(int i=n;i>=1;i--){

     fact=fact*i;

       }
       System.out.println(fact);
    }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    
    sc.close();
    
    factorialCalcu(n);
    
  }  
}