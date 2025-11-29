//Encapsulation is a process binding data and code
//Acts like black box and protect data using private keyword
//Public methods acts as interface for accessing private data
class Human{
    //Private data
    private String name="John";
    private int age;
    //Interface for accessing private data
    //Getters
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    //Setter
    public void setAge(int a){
        age=a;
    }
}

public class Encapsulation {
    public static void main(String []args){
        Human h=new Human();
        h.setAge(21);
        System.out.println(h.getName()+":"+h.getAge());
    }
}
