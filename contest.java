import java.util.Scanner;

public class contest {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int n=scan.nextInt();
        String s= scan.next();
        int cnt=0;

        if(n<26)
        {
            System.out.println("NO");
        }
       
        else 
        {
           for(int i=0;i<s.length()-1;i++)
           {
            if(s.charAt(i)==s.charAt(i+1))
            
            {
                cnt++;
            } 

        }

        if(cnt>0)
        {
            System.out.println("NO");
        }
        else
        {
            System.out.println("YES");

        }
      
    }
}

}







