import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class T {
    @Test
    public void testbetterWord(){
        Main.betterWord("Geras","Geresnis",(x,y)->x.length() <y.length());
        assertEquals("Geras",Main.betterWord("Geras", "Geresnis",(x,y)->x.length() <y.length()) );
    }
}
