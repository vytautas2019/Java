package lt.v;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
//        List<String> stringsLetters = new ArrayList<>();
//        stringsLetters.add("a");
//        stringsLetters.add("g");
//        stringsLetters.add("t");
//        stringsLetters.add("y");
//        stringsLetters.add("g");
//        stringsLetters.add("t");
//        groupingLetters(stringsLetters);
//        File file = new File("C:\\Users\\VytautasB\\Desktop\\JP\\Java\\Kartojimo užduotys4\\groupedLetters");
//        BufferedReader br = new BufferedReader(new FileReader(file));
//
//        String st;
//        while ((st = br.readLine()) != null)
//            System.out.println(st);







    }


    public static void groupingLetters(List<String> letters) throws IOException {
        final Map<String, List<String>> groupedLetters = letters.stream()
                .collect(Collectors.groupingBy(letter -> letter));


        final Path newFile = Files.createFile(Paths.get("./groupedLetters"));
        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(newFile)) {
            groupedLetters.forEach((letter, repetitions) -> {
                try {
                    bufferedWriter.write(letter + ": " + repetitions.size());
                    bufferedWriter.newLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        }
    }

}
