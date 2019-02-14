import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        intList.add(6);
        intList.add(7);
        intList.add(8);
        intList.add(9);

        List<String> stringList = new ArrayList<String>();
    }
    public  String intToString (List <String> in) {
        String sList;
        return sList = in.stream()
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(", "));
    }

}
