import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n =Integer.parseInt(scan.nextLine());
        int one =0,two=0,three=0;

        for(int i=0;i<n;i++) {
            int input = scan.nextInt();
    
            if(input==1)
            {
                one++;
            }
            else if(input==2)
            {
                two++;
            }
            else
            {
                three++;
            }
        }   
        if(one>two && one>three)
        {
            System.out.println("Google Classroom");
        }

        else if(two>one && two>three)
        {
            System.out.println("WhatsApp");
        }
        else if(three>one && three>two)
        {
            System.out.println("Telegram");
        }
        else
        {
            System.out.println("TIE");
        }
    }
    
}
