public class DataTypes {
    public static void main(String[] args) {
        int i = 42;
        double d = 3.14;
        boolean b = true;
        char c = 'J';

        Integer boxed = i; // autoboxing

        System.out.println("int: " + i);
        System.out.println("double: " + d);
        System.out.println("boolean: " + b);
        System.out.println("char: " + c);
        System.out.println("boxed Integer: " + boxed);
    }
}
