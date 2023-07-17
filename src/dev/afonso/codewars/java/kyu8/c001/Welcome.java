package dev.afonso.codewars.java.kyu8.c001;

import java.util.HashMap;
import java.util.Map;

/**
 * Solves the challenge <a href="https://github.com/afonsodemori/codewars-java/blob/main/8kyu.md#8kyu-c001-welcome">Welcome!</a>
 */
public class Welcome {

    public static final String DEFAULT_LANGUAGE = "english";

    public static String greet(String language) {
        Map<String, String> greetings = new HashMap<>(17);
        greetings.put("english", "Welcome");
        greetings.put("czech", "Vitejte");
        greetings.put("danish", "Velkomst");
        greetings.put("dutch", "Welkom");
        greetings.put("estonian", "Tere tulemast");
        greetings.put("finnish", "Tervetuloa");
        greetings.put("flemish", "Welgekomen");
        greetings.put("french", "Bienvenue");
        greetings.put("german", "Willkommen");
        greetings.put("irish", "Failte");
        greetings.put("italian", "Benvenuto");
        greetings.put("latvian", "Gaidits");
        greetings.put("lithuanian", "Laukiamas");
        greetings.put("polish", "Witamy");
        greetings.put("spanish", "Bienvenido");
        greetings.put("swedish", "Valkommen");
        greetings.put("welsh", "Croeso");

        return greetings.containsKey(language) ? greetings.get(language) : greetings.get(DEFAULT_LANGUAGE);
    }
}
