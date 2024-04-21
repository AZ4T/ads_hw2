import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {



        MyHeap<Integer> heap = new MyHeap<>();

        heap.insert(10);

        heap.insert(9);

        heap.insert(8);

        heap.insert(7);
        heap.insert(6);

        heap.insert(5);
        heap.insert(4);
        heap.insert(3);
        heap.insert(2);
        heap.insert(1);

        heap.extractMin();

        for (int i = 0; i < heap.size(); i++) {
            System.out.print(heap.get(i) + " ");
        }


    }

    public static <T> void printArray(MyArrayList list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }

    public static <T> void printStack(MyStack stack) {
        while (!stack.isEmpty()) {
            T item = (T) stack.checking();
            System.out.println(item);
        }
    }
}