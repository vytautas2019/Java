import lt.v.Main;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestClass {




    @Test
    public void testintegersToString() {
        List<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(2);
        Main.integersToString(intList);
        assertEquals("1o,2e",Main.integersToString(intList));


    }



}
