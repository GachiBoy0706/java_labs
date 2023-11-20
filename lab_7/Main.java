public class Main {
    public static void main(String[] args) {
        MyClass a = new MyClass(1);
        MyClass b = new MyClass(2);
        System.out.println("Значения до свапа:\nа = " + a.getValue() + "\nb = " + b.getValue());
        a.swapValues(b);
        System.out.println("Значения после свапа:\nа = " + a.getValue() + "\nb = " + b.getValue());
    }
}