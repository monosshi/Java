import java.util.*;
public class stack {

    public static void main(String[] args)
    {
        Stack<String> st= new Stack<String>();

        st.push("monosshi");
        st.push("zaman");

        st.pop();

        Iterator <String> itr=st.iterator();  
        while(itr.hasNext()){  
        System.out.println(itr.next());  
        }  
    }
    
}
