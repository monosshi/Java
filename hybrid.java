//hybrid
class Boss{

    int gives_salary=50000;
}

class employee extends Boss{ //Here Employee gets from boss that is single inheritance 

    int h_helper=2000;
    int driver =5000;

}
//Now the driver and house helper both gets from the employee which id hirarchial inheritan
//so together it became hybrid inheritance

class house_helper extends employee{}                                                  
class driver extends employee{}


public class hybrid{
    public static void main(String[] args) {

        employee E=new employee();
        house_helper H=new house_helper();
        driver D=new driver();

        System.out.println("Employee salary : "+E.gives_salary);
        System.out.println("Driver salary : "+D.driver);
        System.out.println("House helper salary : "+H.h_helper);
        
    }
}

