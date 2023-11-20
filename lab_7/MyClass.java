public class MyClass {
    private int value;
    public MyClass(int new_value){
        value = new_value;
    }

    public int getValue() {
        return value;
    }
    public void swapValues(MyClass other){
        int tmp = this.value;
        this.value = other.value;
        other.value = tmp;
    }
}
