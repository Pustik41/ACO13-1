package week4.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gorobec on 16.06.16.
 */
public class _01GenericAreHelpful {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add(null);
        list.add("Ddd");

        String s = (String)list.get(0);
    }


}
