public class ExceptionsDemo {
    public static void main(String[] args) {
        try {
            mayThrow(true);
        } catch (MyAppException e) {
            System.out.println("Caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block runs always");
        }
    }

    static void mayThrow(boolean t) throws MyAppException {
        if (t) throw new MyAppException("Something went wrong");
    }
}

class MyAppException extends Exception {
    MyAppException(String msg) { super(msg); }
}
