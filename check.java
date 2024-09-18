import java.util.Scanner;

public class check {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();

    for(int i=0;i<n;i++)
    {
        String s=sc.nextLine();

        if(s.charAt(0)=='e')
        {
            System.out.println(s);
        }

    
    }
    
}
}