/*Static variable-It is a variable which is common for all the objects of the class
which means the value of the static variable is same for all objects of the class.
If you change the value of static variable using one object it will change all the object's value of variable(static)
*/
//Static variable can be called like this Mobile.name(Classname.staticVariable) inside the main method
//It can be called or accessed without object creation
class Mobile{
    String brand;
    int price;
    static String name;
    public void show(){
        System.out.println(brand+" : "+price+" : "+name);
    }
}

public class StaticVariable {
    public static void main(String []args){
        Mobile m1=new Mobile();
        m1.brand="Apple";
        m1.price=70000;
        Mobile.name="Smartphone";

        Mobile m2=new Mobile();
        m2.brand="Realme";
        m2.price=30000;
        Mobile.name="Smartphone";

        m1.show();
        m2.show();
    }
}
