public class DataTypes {
    public static void main(String []args){

        /*
         Variable is a container which holds data in memory during the execution of program
            1. Primitive data types
                a. Integer
                    byte, short, int, long
                b. Point values
                    float, double
                c. Character
                    char
                d. Boolean
                    boolean
            2. Non-Primitive data types
                a. String
                b. Array
                c. Class
                d. Interface
         */
        //  Declaring variables with data types
    //Integer
        byte by=127;//1 byte
        short s=500;//2 bytes
        int num=10;//4 bytes
        long num2=3000000000L;//8 bytes
    //Point values
        float mark=85.7f;//4 bytes
        double marks=90.5;//8 bytes
    //Character
        char c='m';//2 bytes (It can hold only one character,it can be a letter, digit or special character, it should be enclosed in single quotes)
    //Boolean
        boolean b=true;
        System.out.println(by);
        System.out.println(s);
        System.out.println(num);
        System.out.println(num2);
        System.out.println(mark);
        System.out.println(marks);
        System.out.println(c);
        System.out.println(b);
    }
}
