import java.util.Scanner;

public class decimaltobinary {
  public static void main(String[] args) {
   Scanner sc =new Scanner(System.in);
   int no=sc.nextInt();
sc.close();
String binarystr=Integer.toBinaryString(no);
System.out.println("binary number is :"+binarystr);
}  
}
