//Static Method is used to call the static method without creating object for the method
//We can call static method like this demo.print()(Classname.methodName()) inside main method
//It saves memory because we can call static method without creating object which occupies separate space in memory
//Inside static method only static data can be accessed
class demo{
    static String s="Static variable";
    static void print(){
        System.out.println("Static Method...");
        System.out.println(s);
    }
}
public class StaticMethod {
    public static void main(String []args){
        demo.print();
    }
}