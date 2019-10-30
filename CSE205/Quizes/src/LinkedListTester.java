import java.util.*;
import java.io.*;

public class LinkedListTester
{
    public static void main(String[] args)
    {
        LinkedList list1 = new LinkedList();
        ListIterator iterator = list1.listIterator();

        iterator.add("Apple");
        printList(list1);

        iterator.add("Orange");
        printList(list1);
        iterator.add("Tomato");
        printList(list1);

        iterator = list1.listIterator();
        iterator.next();
        iterator.next();

        iterator.add("Banana");
        printList(list1);
        iterator.next();
        iterator.add("Lemon");
        printList(list1);

        iterator = list1.listIterator();
        iterator.next();
        iterator.remove();

        while (iterator.hasNext())
            System.out.println(iterator.next());
    }

    public static void printList(LinkedList list1)
    {
        ListIterator iterator = list1.listIterator();
        String result = "{ ";
        while(iterator.hasNext())
            result += iterator.next() + " ";
        result += "} ";
        System.out.println(result);
    }
}
