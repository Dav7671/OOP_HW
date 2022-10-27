package example4;

public class Main {
    public static void main(String[] args) {
        DynamicIntegerArray arr = new DynamicIntegerArray();
        arr.addElement(4);
        arr.addElement(87);
        arr.addElement(68);
        arr.addElement(945);
        arr.addElement(42);
        arr.addElement(35);
        arr.addElement(87);
        arr.addElement(9);
        arr.printArray();
        System.out.print(" _____________ ");
        arr.addElement(2,9000);
        arr.printArray();

    }
}
