package Before_data_Structures;
import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListTest {
        public static void main(String[] args) {
            ArrayList<String> list = new ArrayList<String>();
            list.add("mazen");
            list.add("mustafa");
            list.add("ahmed");
            System.out.println(list.size());
            System.out.println(list);

            list.add(1,"Kareem");
            System.out.println(list);

            list.set(3,"Ali");
            System.out.println(list);

            list.remove(1);
            list.remove(2);
            System.out.println(list.size());
            System.out.println(list);

        }
    }

