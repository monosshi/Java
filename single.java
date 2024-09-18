//single
class Mother {  
    int num_of_books=100;
}  

class My_self extends Mother {  
    int my_collection_of_books = 25;
}
    public class single
    {                                                  
    public static void main(String args[]) {  
        My_self Books= new My_self();  
        int new_collection = Books.my_collection_of_books + Books.num_of_books;
        System.out.println("My old collection: " + Books.my_collection_of_books);  
        System.out.println("My new collection: " + new_collection);  
    }  
}  

