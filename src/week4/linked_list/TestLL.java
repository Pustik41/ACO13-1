package week4.linked_list;

import java.util.List;

/**
 * Created by gorobec on 18.06.16.
 */
public class TestLL {
    public static void main(String[] args) {

        List list = new MyLinkedList();



        list.add(5);

        int expected = 1;
        int actual = list.size();
        boolean result = actual == expected;

        System.out.printf("Metod add, result %s, actual - %d, expected %d\n", result, actual, expected);

        list.add(15);

        expected = 2;
         actual = list.size();
        result = actual == expected;

        System.out.printf("Metod add, result %s, actual - %d, expected %d\n", result, actual, expected);




        expected = 5;
        actual = (Integer)list.get(3);
        result = actual == expected;

        System.out.printf("Metod get, result %s, actual - %d, expected %d\n", result, actual, expected);

    }
}
