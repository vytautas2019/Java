package lt.v;

import com.github.pemistahl.lingua.api.Language;
import com.github.pemistahl.lingua.api.LanguageDetector;
import com.github.pemistahl.lingua.api.LanguageDetectorBuilder;

import java.util.List;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {
        final LanguageDetector detector = LanguageDetectorBuilder.fromAllBuiltInLanguages().build();
        final Language detectedLanguage = detector.detectLanguageOf("Sausi");
        final List<Language> languages = detector.detectLanguagesOf(asList("languages", "are", "awesome"));
        System.out.println(detectedLanguage);

    }
}
