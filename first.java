class first {

    public static void main(String[] args) {
      for(int i=1;i<=10;i++)
      {

        System.out.println(i);
        System.out.println("zaman");
        if(i==5)
        {
            continue;   //break and continue
        }
        System.out.println("Monosshi");
      }


      for(int i=1;i<10;i+=2)   // even i=0 and i+=2
                               //for odd will start from i=1 and i+=2
       {
    
        System.out.println(i);
        
      }
    }
}
