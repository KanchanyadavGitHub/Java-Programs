import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		int n=ob.nextInt();
        ob.close();
		int a=n;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print("0");
			}
			System.out.print("*");
			for(int k=1;k<a;k++)
			{
				System.out.print("0");
			}
			System.out.print("*");
			for(int k=1;k<a;k++)
			{
				System.out.print("0");
			}
			a--;
			System.out.print("*");
			for(int j=1;j<i;j++)
			{
				System.out.print("0");
			}
			System.out.println();
		}
	}
}
