public class Main {

    public static void main(String[] args) {

        int num = 10;
        byte bNum = 20;
        short i = 50;

        long lo = 50000L + (num + bNum + i) * 10;
        //System.out.println(("this is lo value: ") + lo);
        //System.out.println( "this is my bNum:" + bNum);

    }

    static {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("this is  Min float : " + myMinFloatValue);
        System.out.println("this is Max float : " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("this is  Min double : " + myMinDoubleValue);
        System.out.println("this is Max double : " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5.00 / 3.00;
        System.out.println("this is my intValue: " + myIntValue);
        System.out.println("this is floatValue: " + myFloatValue);
        System.out.println("this is double: " + myDoubleValue);
    }
    static{
        double pound = 200d;
        double kilo = 0.45359237d;

        double v = pound * kilo;
        double result= v;
        System.out.println("this is result: " + result);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println("this is pi: " + pi);
        System.out.println("this is another number: " + anotherNumber);
    }
    static {

        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println("this is char string:" + myChar);
        System.out.println("this is my  unicode letter:" + myUnicodeChar);
        char myCopyrightChar = '\u00A9';
        System.out.println("this is my unicode symbol:" + myCopyrightChar);

        
    }
    static {

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverTwentyOne = true;

    }
    static {

        //byte - The byte data type is an 8-bit signed two's complement integer. It has a minimum value of -128 and a maximum value of 127 (inclusive). The byte data type can be useful for saving memory in large arrays,
        // where the memory savings actually matters.

        //short - The Java short keyword is a primitive data type. It is used to declare variables. It can also be used with methods.
        // It can hold a 16-bit signed two's complement integer.

        //int - By default, the int data type is a 32-bit signed two's complement integer, which has a minimum value of -231 and a maximum value of 231-1. In Java SE 8 and later, you can use the int data type to represent an unsigned 32-bit integer,
        // which has a minimum value of 0 and a maximum value of 232-1.

        //long - The long data type is a 64-bit two's complement integer. The signed long has a minimum value of -263 and a maximum value of 263-1. In Java SE 8 and later, you can use the long data type to represent an unsigned 64-bit long,
        // which has a minimum value of 0 and a maximum value of 264-1.

        //float - The Java float keyword is a primitive data type. It is a single-precision 32-bit IEEE 754 floating point. It is used to declare the variables and methods.
        // It represents the fractional numbers.

        //double - Java double is used to represent floating-point numbers. It uses 64 bits to store a variable value and has a range greater than float type.
        // Syntax: // square root variable is declared with a double type

        //char - The char keyword is a data type that is used to store a single character.
        // A char value must be surrounded by single quotes, like 'A' or 'c'.

        //boolean - Boolean is a primitive data type in Java that has two return values.
        // A boolean variable can return either “true” or “false”.

        String myString = "This is my string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more. ";
        System.out.println("myString is equal to  " + myString);
        myString = myString + " \u00A9 2019 ";
        System.out.println("myString is equal to"  +myString);
        String numberString = "250.55";
        numberString = numberString +"49.95";
        System.out.println("this is numberString "+ numberString);


        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is  equal to  " + lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("LastString is equal to " + lastString);

    }
    static {





    }
}
