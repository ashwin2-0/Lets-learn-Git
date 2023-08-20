import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionDemo {
    public static void main(String[] args) {
        // Creating an ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        // Creating a LinkedList
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Cat");
        linkedList.add("Dog");
        linkedList.add("Elephant");

        // Displaying the initial elements
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        // Adding an element at a specific index
        arrayList.add(1, "Grapes");
        linkedList.add(1, "Lion");

        // Displaying after adding elements
        System.out.println("ArrayList after adding: " + arrayList);
        System.out.println("LinkedList after adding: " + linkedList);

        // Removing an element
        arrayList.remove("Banana");
        linkedList.remove("Dog");

        // Displaying after removing elements
        System.out.println("ArrayList after removing: " + arrayList);
        System.out.println("LinkedList after removing: " + linkedList);

        // Accessing elements using indexes
        System.out.println("Element at index 0 in ArrayList: " + arrayList.get(0));
        System.out.println("Element at index 1 in LinkedList: " + linkedList.get(1));

        // Size of the collections
        System.out.println("Size of ArrayList: " + arrayList.size());
        System.out.println("Size of LinkedList: " + linkedList.size());
    }
}
