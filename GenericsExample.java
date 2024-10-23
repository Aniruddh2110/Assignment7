/**
 * Description: This example implements a simple generic stack class that allows for storing and retrieving elements of any type, showcasing the use of generics in Java.
 */

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();
        stringStack.push("First");
        stringStack.push("Second");

        System.out.println("Popped: " + stringStack.pop());
        System.out.println("Popped: " + stringStack.pop());
    }
}

class Stack<T> {
    private List<T> elements = new ArrayList<>();

    public void push(T element) {
        elements.add(element);
    }

    public T pop() {
        if (elements.isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }
        return elements.remove(elements.size() - 1);
    }
}
