public class Calculator
{
    // Global static/class variable - declared outside methods inside class - so all methods can access
    static int a = 77;
    static int b = 11;

    public static void main(String[] args) {
        addition();
    }
    public static void addition() {

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
    }
}
