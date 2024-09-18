import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); 
        scanner.nextLine();

        int interested=0;

        for(int i=0;i<t;i++)
        {
            int p=scanner.nextInt();
            if(p==1)
            {
                interested++;
            }
        }
        System.out.println(interested);
        
    }
}