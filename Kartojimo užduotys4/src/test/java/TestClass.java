import lt.v.Main;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestClass {
    @Test
    public  void testgroupingLettersFirstLineString() throws IOException {
        List<String> stringsLetters = new ArrayList<>();
        stringsLetters.add("a");
        stringsLetters.add("g");
        stringsLetters.add("t");
        stringsLetters.add("y");
        stringsLetters.add("g");
        stringsLetters.add("t");
        Main.groupingLetters(stringsLetters);
        assertEquals("a: 1",as().get(0));
        assertEquals(4,as().size());




    }



    private  List<String> as() throws IOException {

        File file = new File("C:\\Users\\VytautasB\\Desktop\\JP\\Java\\Kartojimo užduotys4\\groupedLetters");
        BufferedReader br = new BufferedReader(new FileReader(file));

       return Files.readAllLines(Paths.get("C:\\Users\\VytautasB\\Desktop\\JP\\Java\\Kartojimo užduotys4\\groupedLetters"));
//
//        String st = null;
//        st = br.readLine();
//        return st;
    }


}
