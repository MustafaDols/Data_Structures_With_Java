package LinkedList;
import java.util.List;

public class ListSize {
        public static void main(String[] args) {

            List<Integer> myList = List.of(1, 2, 3, 4, 5);
            int size = size(myList);
            System.out.println("Size of the list: " + size);
        }
    public static <T> int size(List<T> l) {
        if (l == null) {
            throw new IllegalArgumentException("List cannot be null");
        }
        return l.size();
    }
    }

