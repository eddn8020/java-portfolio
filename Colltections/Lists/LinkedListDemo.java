import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

// This program includes a list created by the LinkedList class and some methods including, get, set snd remove

public class LinkedListDemo {
    public static void main(String[]args) {
        // adds 2, 4, 6, 8 and 0 to myList
        LinkedList<Integer> myList = new LinkedList<>();
        myList.add(2);
        myList.add(4);
        myList.add(6);
        myList.add(8);
        myList.add(0);

        System.out.println("The original list :" + myList);
        // update the list by replacing the element with index number 4 with the number 10
        myList.set(4, 10);
        System.out.println("The original list :" + myList);
        // retrieve data from the list with the specified index
        myList.get(3);
        System.out.println("The original list :" + myList);
        // remove the element with the specified index from the list
        myList.remove(0);
        System.out.println("The original list :" + myList);


    }
}
