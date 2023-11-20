public class MyStack<T> {
    private int maxSize;
    private int top;
    private Object[] stackArray;

    public MyStack(int size) {
        maxSize = size;
        stackArray = new Object[maxSize];
        top = -1;
    }

    public void push(T value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value;
        } else {
            System.out.println("Стек переполнен. Невозможно добавить элемент.");
        }
    }

    public T pop() {
        if (top >= 0) {
            T poppedValue = (T) stackArray[top--];
            return poppedValue;
        } else {
            System.out.println("Стек пуст. Невозможно извлечь элемент.");
            return null;
        }
    }

    public T peek() {
        if (top >= 0) {
            T peekedValue = (T) stackArray[top];
            return peekedValue;
        } else {
            System.out.println("Стек пуст. Нет значения на вершине.");
            return null;
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public int getSize(){
        return maxSize;
    }
}