public class Test {
    public static String test(Cat cat) {
        return cat.sound();
    }
    public static void main(String[] args) {
        test(new Cat());
    }
}
