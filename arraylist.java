import java.util.*;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
     
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); 

        for(int i=0;i<t;i++)
        {
           int token = scanner.nextInt();
           num.add(token);
          
        }

        List<Integer> num2= new ArrayList<Integer>();

        for(int n:num)
        {
            if(n!=3)
            {
               num2.add(n) ;
            }   
        }

        Iterator itr=num2.iterator();

        while(itr.hasNext())
        {
            System.out.print(itr.next());
            System.out.print(" ");
        }
        
       
    }
    
}







    // num.add(10);
        // num.add(12);
        // System.out.println(num);
        // System.out.println(num.size());
        // System.out.println(num.contains(59));
        // System.out.println(num.indexOf(12));
        // System.out.println(num.set(1,20));
        // System.out.println(num.remove(1));
        
        // for(int val:num)
        // {
        //     System.out.println(val);

        // }
    
        // num.clear();
        // System.out.println(num.isEmpty()); 