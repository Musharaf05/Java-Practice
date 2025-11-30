//Constructor is a special method that is used to initialize the values for variables
//Constructor name should be same as the class name
//Constructor don't have any return type
//Constructor called everytime when you create object for the class
class demo2{
    String name;
    int age;
    //Constructor
    //Default Constructor-which has no parameters
    public demo2(){
        System.out.println("Constructor");
    }
    //Parameterized Constructor-which has parameters
    //Initializing values for the name and age variables
    public demo2(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void changeValues(String name,int age){
        this.name=name;
        this.age=age;
    }
    
}
public class Constructor {
    public static void main(String []args){
        demo2 d1=new demo2();//Call default constructor
        demo2 d2=new demo2();//Call default constructor
        demo2 d3=new demo2("Dane",25);//Call parameterized constructor
        System.out.println(d2.name+":"+ d2.age);
        System.out.println(d3.name+":"+ d3.age);//Print default values for the class
        //changing default values using changeValues() method
        d3.changeValues("John",23);
        System.out.println(d3.name+":"+ d3.age);
    }
}
