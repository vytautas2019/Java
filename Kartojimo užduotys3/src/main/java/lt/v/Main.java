package lt.v;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        HashSet<String> hash_Set = new HashSet<>();
        hash_Set.add("Geeks");


        System.out.println(hash_Set);
        System.out.println(uniqueChars(hash_Set));


    }
    public static List<String> uniqueChars(HashSet<String> words) {
        return (List<String>) words.stream()
                .flatMap(word -> Arrays.stream(word.split("")))
                .distinct()
                .collect(Collectors.toList());
    }
}
