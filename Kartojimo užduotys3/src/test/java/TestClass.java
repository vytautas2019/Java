import lt.v.Main;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestClass {
    @Test
    public  void testuniqueChars(){
        HashSet<String> hash_Set = new HashSet<>();
        hash_Set.add("Geeks");
        Main.uniqueChars(hash_Set);
        assertEquals("G",Main.uniqueChars(hash_Set).get(0));
        assertEquals("e",Main.uniqueChars(hash_Set).get(1));
        assertEquals("k",Main.uniqueChars(hash_Set).get(2));
        assertEquals("s",Main.uniqueChars(hash_Set).get(3));
        assertEquals(4,Main.uniqueChars(hash_Set).size());

    }


}
