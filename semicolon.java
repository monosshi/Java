
        //     Scanner scanner = new Scanner(System.in);
            
        //     int testcase = scanner.nextInt();  
            
        //     for (int i = 0; i < testcase; i++) {
        //         int n = scanner.nextInt();  
              
        //        int win=0;
        //        int loose=0;
        //        for(int j=0;j<n;j++)
        //        {
        //         char s=scanner.next().charAt(0);

        //         if(s=='W')
        //         {
        //             win++;
        //         }
        //         else if(s=='L')
        //         {
        //             loose++;
        //         }
        //        }

        //        double half= n/2;




               

        //        if(half<win)
        //        {
        //         System.out.println("W");
        //        }
        //        else if(half<loose)
        //        {
        //         System.out.println("L");

        //        }
        //        else
        //        {
        //         System.out.println("D");
        //        }
        //   }
        import java.util.Scanner;

public class semicolon {

    // Recursive function to compute Fibonacci numbers
    static long fibonacci(int n) {
        if (n == 0) {
            return 0; // Base case: F(0) = 0
        } else if (n == 1) {
            return 1; // Base case: F(1) = 1
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); // Recursive definition
        }
    
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input for the Fibonacci term to compute
        int n = scanner.nextInt(); 

        // Calculate the nth Fibonacci term
        long result = fibonacci(n);

        // Print the result
        System.out.println(result);

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}
      


static long fibonacci(int n)
{
    if(n==0)
    {
        return 0;
    }

    else if(n==1)
    {
        return 1;
    }

    else
    {
        return fibonacci(n-1)+fibonacci(n-2);
    }
}

public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);

    int n=scanner.nextInt();

    long result= fibonacci(n);

    System.out.println(result);
}
