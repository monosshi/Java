import java.util.Scanner;

public class score {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n =Integer.parseInt(scan.nextLine());

        for(int k=0;k<n;k++) {

            int size=scan.nextInt();
            String[]name=new String[size];
            int[]num=new int[size];

            for(int j=0;j<size;j++)
            {
            
            name[j]= scan.next();
            num[j]=scan.nextInt();
            
            }

            for(int i=1;i<size;i++)
            {
                for(int j=0;j<size-i;j++)
                {
                    if(num[j]>num[j+1])
                    {
                        int temp=num[j];
                        num[j]=num[j+1];
                        num[j+1]=temp;

                        String temporary=name[j];
                        name[j]=name[j+1];
                        name[j+1]=temporary;
                    }
                }
                
            }

            for(int j=0;j<size;j++)
            {
                System.out.print(name[j]);
                System.out.println(" ");
    
             }
             System.out.println();
            
            } 
        
    }
    
}
