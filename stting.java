import java.util.Scanner;
 
public class stting {
 
    public static void main(String [] args){
 
        Scanner scan = new Scanner(System.in);
        char section =scan.next().charAt(0);

        if(section=='A'|| section=='B'|| section=='E')
        {
            System.out.println("JIM sir");
        }
        else if(section=='C'||section=='D')
        {
            System.out.println("JAC sir");
        }
        scan.close();
    }
   
}
