import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
    public static void main(String[] args) {
        List<Integer> intList = new LinkedList<Integer>();
        intList.add(12);
        intList.add(0);
        intList.add(34);
        intList.add(22);
        intList.add(15);

        intList.add(3,38);
        System.out.println("intList is '" + intList + "'");
        try {
            intList.remove(6);
        }
        catch(Exception e)
        {
            System.out.println("Error occurred removing an item from the list");
            e.printStackTrace();
        }
    }
}
