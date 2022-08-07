public class Main {

    public static void main(String[] args) {

        int num = 10;
        byte bNum = 20;
        short i = 50;

        long lo = 50000L + (num + bNum + i) * 10;
        System.out.println(("this is lo value: ") + lo);

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

        int myIntValue = 5;
        float myFloatValue = 5.25f;
        double myDoubleValue = 7.25d;
        System.out.println("this is my intValue: " + myIntValue);
        System.out.println("this is floatValue: " + myFloatValue);
        System.out.println("this is double: " + myDoubleValue);
    }
}
