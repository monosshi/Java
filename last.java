import java.util.*;

public class last {
    public static void main(String[] args) {
        
    
    
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();

    for(int i=0;i<n;i++)
    {
        String s=sc.nextLine();
        if(s=="Encapsulation")
        {
            System.out.println("Locker");
        }
        else if(s=="Inheritance")
        {
            System.out.println("Mukesh Ambani");
        }
        else if(s=="Polymorphism")
        {
            System.out.println("Human");
        }
        else if(s=="Abstraction")
        {
            System.out.println("ATM");
        }
        
    }
}
}


/*Encapsulation
Inheritance
Polymorphism */

/*Locker
Mukesh Ambani
Human */