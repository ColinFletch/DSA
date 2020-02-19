import java.util.Arrays;

public class MinIntHeap {
    private int capacity = 10; //max size
    private int size = 0; //current size

    int[] items = new int[capacity];
    private int getLeftChildIndex(int parentIndex) { return 2 * parentIndex +1; }
    private int getRightChildIndex(int parentIndex) { return 2 * parentIndex +2; }
    private int getParentIndex(int childIndex) {return (childIndex -1) / 2; }

    private boolean hasLeftChild(int index) { return getLeftChildIndex(index) < size; }
    private boolean hasRightChild(int index) { return getRightChildIndex(index) < size; }
    private boolean hasParent(int index) { return getParentIndex(index) >= 0; }

    private int leftchild(int index) { return items[getLeftChildIndex(index)];}
    private int rightChild(int index) { return items[getRightChildIndex(index)];}
    private int parent(int index) { return items[getParentIndex(index)];}

    //swap elements in Array
    private void swap(int indexOne, int IndexTwo) {
        int temp = items[indexOne];
        items[indexOne] = items[IndexTwo];
        items[IndexTwo] = temp;
    }
// Resize array (double) if at capacity.
    private void ensureCapacity() {
        if (size == capacity) {
            items = Arrays.copyOf(items, capacity * 2);
            capacity *= 2;
        }
    }
    // Check Root of Heap (does not remove)
    public int peek() {
        if (size == 0) throw new IllegalStateException();
        return items[0];
    }
    // Remove Top of Heap (first element)
    public int poll() {
        if (size == 0) throw new IllegalStateException();
        int item = items[0];
        items[0] = items[size-1];
        size --;

        return item;
    }
}