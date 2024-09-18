import java.util.*;
public class hashset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

    
        
        Set<String> st=new HashSet<String>();

        int repeat=0;

        for(int i=0;i<n;i++)
        {
            String choclate_name=scanner.nextLine();

            if(!st.add(choclate_name))
            {
                repeat++;
            }
        }
       
        System.out.println(repeat);
        System.out.println(st.size());
    
    }
    
}




