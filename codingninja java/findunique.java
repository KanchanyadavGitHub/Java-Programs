import java.util.Scanner;

public class findunique {
    public static int findUnique(int []arr){
     int ans=0;
     for(int i=0;i<arr.length;i++){
      ans=ans^arr[i];
     }
     return ans;

    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []arr=new int[size];
     sc.close();
     for(int i=0;i<size;i++){
      arr[i]=sc.nextInt();
     }
  System.out.println(findUnique(arr));

     }
    }

