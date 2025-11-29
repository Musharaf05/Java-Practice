//Static block is get executed only once when class is loaded into memory
//It executed before constructor
class block{
    block(){
        System.out.println("I am Constructor");
    }
    static{
        System.out.println("Static Block");
        }
}
public class StaticBlock {
    public static void main(String []args){
        block b1=new block();
        block b2=new block();
    }
}
