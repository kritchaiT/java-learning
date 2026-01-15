public class OOPDemo {
    public static void main(String[] args) {
        Person p = new Person("Alice", 30);
        System.out.println(p);

        p.setAge(31);
        System.out.println("After birthday: " + p.getAge());
    }
}
