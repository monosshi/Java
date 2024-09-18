import java.util.Scanner;

public class array {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    int [] arr= new int[n];
    int [] arr_new=new int[n];
    sc.nextLine();

    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();  
      
    }


    
    
    
    for(int i=n-1;i>=0;i--)
    {
        arr_new[i]=arr[i];
    }


    int check=sc.nextInt();
    
    if(check==arr_new[0])
    {
        System.out.println("-1");
          
    }

    else
    {
        for(int i=0;i<=n;i++)
        {
            if(check==arr_new[i])
            {
                break;
            }

            System.out.print(arr_new[i]);
        }
        System.out.print(" ");
    }
    
   } 
}



    

