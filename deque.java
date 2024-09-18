import java.util.*;
public class deque {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int k= scanner.nextInt();
        scanner.nextLine();
       
        List<String> dq=new ArrayList<String>();

    for(int i=0;i<n;i++)
    {
        String s= scanner.nextLine();
        dq.add(s);
    }


    Deque<String> st= new ArrayDeque<String>() ;
        
    
    for(int i=n;i<k;i++)
    {
        st.addLast(dq.get(i));

       
    }   

    for(String ss:st)
    {
        System.out.println(ss);
    }
        
    }
    
}
