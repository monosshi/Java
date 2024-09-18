import java.util.*;
public class vector {
    public static void main(String[] args)
    
    {

        Vector<String> v = new Vector<String>();
        v.add("monosshi");
        v.add("arjo");

        Iterator<String> itr = v.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }
    
}
