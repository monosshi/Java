public class person {

    int sal;
    String name;
    // person()
    // {
    //     System.out.println("default const");
    // }

    person(int n,String s)
    {
        sal=n;
        name=s;
        System.out.print(sal);
        System.out.print(name);
    }

}
 class Test
    {
    
        public static void main(String[] args) {
            person p = new person(10000,"nahid");

           // System.out.println(p);

        }
    }
