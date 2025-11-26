//Static Method is used to call the static method without creating object for the method
//We can call static method like this demo.print()(Classname.methodName()) inside main method
//It saves memory because we can call static method without creating object which occupies separate space in memory
class demo{
    static void print(){
        System.out.println("Static Method...");
    }
}
public class StaticMethod {
    public static void main(String []args){
        demo.print();
    }
}