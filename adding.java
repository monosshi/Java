import java.util.Scanner;
public class adding {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n =Integer.parseInt(scan.nextLine());

        if(n<10)
        {
            System.out.println(n);
        }
        else
        {
            int sum=0;
            while(n>0)
            {
               int a= n%10;
               sum=sum+a;
               n=n/10;
            }
            System.out.println(sum);
        }  
    }
    
}
