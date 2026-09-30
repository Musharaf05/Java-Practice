public class TypeConversion {
    public static void main(String[] args) {
//      Type Conversion is a process of converting one data type value into another data type value
//      In Java, there are two types of type conversion: implicit and explicit
/*
        Implicit Type Conversion (Type Casting):
        In implicit type conversion, the compiler automatically converts a smaller data type to a larger data type.
        This is also known as widening conversion. For example, converting an int to a long or a float to a double.

        Explicit Type Conversion (Type Casting):
        In explicit type conversion, the programmer manually converts a larger data type to a smaller data type.
        But the programmer must be careful while doing this, as it may lead to loss of data.
        This is also known as narrowing conversion. For example, converting a double to an int or a long to a short.
*/
        int a=130;
        long b=a;//Implicit Type Conversion
        System.out.println(b); // Output will be 130 because int can be converted to long without any loss of data

        int num=100;
        float f1=num;//Implicit Type Conversion
        System.out.println(f1); // Output will be 100.0 because int can be converted to float without any loss of data,it adds .0 to the integer value

        double c=12.5;
        int d=(int)c;//Explicit Type Conversion
        System.out.println(d); // Output will be 12 because it truncates the decimal part

        int e=1000;
        byte f=(byte)e;//Explicit Type Conversion
        System.out.println(f); // Output will be -24 because 1000 is out of the range of byte (-128 to 127) so it does 1000 % 256 = -24

    }
}
