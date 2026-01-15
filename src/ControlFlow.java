public class ControlFlow {
    public static void main(String[] args) {
        int x = 5;
        if (x > 0) {
            System.out.println("x is positive");
        } else {
            System.out.println("x is non-positive");
        }

        System.out.println("for loop");
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }

        System.out.println("switch example");
        String fruit = "apple";
        switch (fruit) {
            case "apple" -> System.out.println("Apple selected");
            case "banana" -> System.out.println("Banana selected");
            default -> System.out.println("Other fruit");
        }
    }
}
