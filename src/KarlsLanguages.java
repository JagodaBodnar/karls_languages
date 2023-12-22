
public class KarlsLanguages {
    public static void main(String[] args) {

        LanguageList list = new LanguageList();

        System.out.println("---------------------------------------1------------------------------------------------");

        System.out.printf("Language list: %s.%nList is empty: %s%n", list.getLanguages(), list.isEmpty());

        System.out.println("---------------------------------------2------------------------------------------------");

        list.addLanguage("Kotlin");
        list.addLanguage("Python");
        list.addLanguage("Java");
        System.out.printf("Language list: %s.%nList is empty: %s%n", list.getLanguages(), list.isEmpty());

        System.out.println("---------------------------------------3------------------------------------------------");

        list.removeLanguage("Java");
        System.out.printf("Language list: %s.%nList is empty: %s%n", list.getLanguages(), list.isEmpty());

        System.out.println("---------------------------------------4------------------------------------------------");

        System.out.printf("Language list: %s.%nFirst language on the list: %s%n", list.getLanguages(), list.firstLanguage());

        System.out.println("---------------------------------------5------------------------------------------------");

        System.out.printf("Language list: %s.%nFirst language on the list: %s%n", list.getLanguages(), list.count());

        System.out.println("---------------------------------------6------------------------------------------------");
        System.out.printf("Language list: %s.%nDoes it contain Kotlin language: %s%n", list.getLanguages(), list.containsLanguage("Kotlin"));
        System.out.printf("Language list: %s.%nDoes it contain Java language: %s%n", list.getLanguages(), list.containsLanguage("Java"));

        System.out.println("---------------------------------------7------------------------------------------------");
        System.out.printf("Language list: %s.%nDoes it contain Kotlin language: %s%n", list.getLanguages(),  list.isExciting());
        list.removeLanguage("Kotlin");
        System.out.printf("Language list: %s.%nDoes it contain Kotlin language: %s%n", list.getLanguages(),  list.isExciting());

    }
}
