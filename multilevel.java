  //multilevel
class Batch59 {
    String our_note="Note from 59 batch";    
}

class Batch60 extends Batch59 {
    
}

class Batch61 extends Batch60 {

}  
    public class multilevel{
    public static void main(String[] args) {                
        Batch60 note1= new Batch60();
        Batch61 note2 = new Batch61();

         System.out.println("we are batch 60 we got : "+note1.our_note);
         System.out.println("we are batch 61 we got note from batch 60 which they got from: "+note2.our_note);       
       
    }
}
