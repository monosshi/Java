import java.util.Scanner;

public class sorting {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n =Integer.parseInt(scan.nextLine());

        for(int k=0;k<n;k++) {
            int size=scan.nextInt();
            int[]inputArray=new int[size];

            for(int i=0;i<size;i++)
            {
                inputArray[i]=scan.nextInt();
            }
        
            for(int i=1;i<size;i++)
            {
                for(int j=0;j<size-i;j++)
                {
                    if(inputArray[j]>inputArray[j+1])
                    {
                        int temp=inputArray[j];
                        inputArray[j]=inputArray[j+1];
                        inputArray[j+1]=temp;
                    }
                }
                
        }
        for(int j=0;j<size;j++)
        {
            System.out.print(inputArray[j]);
            System.out.println(" ");

         }
         System.out.println(" ");
        
        } 

    }
}
