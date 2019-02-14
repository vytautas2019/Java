package lt.v;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(2);


        System.out.println(integersToString(intList));





        }

    public static String integersToString(List<Integer> il) {
        return il.stream()
                .map(o-> (o% 2 == 0) ? o + "e" : o + "o")
                .collect(Collectors.joining(","));
    }
}
