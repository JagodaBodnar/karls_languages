import java.util.*;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public List<String> getLanguages() {
        return languages;
    }

    public boolean isEmpty() {
        return languages.isEmpty();
    }

    public void addLanguage(String language) {
        languages.add(language);
    }

    public void removeLanguage(String language) {
        languages.remove(language);
    }

    public String firstLanguage() {
        return languages.get(0);
    }

    public int count() {
        return languages.toArray().length;
    }

    public boolean containsLanguage(String language) {
       return languages.contains(language);
    }

    public boolean isExciting() {
        return languages.contains("Java") || languages.contains("Kotlin");
    }
}